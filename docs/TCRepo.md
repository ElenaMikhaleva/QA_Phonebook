
# Summary

Exploratory sessions are kept in STD, STR.

## Scenario Test Cases

| ID           | Title                           | Test Type | Level | Component    | Version         | Status                         |
|--------------|---------------------------------|-----------|-------|--------------|-----------------|--------------------------------|
| API_REG_P_01 | Register with Valid Credentials | Positive  | API   | Registration | Details below   | Executed 02/08/25              |
| API_REG_P_02 | Register with Existing Password | Positive  | API   | Registration | Details below   | Not Executed                   |
| API_REG_N_01 | Register with Missing Email     | Negative  | API   | Registration | Details below   | Executed 02/08/25              |
| API_REG_N_02 | Register with Missing Password  | Negative  | API   | Registration | Details below   | Not Executed                   |
| API_REG_N_03 | Register with Invalid Email     | Negative  | API   | Registration | Details below   | Executed 17/08/25              |
| API_REG_N_04 | Register with Invalid Password  | Negative  | API   | Registration | Details below   | Executed 02/08/25              |
| API_REG_N_05 | Register with Duplicate Email   | Negative  | API   | Registration | Details below   | Executed 02/08/25              |
| API_LOG_P_01 | Log in with Registered Email    | Positive  | API   | Login        | Details below   | Executed 03/08/25              |
| API_LOG_N_01 | Log in with Unregistered Email  | Negative  | API   | Login        | Details below   | Executed 03/08/25              |
| API_LOG_N_02 | Log in with Wrong Password      | Negative  | API   | Login        | Details below   | Executed 03/08/25              |
| API_LOG_N_03 | Log in with Missing Email       | Negative  | API   | Login        | High-level only | Not Executed                   |
| API_LOG_N_04 | Log in with Missing Password    | Negative  | API   | Login        | High-level only | Not Executed                   |
| UI_NAV_P_01  | Open Home Page from Navigation  | Positive  | UI    | Navigation   | High-level only | Executed with Navigation Tests |
| UI_NAV_P_02  | Open About Page from Navigation | Positive  | UI    | Navigation   | High-level only | Executed with Navigation Tests |
| UI_NAV_P_03  | Open Login Page from Navigation | Positive  | UI    | Navigation   | High-level only | Executed with Login Tests      |
| UI_REG_P_01  | Register with Valid Credentials | Positive  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_P_02  | Register with Copy-Paste        | Positive  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_N_01  | Register with Missing Email     | Negative  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_N_02  | Register with Missing Password  | Negative  | UI    | Registration | High-level only | Not Executed                   |
| UI_REG_N_03  | Register with All Empty Fields  | Negative  | UI    | Registration | Details below   | Executed 15/08/25              |
| UI_REG_N_04  | Register with Invalid Email     | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_REG_N_05  | Register with Invalid Password  | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_REG_N_06  | Register with Duplicate Email   | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_REG_N_07  | Register with Rapid Clicking    | Negative  | UI    | Registration | Details below   | Executed 17/08/25              |
| UI_LOG_P_01  | Log in with Valid Credentials   | Positive  | UI    | Login        | Details below   | Executed 17/08/25              |
| UI_LOG_P_02  | Log in with with Copy-Paste     | Positive  | UI    | Login        | High-level only | Not Executed                   |
| UI_LOG_P_03  | Log in with with Autofill       | Positive  | UI    | Login        | Details below   | Executed 17/08/25              |
| UI_LOG_N_01  | Log in with Unregistered Email  | Negative  | UI    | Login        | Details below   | Executed 17/08/25              |
| UI_LOG_N_02  | Log in with Missing Email       | Negative  | UI    | Login        | High-level only | Not Executed                   |
| UI_LOG_N_03  | Log in with Missing Password    | Negative  | UI    | Login        | High-level only | Not Executed                   |
| UI_LOG_N_04  | Log in with Rapid Clicking      | Negative  | UI    | Login        | High-level only | Not Executed                   |

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