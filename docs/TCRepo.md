
# Summary

Exploratory sessions are kept in STD, STR.

## Scenario Test Cases

| ID           | Title                                          | Test Type | Level | Component    | Version         | Status                         |
|--------------|------------------------------------------------|-----------|-------|--------------|-----------------|--------------------------------|
| API_REG_P_01 | Register with Valid Credentials                | Positive  | API   | Registration | Details below   | Executed 02/08/25              |
| API_REG_P_02 | Register with Existing Password                | Positive  | API   | Registration | Details below   | Not Executed                   |
| API_REG_N_01 | Register with Missing Email                    | Negative  | API   | Registration | Details below   | Executed 02/08/25              |
| API_REG_N_02 | Register with Missing Password                 | Negative  | API   | Registration | Details below   | Not Executed                   |
| API_REG_N_03 | Register with Invalid Email                    | Negative  | API   | Registration | Details below   | Executed 17/08/25              |
| API_REG_N_04 | Register with Invalid Password                 | Negative  | API   | Registration | Details below   | Executed 02/08/25              |
| API_REG_N_05 | Register with Duplicate Email                  | Negative  | API   | Registration | Details below   | Executed 02/08/25              |
| API_LOG_P_01 | Log in with Registered Email                   | Positive  | API   | Login        | Details below   | Executed 03/08/25              |
| API_LOG_N_01 | Log in with Unregistered Email                 | Negative  | API   | Login        | Details below   | Executed 03/08/25              |
| API_LOG_N_02 | Log in with Wrong Password                     | Negative  | API   | Login        | Details below   | Executed 03/08/25              |
| API_LOG_N_03 | Log in with Missing Email                      | Negative  | API   | Login        | High-level only | Not Executed                   |
| API_LOG_N_04 | Log in with Missing Password                   | Negative  | API   | Login        | High-level only | Not Executed                   |
| UI_NAV_P_01  | Open Home Page from Navigation                 | Positive  | UI    | Navigation   | High-level only | Executed with Navigation Tests |
| UI_NAV_P_02  | Open About Page from Navigation                | Positive  | UI    | Navigation   | High-level only | Executed with Navigation Tests |
| UI_NAV_P_03  | Open Login Page from Navigation                | Positive  | UI    | Navigation   | High-level only | Executed with Login Tests      |
| UI_REG_P_01  | Register with Valid Credentials                | Positive  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_P_02  | Register with Copy-Paste                       | Positive  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_N_01  | Register with Missing Email                    | Negative  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_N_02  | Register with Missing Password                 | Negative  | UI    | Registration | High-level only | Not Executed                   |
| UI_REG_N_03  | Register with All Empty Fields                 | Negative  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_N_04  | Register with Invalid Email                    | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_REG_N_05  | Register with Invalid Password                 | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_REG_N_06  | Register with Duplicate Email                  | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_REG_N_07  | Register with Rapid Clicking                   | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_LOG_P_01  | Log in with Valid Credentials                  | Positive  | UI    | Login        | Details below   | Executed 17/08/25              |
| UI_LOG_P_02  | Log in with with Copy-Paste                    | Positive  | UI    | Login        | High-level only | Not Executed                   |
| UI_LOG_P_03  | Log in with with Autofill                      | Positive  | UI    | Login        | Details below   | Executed 17/08/25              |
| UI_LOG_N_01  | Log in with Unregistered Email                 | Negative  | UI    | Login        | Details below   | Executed 17/08/25              |
| UI_LOG_N_02  | Log in with Missing Email                      | Negative  | UI    | Login        | High-level only | Not Executed                   |
| UI_LOG_N_03  | Log in with Missing Password                   | Negative  | UI    | Login        | High-level only | Not Executed                   |
| UI_LOG_N_04  | Log in with Rapid Clicking                     | Negative  | UI    | Login        | High-level only | Not Executed                   |
| API_ADD_P_01 | Add Contact with Valid Data                    | Positive  | API   | Add Contact  | Details below   | Executed 12/09/25              |
| API_ADD_P_02 | Add Contact with Existing Name                 | Positive  | API   | Add Contact  | Details below   | Executed 12/09/25              |
| API_ADD_P_03 | Add Contact with Valid Name                    | Positive  | API   | Add Contact  | Details below   | Not Executed                   |
| API_ADD_P_04 | Add Contact with Existing Last Name            | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_05 | Add Contact with Valid Last Name               | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_06 | Add Contact with Valid Email                   | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_07 | Add Contact with Existing Address              | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_08 | Add Contact with Valid Address                 | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_09 | Add Contact with Existing Description          | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_10 | Add Contact with Valid Description             | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_11 | Add Contact without Description                | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_P_12 | Add Contact with Valid Phone                   | Positive  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_01 | Add Contact without Authentication             | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_02 | Add Contact with Invalid Token                 | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_03 | Add Contact with Duplicate ID                  | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_04 | Add Contact with Invalid Request Format        | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_05 | Add Contact with Missing Name                  | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_06 | Add Contact with Missing Last Name             | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_07 | Add Contact with Missing Email                 | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_08 | Add Contact with Existing Email                | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_09 | Add Contact with Invalid Email                 | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_10 | Add Contact with Missing Address               | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_11 | Add Contact with Missing Phone                 | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_12 | Add Contact with Existing Phone                | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| API_ADD_N_13 | Add Contact with Invalid Phone                 | Negative  | API   | Add Contact  | High-level only | Not Executed                   |
| UI_ADD_P_01  | Add Contact with Valid Data                    | Positive  | UI    | Add Contact  | High-level only | Not Executed                   |
| UI_ADD_P_02  | Add Contact with Data with Non-English Letters | Positive  | UI    | Add Contact  | High-level only | Not Executed                   |
| UI_ADD_P_03  | Add Contact with Special Characters            | Positive  | UI    | Add Contact  | High-level only | Not Executed                   |
| UI_ADD_P_04  | Add Contact with Copy-Paste Input              | Positive  | UI    | Add Contact  | High-level only | Not Executed                   |
| UI_ADD_N_01  | Add Contact with Missing Fields                | Negative  | UI    | Add Contact  | High-level only | Not Executed                   |

