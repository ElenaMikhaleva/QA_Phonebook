# Overview

**STD Identifier:** STD-v2<br>
**Date Created:** 30/07/2025<br>
**Version:** v2.0<br>
All data is example, actual data is generated for each execution.

# Content

1. Summary of TCs<br>
   1.1 Registration API<br>
2. Detailed TCs<br>
   2.1 Registration API<br>
3. Summary of Exploratory Tests<br>
   3.1 Registration API<br>
4. Detailed Exploratory Tests<br>
   4.1 Registration API<br>

# Summary of TCS

## Registration API

### Positive tests

API_REG_P_01   Register with Valid Credentials<br>
API_REG_P_02   Register with existing Password<br>

### Negative tests

API_REG_N_01   Register with Missing Fields<br>
API_REG_N_02   Register with Invalid Email<br>
API_REG_N_03   Register with Invalid Password<br>
API_REG_N_04   Register with Duplicate Email<br>

# Detailed TCs

## Registration API

### API_REG_P_01    Register with Valid Credentials

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Preconditions:** user is not registered
- **Test Data:**
  1. ``{ "username": "pippintook@gmail.com", "password": "#2Breakfast!" }`` - valid credentials
  2. ``{ "username": "pippinmin@gmail.com", "password": "8Symbol-" }`` - min valid length password (8 symbols)
  3. ``{ "username": "pippinmax@gmail.com", "password": "15^SymbolsHere!" }`` - max valid length password (15 symbols)
  4. ``{ "username": "specialpippins@gmail.com", "password": "4Char@$#^&*!" }`` - password with allowed special characters (@$#^&*!)
  5. ``{ "username": "specialpippin@gmail.com", "password": "1Character@" }`` - password with one of allowed special characters (@$#^&*!)
- **Steps:** send POST request for each set of credentials
- **Expected Result:**
  1. API returns 200. (requirements T9, T14, T15, Swagger)
  2. API returns token.
  3. API doesn't return password in body or headers.
  4. Cookies do not contain password.
  5. User is successfully registered.
  6. User can log in with the same credentials.

### API_REG_P_02   Register with existing Password

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Preconditions:** user is registered with different email (password@gmail.com) and same password(P@ssw0rd)
- **Steps:** send POST request
  ``{
    "username": "samepassword@gmail.com",
    "password": "P@ssw0rd"
  }``
- **Expected Result:**
  1. API returns 200.
  2. API returns token.
  3. User is successfully registered.
  4. User can log in with the same credentials

### API_REG_N_01   Register with Missing Fields

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Preconditions:** user is not registered
- **Test Data:**
  1. ``{ "password": "#2Breakfast!" }`` - without email
  2. ``{ "username": null, "password": "#2Breakfast!" }`` - invalid data type of email
  3. ``{ "username": "", "password": "#2Breakfast!" }`` - empty String instead of email
  4. ``{ "username": " ", "password": "#2Breakfast!" }`` - whitespace instead of email
  5. ``{ "username": "passwo@gmail.com" }`` - without password
  6. ``{ "username": "passnull@gmail.com", "password": null }`` - invalid data type of password
  7. ``{ "username": "passempty@gmail.com", "password": "" }`` - empty String instead of password
  8. ``{ "username": "passspace@gmail.com", "password": " " }`` - whitespace instead of password
- **Steps:** send POST request for each email
- **Expected Result:**
  1. API returns 400 (requirement T1, T2, T7, T8, Swagger)
  2. Message '"username": "must not be blank"'.

### API_REG_N_02   Register with Invalid Email

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Preconditions:** user is not registered
- **Test Data (Email):**
  1. woatsigngmail.com - without @
  2. two@atsigns@gmail.com - with two @
  3. @gmail.com - no symbols before @
  4. nodomain@ - no symbols after @
  5. почта@gmail.com - contains Cyrillic characters
  6. pïppiñtŏk@gmail.com - contains diacritic characters
- **Steps:** send POST request
  ``{ "username": "<email>", "password": "#2Breakfast!" }``
- **Expected Result:**
  1. API returns 400 (requirements T3, T4, T5, T6)
  2. Error message

### API_REG_N_03   Register with Invalid Password

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Preconditions:** user is not registered
- **Test Data (Password):**
  1. lowletters7^ - no uppercase letters
  2. UPLETTERS6# - no lowercase letters
  3. NoNumbers^ - no numbers
  4. NoSpecials5 - no special characters
  6. 6Плохо^2! - non-English letters
  7. P@sw0rd - too short (7 symbols)
  8. P@sw0rdRightHere - too long (16 symbols)
- **Steps:** send POST request
  ``{ "username": "<generated email>", "password": "<password>" }``
- **Expected Result:**
  1. API returns 400 (requirements T10, T11, T12, T13, T14)
  2. Error message
- **Notes:**
  - password length must be from 8 to 15 symbols

### API_REG_N_04  Register with Duplicate Email

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Preconditions:** user is registered with email (samecredentials@gmail.com) and password (P@ssw0rd1)
- **Test Data (Password):**
  1. P@ssw0rd1 - same password
  2. P@ssw0rd2 - new password
- **Steps:** send POST request
  ``{ "username": "samecredentials@gmail.com", "password": "<password>" }``
- **Expected Result:**
  1. API returns 409
  2. Error message

# Summary of Exploratory Tests

## Registration API

EXP_API_REG_01 Register with Capitalized Email<br>
EXP_API_REG_02 Register with Long Email<br>
EXP_API_REG_03 Register with Various Emails<br>
EXP_API_REG_04 Register with Various Passwords<br>
EXP_API_REG_05 Register with Invalid Header<br>
EXP_API_REG_06 Register with Malformed JSON Body<br>

# Detailed Exploratory Tests

## Registration API

### EXP_API_REG_01 Register with Capitalized Email

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Purpose:**  investigate whether the API treats email addresses as case-sensitive or case-insensitive, and if consistent login behavior is maintained.
- **Preconditions:** user is not registered
- **Steps:**
   1. send POST request ``{ "username": "upperPippin@gmail.com", "password": "#2Breakfast!" }``
   2. if registration is successful, attempt to log in using:
      - `upperPippin@gmail.com` (original casing)
      - `upperpippin@gmail.com` (lowercase)
      - `UPPERPIPPIN@GMAIL.COM` (uppercase)
   3. attempt to register with different casing (`upperpippin@gmail.com` - lowercase, instead of original)
- **Exploration Focus:**
   * Does registration succeed with capitalized email?
   * Do all login attempts succeed regardless of casing?
   - Are tokens or session results consistent across cases?
   - Are duplicates with different email casings allowed?
- **Notes:**
   - RFC 5321 and 5322 specify that email local parts are technically case-sensitive, but in practice most systems treat them as case-insensitive.

### EXP_API_REG_02 Register with Long Email

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Purpose:** explore how the system handles long email addresses.
- **Preconditions:** user is not registered
- **Test Data:**
  - email 254 characters length
  - email 255 characters length
- **Steps:**
   1. send a POST request to the registration endpoint with an email structured as:
      ```
      {  
          "username": "<email>",  
          "password": "5LongBreakfast!"  
      }
      ```
   2. after registration attempt to log in using the same credentials.
- **Exploration Focus:**
   - Does registration with max-length email succeed?
   - Is the user stored and retrievable afterward?
   - Is login successful with this email?
- **Notes:**
   * RFC 3696 states that the max email length is 254 characters. Local part length can be up to 64 characters, domain length (including dots) can be 189 characters.

### EXP_API_REG_03 Register with Various Emails

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Purpose:** explore how the system handles registration with different emails, including emails with:
   - hyphen placement
   - subdomains
   - dot placement
   - whitespaces placement
   - emoji
   - control characters<br>
  Confirm whether the system accepts and processes these format     s correctly during both registration and login.
- **Preconditions:** user is not registered
- **Test Data (Email):**
  1. pippin@hyphen-hobbiton.com - hyphen in domain
  2. subdomain@hobbiton.shire.com - email with subdomains
  3. nodot@gmailcom - no dot in domain
  4. beforedot@.com - no char before dot in domain
  5. afterdot@gmail. - no char after dot in domain
  6. dot..dot@gmail.com - multiple dots
  7. leadspace@gmail.com - leading whitespace
  8. white space@gmail.com - internal whitespace 
  9. trailspace@gmail.com - trailing whitespace
  10. emo😈ji@gmail.com - emoji
  11. new\nline@gmail.com - new line character
  12. has     tab@gmail.com - tabulation
- **Steps** for each email:
   1. send a POST request
  ``
  {  
      "username": "<email>",  
      "password": "RingBearer42!"  
  }
  ``
   2. after registration attempt to log in using the same credentials.
- **Exploration Focus:**
   - Does registration succeed?
   - Does login succeed afterward with the same credentials?
- **Notes:**
   * RFC 1035 allows hyphens in domain names (except at the start/end of a label)
   * RFC 1035 allows subdomains
   * most API reject email with no dot in domain
   * RFC 1035 states that domain label must contain at least one alphanumeric character before and after the dot
   * RFC 5322 does not allow unescaped whitespaces
   * RFC 5322 does not allow dots in unquoted local-parts of an email address
   * RFC 5322 does not allow control characters (\n, \t)

### EXP_API_REG_04 Register with Various Passwords

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Purpose:** explore how the system handles registration using various passwords, including password with:
  - special characters that are not listed in requirements<br>
  - whitespaces
  - control characters
    Confirm whether the system accepts and processes these formats correctly.
- **Preconditions:** user is not registered
- **Test Data (Password):**
  1. Passw0rd? - no allowed special characters but with not listed special character
  2. P@ssw0rd? - allowed special character and also not listed special character
  3. Pas'"\/<>``;8 - no allowed special characters but with '"\/<>`;
  4. P@s'"\/<>``;8 - allowed special characters and '"\/<>`;
  5. P@ss w0rd - whitespace
  6. P@ss\nw0rd - new line character
  7. P@ss     w0rd - tabulation
- **Steps** for each password:
  1. send a POST request
     ``
     {  
         "username": "<generated email>",  
         "password": "<password>"  
     }
     ``
  2. after registration attempt to log in using the same credentials.
- **Exploration Focus:**
  - Does registration succeed?
  - Does login succeed afterward with the same credentials?
- **Notes:**
  - requirements that one of listed special characters (@$#^&*!) is required in password
  - special characters ('"\/<>`;) can lead to SQL injection, JSON injection, HTML injection, or Cross-Site Scripting (XSS) if input is not properly sanitized or escaped.

### EXP_API_REG_05 Register with Invalid Header

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Purpose:** investigate how the API handles an invalid Content-Type header.
- **Preconditions:** user is not registered
- **Steps**
  1. send POST request
     * Header: ``Content-Type: text/plain``
     * Body: ``{ "username": "wrongheader@gmail.com", "password": "P@ssw0rd" }``
- **Exploration Focus:**
  - Does the API reject non-application/json content types? 
  - What HTTP status code is returned (e.g., 415 Unsupported Media Type)? 
  - Is the error message clear and specific?

### EXP_API_REG_06 Register with Malformed JSON Body

- **Endpoint:** `/v1/user/registration/usernamepassword`
- **Purpose:** examine API behavior when receiving improperly formatted JSON.
- **Preconditions:** user is not registered
- **Steps:** send POST request with malformed JSON (without ',') ``{ "username": "wrongheader@gmail.com" "password": "P@ssw0rd" }``
- **Exploration Focus:**
  - Does the API detect and handle malformed JSON? 
  - What HTTP status code is returned (e.g., 400 Bad Request)? 
  - Does the API provide a meaningful error message?
