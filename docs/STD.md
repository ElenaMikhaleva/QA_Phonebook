# Overview

**STD Identifier:** STD-v4<br>
**Date Created:** 12/08/2025<br>
**Version:** v4.0<br>
All data is example, actual data is generated for each execution.

# Content

1. Summary of TCs<br>
  1.1 Registration API<br>
  1.2 Log in API<br>
2. Detailed TCs<br>
  2.1 Registration API<br>
  2.2 Log in API<br>
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

API_REG_N_01   Register with Missing Email<br>
API_REG_N_02   Register with Missing Password<br>
API_REG_N_03   Register with Invalid Email<br>
API_REG_N_04   Register with Invalid Password<br>
API_REG_N_05   Register with Duplicate Email<br>

## Log in API

Detailed test cases are written not for all tests to avoid duplication.<br>

### Positive tests

API_LOG_P_01  Log in with Registered Email<br>

### Negative tests

API_LOG_N_01  Log in with Unregistered Email<br>
API_LOG_N_02  Log in with Registered Email but Incorrect Password<br>
API_LOG_N_03  Log in with Missing Email<br>
API_LOG_N_04  Log in with Missing Password<br>

# Detailed TCs

### API_REG_P_01    Register with Valid Credentials

- **Endpoint:** registration
- **Preconditions:** user is not registered
- **Test Data:**
  1. ``{ "username": "pippintook@example.com", "password": "#2Breakfast!" }`` - valid credentials
  2. ``{ "username": "pippinmin@example.com", "password": "8Symbol-" }`` - min valid length password (8 symbols)
  3. ``{ "username": "pippinmax@example.com", "password": "15^SymbolsHere!" }`` - max valid length password (15 symbols)
  4. ``{ "username": "specialpippins@example.com", "password": "4Char@$#^&*!" }`` - password with allowed special characters (@$#^&*!)
  5. ``{ "username": "specialpippin@example.com", "password": "1Character@" }`` - password with one of allowed special characters (@$#^&*!)
- **Steps:** send POST request for each set of credentials
- **Expected Result:**
  1. API returns 200. (requirements T9, T14, T15, Swagger)
  2. API returns token.
  3. API doesn't return password.
  4. User is successfully registered.
  5. User can log in with the same credentials.

### API_REG_P_02   Register with existing Password

- **Endpoint:** registration
- **Preconditions:** user is registered with different email (password@example.com) and same password(P@ssw0rd)
- **Steps:** send POST request
  ``{
    "username": "samepassword@example.com",
    "password": "P@ssw0rd"
  }``
- **Expected Result:**
  1. API returns 200.
  2. API returns token.
  3. User is successfully registered.
  4. User can log in with the same credentials

### API_REG_N_01   Register with Missing Email

- **Endpoint:** registration
- **Preconditions:** user is not registered
  - **Test Data:**
    1. ``{ "password": "#2Breakfast!" }`` - without email
    2. ``{ "username": null, "password": "#2Breakfast!" }`` - invalid data type of email
    3. ``{ "username": "", "password": "#2Breakfast!" }`` - empty String instead of email
    4. ``{ "username": " ", "password": "#2Breakfast!" }`` - whitespace instead of email
- **Steps:** send POST request for each email
- **Expected Result:**
  1. API returns 400 (requirement T1, T2, Swagger)
  2. Message '"username": "must not be blank"'.

### API_REG_N_02   Register with Missing Password

- **Endpoint:** registration
- **Preconditions:** user is not registered
- **Test Data:**
  1. ``{ "username": "passwo@example.com" }`` - without password
  2. ``{ "username": "passnull@example.com", "password": null }`` - invalid data type of password
  3. ``{ "username": "passempty@example.com", "password": "" }`` - empty String instead of password
  4. ``{ "username": "passspace@example.com", "password": " " }`` - whitespace instead of password
- **Steps:** send POST request for each email
- **Expected Result:**
  1. API returns 400 (requirement T7, T8, Swagger)
  2. Message '"password": "must not be blank"'.

### API_REG_N_03   Register with Invalid Email

- **Endpoint:** registration
- **Preconditions:** user is not registered
- **Test Data (Email):**
  1. woatsignexample.com - without @
  2. two@atsigns@example.com - with two @
  3. @example.com - no symbols before @
  4. nodomain@ - no symbols after @
  5. почта@example.com - contains Cyrillic characters
  6. pïppiñtŏk@example.com - contains diacritic characters
- **Steps:** send POST request
  ``{ "username": "<email>", "password": "#2Breakfast!" }``
- **Expected Result:**
  1. API returns 400 (requirements T3, T4, T5, T6)
  2. Error message

### API_REG_N_04   Register with Invalid Password

- **Endpoint:** registration
- **Preconditions:** user is not registered
- **Test Data (Password):**
  1. lowletters7^ - no uppercase letters
  2. UPLETTERS6# - no lowercase letters
  3. NoNumbers^ - no numbers
  4. NoSpecials5 - no special characters
  5. 6Плохо^2! - non-English letters
  6. P@sw0rd - too short (7 symbols)
  7. P@sw0rdRightHere - too long (16 symbols)
- **Steps:** send POST request
  ``{ "username": "<generated email>", "password": "<password>" }``
- **Expected Result:**
  1. API returns 400 (requirements T10, T11, T12, T13, T14)
  2. Error message
- **Notes:**
  - password length must be from 8 to 15 symbols

### API_REG_N_05  Register with Duplicate Email

- **Endpoint:** registration
- **Preconditions:** user is registered with the same email (samecredentials@example.com) and password (P@ssw0rd1)
- **Test Data (Password):**
  1. P@ssw0rd1 - same password
  2. P@ssw0rd2 - new password
- **Steps:** send POST request
  ``{ "username": "samecredentials@example.com", "password": "<password>" }``
- **Expected Result:**
  1. API returns 409 (Swagger)
  2. Body with "message" field type Object
  3. Error message "User already exists"

### API_LOG_P_01  Log in with Registered Email

- **Endpoint:** log in
- **Preconditions:** User is registered with email pippinlogin@test.com, password #0Breakfast!
- **Steps:**<br>
  1. Send POST request
    ``{
      "username": "pippinlogin@test.com",
      "password": "#0Breakfast!"
    }``
- **Expected Result:**
  1. API returns 200
  2. API returns token
  3. API doesn't return password in body or headers.
  
## API_LOG_N_01  Log in with Unregistered Email

- **Endpoint:** log in
- **Steps:**<br>
  1. Send POST request
    ``{
      "username": "nonexisting@test.com",
      "password": "#0Breakfast!"
    }``
- **Expected Result:**
  1. API returns 401
  2. Error message "Login or Password incorrect"

## API_LOG_N_02 Log in with Registered Email but Incorrect Password

- **Endpoint:** log in
- **Preconditions:** User is registered with email wrongpassword@test.com, password #0Breakfast!
- **Steps:**<br>
  1. Send POST request
     ``{
       "username": "wrongpassword@test.com",
       "password": "#1Breakfast!"
     }``
- **Expected Result:**
  1. API returns 401
  2. Error message

# Summary of Exploratory Tests

Detailed exploratory tests are written not for all tests to avoid duplication.

## Registration API

EXP_API_REG_01 Register with Capitalized Email<br>
EXP_API_REG_02 Register with Long Email<br>
EXP_API_REG_03 Register with Various Emails<br>
EXP_API_REG_04 Register with Various Passwords<br>
EXP_API_REG_05 Register with Invalid Header<br>
EXP_API_REG_06 Register with Malformed JSON Body<br>

# Detailed Exploratory Tests

### EXP_API_REG_01 Register with Capitalized Email

- **Endpoint:** registration
- **Purpose:**  investigate whether the API treats email addresses as case-sensitive or case-insensitive, and if consistent login behavior is maintained.
- **Preconditions:** user is not registered
- **Steps:**
  1. send POST request ``{ "username": "upperPippin@example.com", "password": "#2Breakfast!" }``
  2. attempt to log in with
     1. `upperPippin@example.com` (original casing)
     2. `Upperpippin@example.com` (different casing)
  3. if registration is successful, attempt to register using:
     1. `upperpippin@example.com` (lowercase)
     2. `UPPERPIPPIN@example.com` (uppercase)
   
- **Exploration Focus:**
  - Are duplicates with different email casings allowed? 
  - Do all login attempts succeed regardless of casing? 
  - Are tokens or session results consistent across cases?
- **Notes:**
   - RFC 5321 and 5322 specify that email local parts are technically case-sensitive, but in practice most systems treat them as case-insensitive.

### EXP_API_REG_02 Register with Long Email

- **Endpoint:** registration
- **Purpose:** explore how the system handles long email addresses.
- **Preconditions:** user is not registered
- **Test Data:**
  1. email 254 characters length 
  2. email 255 characters length
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

- **Endpoint:** registration
- **Purpose:** explore how the system handles registration with different emails, including emails with:
   - hyphen placement
   - subdomains
   - dot placement
   - whitespaces placement
   - emoji
   - control characters<br>
  Confirm whether the system accepts and processes these formats correctly during both registration and login.
- **Preconditions:** user is not registered
- **Test Data (Email):**
  1. pippin@hyphen-hobbiton.com - hyphen in domain
  2. subdomain@hobbiton.shire.com - email with subdomains
  3. nodot@examplecom - no dot in domain
  4. beforedot@.com - no char before dot in domain
  5. afterdot@example. - no char after dot in domain
  6. dot..dot@example.com - multiple dots
  7. leadspace@example.com - leading whitespace
  8. white space@example.com - internal whitespace 
  9. trailspace@example.com - trailing whitespace
  10. emo😈ji@example.com - emoji
  11. new\nline@example.com - new line character
  12. has     tab@example.com - tabulation
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

- **Endpoint:** registration
- **Purpose:** explore how the system handles registration using various passwords, including password with:
  - special characters that are not listed in requirements<br>
  - whitespaces
  - control characters
    Confirm whether the system accepts and processes these formats correctly.
- **Preconditions:** user is not registered
- **Test Data (Password):**
  1. P@ssw0rd? - allowed special character and also not listed special character
  2. P@s'"\/<>``;8 - allowed special characters and '"\/<>`;
  3. P@ss w0rd - whitespace
  4. P@ss\nw0rd - new line character
  5. P@ss     w0rd - tabulation
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

- **Endpoint:** registration
- **Purpose:** investigate how the API handles an invalid Content-Type header.
- **Preconditions:** user is not registered
- **Steps**
  1. send POST request
     * Header: ``Content-Type: text/plain``
     * Body: ``{ "username": "wrongheader@example.com", "password": "P@ssw0rd" }``
- **Exploration Focus:**
  - Does the API reject non-application/json content types? 
  - What HTTP status code is returned (e.g., 415 Unsupported Media Type)? 
  - Is the error message clear and specific?

### EXP_API_REG_06 Register with Malformed JSON Body

- **Endpoint:** registration
- **Purpose:** examine API behavior when receiving improperly formatted JSON.
- **Preconditions:** user is not registered
- **Steps:** send POST request with malformed JSON (without comma) ``{ "username": "wrongheader@example.com" "password": "P@ssw0rd" }``
- **Exploration Focus:**
  - Does the API detect and handle malformed JSON? 
  - What HTTP status code is returned (e.g., 400 Bad Request)? 
  - Does the API provide a meaningful error message?