API_ADD_P_03  Add Contact with Valid Name<br>
- with Number
- with Special Character <> (<b>Anna</b>)
- with " ("John")
- with ' ('John')
- with + (John+Smith)
- with apostrophe (O'Connor)
- with hyphen (Anne-Marie)
- with dot (Dr.Smith)
- with ampersand (Jack&Jill)
- with whitespace (Dr Smith)
- with 1 symbol
- non-English (Hebrew)
API_ADD_P_05  Add Contact with Valid Last Name<br>
- with Number
- with Special Character <> (<b>Anna</b>)
- with " ("John")
- with ' ('John')
- with + (John+Smith)
- with apostrophe (O'Connor)
- with hyphen (Anne-Marie)
- with dot (Dr.Smith)
- with at sign (Jack&Jill)
- with whitespace (Dr Smith)
- with 1 symbol
API_ADD_P_06  Add Contact with Valid Email<br>
- 1 char before @
- 1 char after @
API_ADD_P_08  Add Contact with Valid Address<br>
- with Number
- with Special Characters dots (St.Paul)
- with hyphens (12-14 Main St)
- with apostrophe (O'Hara Ave)
- hash (Apt #504)
- slash (Unit 5/12 Elm Rd)
- comma (123 King St, Apt 2B)
- ampersand (Broadway&5th)
- with ""
- with ''
- with () (Suite (North))
- : (Dock 4: back entrance)
- ; (Dock 4; back entrance)
- with 1 symbol
- with 10 symbols
- with 15 symbols
- in Arabic
API_ADD_P_10  Add Contact with Valid Description<br>
- with numbers
- with special characters
- in Hebrew
API_ADD_P_11  Add Contact without Description<br>
- with blank descr
- with null
- with whitespace instead of descr
API_ADD_N_05 Add Contact with Missing Name
- empty
- null
- blank
- whitespace
API_ADD_N_09  Add Contact with Invalid Email<br>
- without @
- with @@
- no char before @
- no char after @
- non-English letters
API_ADD_N_13  Add Contact with invalid Phone<br>
- with letters
- with plus (+15551234567)
- with 9 symbols
- with 16 symbols
- with leading whitespace
- with trailing whitespace
- with internal whitespace
API_ADD_P_12 Add Contact with Valid Phone
- 10 digits (min)
- 15 digits (max)

# Detailed Tests

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

### API_LOG_N_01  Log in with Unregistered Email

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

### API_LOG_N_02 Log in with Registered Email but Incorrect Password

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

### UI_REG_P_01 Register with Valid Credentials

- **Test Type:** UI
- **Component:** Registration
- **Precondition:** home page is opened
- **Steps:**<br>
  1. Click on Login Button in the header
  2. Enter valid email
  3. Enter valid password
  4. Click on Registration Button
- **Expected Result:**
  1. User is registered successfully
  2. User is redirected to Contacts Page
  3. User has no contacts on Contacts Page
  4. User can click on Contacts and Add Buttons in the header (user-only pages)

### UI_REG_P_02 Register with Copy-Paste

- **Test Type:** UI
- **Component:** Registration
- **Precondition:** authentication page is opened
- **Steps:**<br>
  1. Copy valid email from another source
  2. Paste into email field
  3. Copy valid password from another source
  4. Paste into password field
  5. Click on Registration Button
- **Expected Result:** user is registered successfully

### UI_REG_N_01 Register with Missing Email

- **Test Type:** UI
- **Component:** Registration
- **Test Data (Email):**
  1. no email
  2. blank email
  3. whitespace
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter email as in test data
  2. Enter valid password
  3. Click on Registration Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password" (requirement F1)

### UI_REG_N_03 Register with All Empty Fields

- **Test Type:** UI
- **Component:** Registration
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Do not touch any fields
  2. Click on Registration Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password" (requirement F1)

### UI_REG_N_04 Register with Invalid Email

- **Test Type:** UI
- **Component:** Registration
- **Precondition:** login page is opened
- **Test Data (Email):**
  1. woatsignexample.com - without @
  2. почта@example.com - contains Cyrillic characters 
  3. pïppiñtŏk@example.com - contains diacritic characters
- **Steps:**<br>
  1. Enter email as in test data
  2. Enter valid password
  3. Click on Registration Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password" (requirement F1)

### UI_REG_N_05 Register with Invalid Password

- **Test Type:** UI
- **Component:** Registration
- **Precondition:** login page is opened
- **Test Data (Password):**
  1. lowletters7^ - no uppercase letters
  2. UPLETTERS6# - no lowercase letters
  3. NoNumbers^ - no numbers
  4. NoSpecials5 - no special characters
  5. 6Плохо^2! - non-English letters
  6. P@sw0rd - too short (7 symbols)
  7. P@sw0rdRightHere - too long (16 symbols)
- **Steps:**<br>
  1. Enter email as in test data
  2. Enter valid password
  3. Click on Registration Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password" (requirement F1)

### UI_REG_N_06 Register with Duplicate Email

- **Test Type:** UI
- **Component:** Registration
- **Precondition:** user is registered
- **Test Data (Password):**
  1. P@ssw0rd1 - same password
  2. P@ssw0rd2 - new password
- **Steps:**<br>
  1. Enter registered email
  2. Enter password from test data
  3. Click on Registration Button
- **Expected Result:**
  1. Error message "User already exists" (requirement F3)

### UI_REG_N_07 Register with Rapid Clicking

- **Test Type:** UI
- **Component:** Registration
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter email
  2. Enter password
  3. Click on Registration Button twice quickly
- **Expected Result:**
  1. Only one submission is processed, not multiple requests to the backend 
  2. UI remains stable 
  3. User is registered

### UI_LOG_P_01 Log in with Valid Credentials

- **Test Type:** UI
- **Component:** Login
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter valid email (pip.took@contacts.me)
  2. Enter valid password (MerryBestie#2025)
  3. Click on Login Button
- **Expected Result:**
  1. User is logged in 
  2. User is redirected to Contacts Page with contacts created with this account
  3. User can click Contacts and Add Buttons in header

### UI_LOG_P_03 Log in with Autofill

- **Test Type:** UI
- **Component:** Login
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter valid email with autofill
  2. Enter valid password with autofill
  3. Click on Login Button
- **Expected Result:**
  1. User is logged in

### UI_LOG_N_01 Log in with Unregistered Email

- **Test Type:** UI
- **Component:** Login
- **Precondition:** user is not registered
- **Steps:**<br>
  1. Enter valid email (pippin.rush@shiremail.me)
  2. Enter valid password (HurryUp!99)
  3. Click on Login Button
- **Expected Result:**
  1. User is not logged in
  2. Error message "Wrong email or password" (requirement F4)

### API_ADD_P_01 Add Contact with Valid Data

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Steps:**<br>
  1. Send POST request
    ``{
        "id": "1",
        "name": "Merry",
        "lastName": "Brandybuck",
        "email": "merry@buckland.net",
        "phone": "4479123003",
        "address": "Brandy Hall, Buckland",
        "description": "BBF"
      }
    ``
- **Expected Result:**
  1. Response 200 OK 

### API_ADD_P_02 Add Contact with Existing Name

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered, at least one contact in account
- **Steps:**<br>
  1. Send POST request with existing name
     ``{
         "id": "1",
         "name": "Merry",
         "lastName": "Brandybuck",
         "email": "merry@buckland.net",
         "phone": "4479123003",
         "address": "Brandy Hall, Buckland",
         "description": "BBF"
       }
     ``
- **Expected Result:**
  1. Response 200 OK

### API_ADD_P_03 Add Contact with Valid Name

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data (name):**
  1. lower case - frodo
  2. upper case - FRODO
  3. upper and lower case - Frodo
  4. numbers - FrodoThe1
  5. with <> - <b>Frodo</b>
  6. with "" - "Frodo"
  7. with '' - 'Frodo'
  8. with + - Frodo+Sam
  9. with ampersand - Frodo&Sam
  9. with apostrophe - O'Frodo
  10. with hyphen - Frodo-Maura
  11. with dot - Sir.Frodo
  12. with internal whitespace - Mr Frodo
  13. with non-English letters - פרודו
  13. 1 character length - F
- **Steps:**<br>
  1. Send POST request with existing name
     ``{
         "id": "1",
         "name": "<name from test data>",
         "lastName": "Baggins",
         "email": "frodo.baggins@shiremail.me",
         "phone": "5550001111",
         "address": "Bag End, Hobbiton, The Shire",
         "Ring bearer"
       }
     ``
- **Expected Result:**
  1. Response 200 OK