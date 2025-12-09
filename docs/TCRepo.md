
# Summary

Exploratory sessions are kept in STD, STR.

## Scenario Test Cases

| ID            | Title                                                  | Test Type | Level           | Component    | Version         | Status            |
|---------------|--------------------------------------------------------|-----------|-----------------|--------------|-----------------|-------------------|
| API_REG_P_01  | Register with Valid Credentials                        | Positive  | API             | Registration | Details below   | Executed 02/08/25 |
| API_REG_N_01  | Register with Missing Email                            | Negative  | API             | Registration | Details below   | Executed 02/08/25 |
| API_REG_N_02  | Register with Missing Password                         | Negative  | API             | Registration | Details below   | Executed 09/12/25 |
| API_REG_N_03  | Register with Invalid Email                            | Negative  | API             | Registration | Details below   | Executed 17/08/25 |
| API_REG_N_04  | Register with Invalid Password                         | Negative  | API             | Registration | Details below   | Executed 02/08/25 |
| API_REG_N_05  | Register with Duplicate Email                          | Negative  | API             | Registration | Details below   | Executed 02/08/25 |
| API_LOG_P_01  | Log in with Registered Email                           | Positive  | API             | Login        | Details below   | Executed 03/08/25 |
| API_LOG_N_01  | Log in with Unregistered Email                         | Negative  | API             | Login        | Details below   | Executed 03/08/25 |
| API_LOG_N_02  | Log in with Wrong Password                             | Negative  | API             | Login        | Details below   | Executed 03/08/25 |
| API_LOG_N_03  | Log in with Missing Email                              | Negative  | API             | Login        | Details below   | Executed 02/11/25 |
| API_LOG_N_04  | Log in with Missing Password                           | Negative  | API             | Login        | Details below   | Executed 03/11/25 |
| UI_NAV_P_01   | Open Home Page from Navigation                         | Positive  | UI              | Navigation   | High-level only | Executed 03/08/25 |
| UI_NAV_P_02   | Open About Page from Navigation                        | Positive  | UI              | Navigation   | High-level only | Executed 03/08/25 |
| UI_NAV_P_03   | Open Login Page from Navigation                        | Positive  | UI              | Navigation   | High-level only | Executed 17/08/25 |
| UI_REG_P_01   | Register with Valid Credentials                        | Positive  | UI              | Registration | Details below   | Executed 15/08/25 |
| UI_REG_P_02   | Register with Copy-Paste                               | Positive  | UI              | Registration | Details below   | Executed 15/08/25 |
| UI_REG_N_01   | Register with Missing Email                            | Negative  | UI              | Registration | Details below   | Executed 15/08/25 |
| UI_REG_N_02   | Register with Missing Password                         | Negative  | UI              | Registration | Details below   | Executed 03/11/25 |
| UI_REG_N_03   | Register with All Empty Fields                         | Negative  | UI              | Registration | Details below   | Executed 15/08/25 |
| UI_REG_N_04   | Register with Invalid Email                            | Negative  | UI              | Registration | Details below   | Executed 17/08/25 |
| UI_REG_N_05   | Register with Invalid Password                         | Negative  | UI              | Registration | Details below   | Executed 17/08/25 |
| UI_REG_N_06   | Register with Duplicate Email                          | Negative  | UI              | Registration | Details below   | Executed 17/08/25 |
| UI_REG_N_07   | Register with Rapid Clicking                           | Negative  | UI              | Registration | Details below   | Executed 17/08/25 |
| UI_LOG_P_01   | Log in with Valid Credentials                          | Positive  | UI              | Login        | Details below   | Executed 17/08/25 |
| UI_LOG_P_02   | Log in with with Copy-Paste                            | Positive  | UI              | Login        | Details below   | Executed 05/11/25 |
| UI_LOG_P_03   | Log in with with Autofill                              | Positive  | UI              | Login        | Details below   | Executed 17/08/25 |
| UI_LOG_N_01   | Log in with Unregistered Email                         | Negative  | UI              | Login        | Details below   | Executed 17/08/25 |
| UI_LOG_N_02   | Log in with Missing Email                              | Negative  | UI              | Login        | Details below   | Executed 05/11/25 |
| UI_LOG_N_03   | Log in with Missing Password                           | Negative  | UI              | Login        | Details below   | Executed 05/11/25 |
| UI_LOG_N_04   | Log in with Rapid Clicking                             | Negative  | UI              | Login        | Details below   | Executed 05/11/25 |
| API_ADD_P_01  | Add Contact with Valid Data                            | Positive  | API             | Add Contact  | Details below   | Executed 12/09/25 |
| API_ADD_P_02  | Add Contact with Existing Name                         | Positive  | API             | Add Contact  | Details below   | Executed 12/09/25 |
| API_ADD_P_03  | Add Contact with Valid Name                            | Positive  | API             | Add Contact  | Details below   | Executed 14/09/25 |
| API_ADD_P_04  | Add Contact with Existing Last Name                    | Positive  | API             | Add Contact  | Details below   | Executed 05/11/25 |
| API_ADD_P_05  | Add Contact with Valid Last Name                       | Positive  | API             | Add Contact  | Details below   | Executed 05/11/25 |
| API_ADD_P_06  | Add Contact with Valid Email                           | Positive  | API             | Add Contact  | Details below   | Executed 30/11/25 |
| API_ADD_P_07  | Add Contact with Existing Address                      | Positive  | API             | Add Contact  | Details below   | Executed 30/11/25 |
| API_ADD_P_08  | Add Contact with Valid Address                         | Positive  | API             | Add Contact  | Details below   | Executed 14/09/25 |
| API_ADD_P_09  | Add Contact with Existing Description                  | Positive  | API             | Add Contact  | Details below   | Executed 30/11/25 |
| API_ADD_P_10  | Add Contact with Valid Description                     | Positive  | API             | Add Contact  | Details below   | Executed 30/11/25 |
| API_ADD_P_11  | Add Contact without Unrequired Fields                  | Positive  | API             | Add Contact  | Details below   | Executed 15/09/25 |
| API_ADD_P_12  | Add Contact with Valid Phone                           | Positive  | API             | Add Contact  | Details below   | Executed 30/11/25 |
| API_ADD_N_01  | Add Contact without Authentication                     | Negative  | API             | Add Contact  | Details below   | Executed 15/09/25 |
| API_ADD_N_02  | Add Contact with Invalid Token                         | Negative  | API             | Add Contact  | Details below   | Executed 19/09/25 |
| API_ADD_N_021 | Add Contact with Outdated Token                        | Negative  | API             | Add Contact  | Details below   | Executed 19/09/25 |
| API_ADD_N_04  | Add Contact with Invalid Request Format                | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_041 | Add Contact with Invalid Content-Type Header           | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_042 | Add Contact with Invalid Cache-Control Header          | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_05  | Add Contact with Missing Name                          | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_06  | Add Contact with Missing Last Name                     | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_07  | Add Contact with Missing Email                         | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_08  | Add Contact with Existing Email                        | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_09  | Add Contact with Invalid Email                         | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_10  | Add Contact with Missing Address                       | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_11  | Add Contact with Missing Phone                         | Negative  | API             | Add Contact  | Details below   | Executed 09/12/25 |
| API_ADD_N_12  | Add Contact with Existing Phone                        | Negative  | API             | Add Contact  | Details below   | Executed 30/11/25 |
| API_ADD_N_13  | Add Contact with Invalid Phone                         | Negative  | API             | Add Contact  | Details below   | Executed 19/09/25 |
| API_ADD_N_14  | Add Contact with Invalid Description                   | Negative  | API             | Add Contact  | Details below   | Executed 19/09/25 |
| UI_ADD_P_01   | Add Contact with Valid Data                            | Positive  | UI              | Add Contact  | Details below   | Executed 20/09/25 |
| UI_ADD_P_02   | Add Contact with Non-English Letters                   | Positive  | UI              | Add Contact  | Details below   | Executed 20/09/25 |
| UI_ADD_P_03   | Add Contact with Special Characters                    | Positive  | UI              | Add Contact  | Details below   | Executed 20/09/25 |
| UI_ADD_P_04   | Add Contact with Copy-Paste                            | Positive  | UI              | Add Contact  | Details below   | Executed 20/09/25 |
| UI_ADD_N_01   | Add Contact with Empty Required Fields                 | Negative  | UI              | Add Contact  | Details below   | Executed 20/09/25 |
| UI_ADD_N_02   | Add Contact with Blank Required Fields                 | Negative  | UI              | Add Contact  | Details below   | Executed 20/09/25 |
| INT_SYS_N_01  | Lost Connection While Filling Forms                    | Negative  | Interruption    | System       | Details below   | Executed 02/11/25 |
| INT_SYS_N_02  | Page Refreshed While Filling Forms                     | Negative  | Interruption    | System       | Details below   | Executed 02/11/25 |
| INT_SYS_N_03  | Behavior with Browser Back and Forward Buttons         | Negative  | Interruption    | System       | Details below   | Executed 02/11/25 |
| MOB_SYS_P_04  | Install App                                            | Positive  | Mob Smoke       | System       | Details below   | Executed 03/12/25 |
| MOB_NAV_P_01  | Open Home Screen                                       | Positive  | Mob UI          | Navigation   | High-level only | Executed 30/11/25 |
| MOB_NAV_P_02  | Open Login Screen                                      | Positive  | Mob UI          | Navigation   | High-level only | Executed 30/11/25 |
| MOB_REG_P_01  | Register with Valid Credentials                        | Positive  | Mob UI          | Registration | Details below   | Executed 30/11/25 |
| MOB_REG_N_01  | Register with Missing Email                            | Negative  | Mob UI          | Registration | Details below   | Executed 30/11/25 |
| MOB_REG_N_02  | Register with Invalid Password                         | Negative  | Mob UI          | Registration | Details below   | Executed 02/12/25 |
| MOB_LOG_P_01  | Log in with Valid Credentials                          | Positive  | Mob UI          | Login        | Details below   | Executed 02/12/25 |
| MOB_LOG_P_02  | Log in into Account Created on Web on Mobile           | Positive  | Synchronization | Login        | Details below   | Executed 02/12/25 |
| MOB_LOG_N_01  | Log in with Unregistered Email                         | Negative  | Mob UI          | Login        | Details below   | Executed 02/12/25 |
| MOB_ADD_P_02  | Add Contact with Non-English Letters in Allowed fields | Positive  | Mob UI          | Add Contact  | Details below   | Executed 02/12/25 |
| MOB_ADD_P_03  | Add Contact with Special Characters                    | Positive  | Mob UI          | Add Contact  | Details below   | Executed 02/12/25 |
| MOB_SYS_P_02  | Multiple Instances Work on Same Data                   | Positive  | Synchronization | System       | Details below   | Executed 03/12/25 |
| MOB_SYS_P_03  | App Handles Repeated Add/Delete Cycles                 | Positive  | Stability       | System       | Details below   | Executed 03/12/25 |
| MOB_SYS_P_05  | Rotate device in each screen                           | Positive  | Compatibility   | System       | Details below   | Executed 03/12/25 |
| MOB_SYS_P_08  | App Compatibility Across Devices                       | Positive  | Compatibility   | System       | Details below   | Executed 04/12/25 |
| MOB_SYS_P_09  | Behavior With Different Network Types                  | Positive  | Compatibility   | System       | Details below   | Executed 04/12/25 |
| MOB_SYS_N_01  | Send App to Background Mid-Action                      | Negative  | Interruption    | System       | Details below   | Executed 04/12/25 |
| MOB_SYS_N_02  | Turn off the Screen Mid-Action                         | Negative  | Interruption    | System       | Details below   | Executed 04/12/25 |
| MOB_SYS_N_03  | Lost Connection Mid-Action                             | Negative  | Interruption    | System       | Details below   | Executed 04/12/25 |
| MOB_SYS_N_04  | Low battery                                            | Negative  | Interruption    | System       | Details below   | Executed 04/12/25 |
| MOB_SYS_N_05  | Delete App                                             | Negative  | Installability  | System       | High-level only | Not Executed      |
| MOB_ACC_P_01  | Screen Reader Reads Labels                             | Positive  | Mob UI          | System       | Details below   | Executed 04/12/25 |

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
  ``{ "username": "<email>", "password": "<password from test data>" }``
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

### API_LOG_N_03 Log in with Missing Email

- **Endpoint:** login
- **Preconditions:** user is registered
- **Test Data:**
  1. ``{ "password": "#2Breakfast!" }`` - without email
  2. ``{ "username": null, "password": "#2Breakfast!" }`` - invalid data type of email
  3. ``{ "username": "", "password": "#2Breakfast!" }`` - empty String instead of email
  4. ``{ "username": " ", "password": "#2Breakfast!" }`` - whitespace instead of email
- **Steps:** send POST request for each email
- **Expected Result:**
  1. API returns 401 (requirement T2, Swagger)
  2. Message '"username": "must not be blank"'.

### API_LOG_N_04 Log in with Missing Password

- **Endpoint:** login
- **Preconditions:** user is registered
- **Test Data:**
  1. ``{ "username": "passwo@example.com" }`` - without password
  2. ``{ "username": "passnull@example.com", "password": null }`` - invalid data type of password
  3. ``{ "username": "passempty@example.com", "password": "" }`` - empty String instead of password
  4. ``{ "username": "passspace@example.com", "password": " " }`` - whitespace instead of password
- **Steps:** send POST request for each email
- **Expected Result:**
  1. API returns 401 (requirement T8, Swagger)
  2. Message '"password": "must not be blank"'.

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

### UI_REG_N_02 Register with Missing Password

- **Test Type:** UI
- **Component:** Registration
- **Test Data (password):**
  1. no password
  2. blank password
  3. whitespace
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter email
  2. Enter password  as in test data
  3. Click on Login Button
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
  1. Enter email
  2. Enter password from test data
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

### UI_LOG_P_02 Log in with Copy-Paste

- **Test Type:** UI
- **Component:** Login
- **Precondition:** authentication page is opened
- **Steps:**<br>
  1. Copy valid email from another source
  2. Paste into email field
  3. Copy valid password from another source
  4. Paste into password field
  5. Click on Login Button
- **Expected Result:** user is registered successfully

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

### UI_LOG_N_02 Log in with Missing Email

- **Test Type:** UI
- **Component:** Login
- **Test Data (Email):**
  1. no email
  2. blank email
  3. whitespace
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter email as in test data
  2. Enter valid password
  3. Click on Login Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password" (requirement F2)

### UI_LOG_N_03 Log in with Missing Password

- **Test Type:** UI
- **Component:** Login
- **Test Data (password):**
  1. no password
  2. blank password
  3. whitespace
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter password as in test data
  2. Enter valid password
  3. Click on Login Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password" (requirement F2)

### UI_LOG_N_04 Log in with Rapid Clicking

- **Test Type:** UI
- **Component:** Login
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter email
  2. Enter password
  3. Click on Login Button twice quickly
- **Expected Result:**
  1. Only one submission is processed, not multiple requests to the backend
  2. UI remains stable
  3. User is logged in

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
  10. with comma - Frodo,Sam
  11. with hyphen - Frodo-Maura
  12. with apostrophe - O'Frodo
  13. with dot - Sir.Frodo
  14. with internal whitespace - Mr Frodo
  15. with non-English letters - פרודו
  16. 1 character length - F
- **Steps:**<br>
  1. Send POST request with valid name
     ``{
         "id": "1",
         "name": "<name from test data>",
         "lastName": "Baggins",
         "email": "frodo.baggins@shiremail.me",
         "phone": "5550001111",
         "address": "Bag End, Hobbiton, The Shire",
         "description": "Ring bearer"
       }
     ``
- **Expected Result:**
  1. Response 200 OK

### API_ADD_P_04 Add Contact with Existing Last Name

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered, at least one contact in account
- **Steps:**<br>
  1. Send POST request with existing last name, same as of already created contact
     ``{
         "id": "1",
         "name": "Merry",
         "lastName": "<name of another contact>",
         "email": "merry@buckland.net",
         "phone": "4479123003",
         "address": "Brandy Hall, Buckland",
         "description": "BBF"
       }
     ``
- **Expected Result:**
  1. Response 200 OK
  2. Contact is added

### API_ADD_P_05 Add Contact with Valid Last Name

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data (last name):**
  1. lower case - baggins
  2. upper case - BAGGINS
  3. upper and lower case - Baggins
  4. numbers - 333
  5. with <> - <b>Baggins</b>
  6. with "" - "Baggins"
  7. with '' - 'Baggins'
  8. with + - Baggins+Gamgee
  9. with ampersand - Baggins&Gamgee
  10. with comma - Baggins,Gamgee
  11. with hyphen - Baggins-of-Backend
  12. with apostrophe - O'Baggins
  13. with dot - Sir.Baggins
  14. with internal whitespace - Mr Baggins
  15. with non-English letters - Бэггинс
  16. 1 character length - B
- **Steps:**<br>
  1. Send POST request with valid last name
     ``{
         "id": "1",
         "name": "Frodo",
         "lastName": "<String from test data>",
         "email": "frodo.baggins@shiremail.me",
         "phone": "5550001111",
         "address": "Bag End, Hobbiton, The Shire",
         "description": "Ring bearer"
       }
     ``
- **Expected Result:**
  1. Response 200 OK
  2. Contact is added

### API_ADD_P_06 Add Contact with Valid Email

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data (email):**
  1. with dot in username - firstname.lastname@example.com 
  2. with dot in domain - email@subdomain.example.com 
  3. with special characters in username - firstname-lastname@example.com 
  4. with numbers in username - 1234567890@example.com
- **Steps:**<br>
  1. Send POST request
     ``{
         "id": "1",
         "name": "Sam",
         "lastName": "Gamgee",
         "email": "<email from data sets>",
         "phone": "4479123003",
         "address": "Sheer",
         "description": "The Stouthearted"
       }
     ``
- **Expected Result:**
  1. Response 200 OK
  2. Contact is added

### API_ADD_P_07 Add Contact with Existing Address

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered, at least one contact in account
- **Steps:**<br>
  1. Send POST request with existing address, same as of already created contact
     ``{
         "id": "1",
         "name": "Merry",
         "lastName": "Brandybuck",
         "email": "merry@buckland.net",
         "phone": "4479123003",
         "address": "<address of another contact>",
         "description": "BBF"
       }
     ``
- **Expected Result:**
  1. Response 200 OK
  2. Contact is added

### API_ADD_P_08  Add Contact with Valid Address

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data (address):**
  1. lower case - bree
  2. upper case - LONELY MOUNTAIN
  3. lower and upper case - Treehouse, Mirkwood Forest
  4. numbers - Guard Post 1, Minas Tirith
  5. dot - St.Moria
  6. comma - Cirith Ungol, Mordor
  7. hyphens - Esgaroth, Long-Lake
  8. apostrophe - Dwarves’ Quarters, Erebor
  9. hash - Strider’s Inn Room #12, Bree
  10. slash - 5/12 Black Gate Plaza, Minas Morgul
  11. ampersand - White Tower & Steward’s Office, Minas Tirith
  12. "" - "Mordor"
  13. '' - 'Misty Mountains'
  14. () - Cave Behind the Waterfall (Near Dead Marshes)
  15. : - Isengard: Orthanc Tower
  16. ; - Riverdall; Mirkwood
  17. diacritic letters - Barad-dûr
  18. non-English letters - إيربور
  19. internal whitespace - Minas Tirith
  20. one symbol - M
- **Steps:**<br>
  1. Send POST request
     ``{
         "id": "1",
         "name": "Legolas",
         "lastName": "Greenleaf",
         "email": "legolas@woodland-realm.el",
         "phone": "5550005555",
         "address": "<address from test data>",
         "description": "Elven prince, excellent archer"
       }
     ``
- **Expected Result:**
  1. Response 200 OK

### API_ADD_P_09 Add Contact with Existing Description

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered, at least one contact in account
- **Steps:**<br>
  1. Send POST request with existing description, same as of already created contact
     ``{
         "id": "1",
         "name": "Merry",
         "lastName": "Brandybuck",
         "email": "merry@buckland.net",
         "phone": "4479123003",
         "address": "Brandy Hall, Buckland",
         "description": "<description of another contact>"
       }
     ``
- **Expected Result:**
  1. Response 200 OK
  2. Contact is added

### API_ADD_P_10 Add Contact with Valid Description

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data (description):**
  1. lower case - baggins
  2. upper case - BAGGINS
  3. upper and lower case - Baggins
  4. numbers - Baggins3
  5. with <> - <b>Baggins</b>
  6. with "" - "Baggins"
  7. with + - Baggins+Gamgee
  8. with ampersand - Baggins&Gamgee
  9. with comma - Baggins,Gamgee
  10. with hyphen - Baggins-of-Backend
  11. with apostrophe - O'Baggins
  12. with dot - Mr.Baggins
  13. with internal whitespace - Sir Baggins
  14. with non-English letters - Бэггинс
  15. 1 character length - B
- **Steps:**<br>
  1. Send POST request with valid last name
     ``{
         "id": "1",
         "name": "Frodo",
         "lastName": "Baggins",
         "email": "frodo.baggins@shiremail.me",
         "phone": "5550001111",
         "address": "Bag End, Hobbiton, The Shire",
         "description": "<data set>"
       }
     ``
- **Expected Result:**
  1. Response 200 OK
  2. Contact is added

### API_ADD_P_11  Add Contact without Unrequired Fields

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data:**
  1. blank - `{
         "id": "1",
         "name": "Gimli",
         "lastName": "Gloin",
         "email": "remember@moria.mithril",
         "phone": "6550005555",
         "address": "Erebor",
         "description": ""
       }`
  2. whitespace - `{
         "id": "1",
         "name": "Gandalf",
         "lastName": "The White",
         "email": "follow@vallar.com",
         "phone": "7550005555",
         "address": "Middle Earth",
         "description": " "
       }`
- **Steps:**
  1. Send POST request with data from data set
- **Expected Result:**
  1. Response 200 OK

### API_ADD_P_12 Add Contact with Valid Phone

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data:**
  1. phone with 10 characters length
  2. phone with 15 characters length
- **Steps:**<br>
  1. Send POST request
     ``{
         "id": "1",
         "name": "Frodo",
         "lastName": "Baggins",
         "email": "frodo.baggins@shiremail.me",
         "phone": "<phone from test data>",
         "address": "Bag End, Hobbiton, The Shire",
         "description": "The Ring Bearer"
       }
     ``
- **Expected Result:**
  1. Response 200 OK
  2. Contact is added

### API_ADD_N_01  Add Contact without Authentication

- **Test Type:** API
- **Component:** Add Contact
- **Steps:**
  1. Send POST request without authentication header
     ``{
          "id": "1",
          "name": "Sauron",
          "lastName": "The Great",
          "email": "i@am.elf",
          "phone": "9550005555",
          "address": "Mordor",
          "description": "He is lying"
        }``
- **Expected Result:**
  1. Response 401

### API_ADD_N_02 Add Contact with Invalid Token

- **Test Type:** API
- **Component:** Add Contact
- **Test Data (Authorization token):**
  1. "invalid"
  2. "111111.22222222.3333333"
- **Steps:**
  1. Send POST request
    ``"Authorization": "<test data>",
      body {
          "id": "1",
          "name": "Witch King",
          "lastName": "of Angmar",
          "email": "for@dark.lord",
          "phone": "1250005555",
          "address": "Mordor",
          "description": "Will not fall by the hand of man."
      }``
- **Expected Result:**
  1. Response 401 Unauthorized

### API_ADD_N_021 Add Contact with Outdated Token

- **Test Type:** API
- **Component:** Add Contact
- **Steps:**
  1. Send POST request with outdated token
     ``"Authorization": "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoia3V2ZnF0bmJAZXhhbXBsZS5jb20iLCJpc3MiOiJSZWd1bGFpdCIsImV4cCI6MTc1NDc1MTM5MiwiaWF0IjoxNzU0MTUxMzkyfQ.dUT3ghue_QtkyHjwocO13VtxYuT554yE7_oHm0XKLZ4",
       body {
           "id": "1",
           "name": "Witch King",
           "lastName": "of Angmar",
           "email": "for@dark.lord",
           "phone": "1250005555",
           "address": "Mordor",
           "description": "Will not fall by the hand of man."
       }``
- **Expected Result:**
  1. Response 401 Unauthorized

### API_ADD_N_04 Add Contact with Invalid Request Format

- **Test Type:** API
- **Component:** Add Contact
- **Test Data:**
  1. without commas: ``{
           "id": "1"
           "name": "Witch King"
           "lastName": "of Angmar"
           "email": "for@dark.lord"
           "phone": "1250005555"
           "address": "Mordor"
           "description": "Will not fall by the hand of man."
       }``
  2. with unknown key: ``{
     "id": "1",
     "name": "Witch King",
     "lastName": "of Angmar",
     "email": "for@dark.lord",
     "phone": "1250005555",
     "workPhone": "1264437543"
     "address": "Mordor",
     "description": "Will not fall by the hand of man."
     }``
- **Steps:**
  1. Send POST request in invalid format from test data
- **Expected Result:**
  1. Response 400

### API_ADD_N_041 Add Contact with Invalid Content-Type Header

- **Test Type:** API
- **Component:** Add Contact
- **Test Data:**
  1. no Content-Type header
  2. header `Content-Type: text/plain`, JSON in body
  3. header `Content-Type: text/plain`, plain text "not a json" in body
- **Expected Result:**
  1. Response 400

### API_ADD_N_042 Add Contact with Invalid Cache-Control Header

- **Test Type:** API
- **Component:** Add Contact
- **Test Data:**
  1. no Cache-Control header
  2. header `Cache-Control: max-age`, without maximum age
  3. header `Cache-Control: no-cache, max-age`
- **Expected Result:**
  1. Response 400

### API_ADD_N_05 Add Contact with Missing Name 

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data:**
  1. no key: `{
          "id": "1",
          "lastName": "Son of Arathorn",
          "email": "aragorn@ranger.gov",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
  2. empty value: `{
          "id": "1",
          "name": "",
          "lastName": "Son of Arathorn",
          "email": "aragorn@ranger.gov",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
  3. whitespace: `{
          "id": "1",
          "name": " ",
          "lastName": "Son of Arathorn",
          "email": "aragorn@ranger.gov",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
- **Steps:**
  1. Send POST request with test data
- **Expected Result:**
  1. Response 400 Bad Request
  2. Contact is not added

### API_ADD_N_06 Add Contact with Missing Last Name

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data:**
  1. no key: `{
          "id": "1",
          "name": "Aragorn",
          "email": "aragorn@ranger.gov",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
  2. empty value: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "",
          "email": "aragorn@ranger.gov",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
  3. whitespace: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": " ",
          "email": "aragorn@ranger.gov",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
- **Steps:**
  1. Send POST request with test data
- **Expected Result:**
  1. Response 400 Bad Request
  2. Contact is not added

### API_ADD_N_07 Add Contact with Missing Email

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data:**
  1. no key: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
  2. empty value: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
  3. whitespace: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": " ",
          "phone": "1234567890",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
- **Steps:**
  1. Send POST request with test data
- **Expected Result:**
  1. Response 400 Bad Request
  2. Contact is not added

### API_ADD_N_08 Add Contact with Existing Email  

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered, at least one contact is created 
- **Steps:**
  1. Send POST request:
     `{
           "id": "1",
           "name": "Aragorn",
           "lastName": "Son of Arathorn",
           "email": "<email of another contact>",
           "phone": "1234567890",
           "address": "The Throne Room, Gondor",
           "description": "The King"
         }`
- **Expected Result:**
  1. Response 400 Bad Request
  2. Contact is not added

### API_ADD_N_09 Add Contact with Invalid Email

- **Endpoint:** Add Contact
- **Preconditions:** user not registered
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
  1. API returns 400
  2. Contact is not added

### API_ADD_N_10 Add Contact with Missing Address

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data:**
  1. no key: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "ranger@gondor.king",
          "phone": "1234567890",
          "description": "The King"
        }`
  2. empty value: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "ranger@gondor.king",
          "phone": "1234567890",
          "address": "",
          "description": "The King"
        }`
  3. whitespace: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "ranger@gondor.king",
          "phone": "1234567890",
          "address": " ",
          "description": "The King"
        }`
- **Steps:**
  1. Send POST request with test data
- **Expected Result:**
  1. Response 400 Bad Request
  2. Contact is not added

### API_ADD_N_11 Add Contact with Missing Phone

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data:**
  1. no key: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "ranger@gondor.king",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
  2. empty value: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "ranger@gondor.king",
          "phone": "",
          "address": "",
          "description": "The King"
        }`
  3. whitespace: `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "ranger@gondor.king",
          "phone": " ",
          "address": " ",
          "description": "The King"
        }`
- **Steps:**
  1. Send POST request with test data
- **Expected Result:**
  1. Response 400 Bad Request
  2. Contact is not added

### API_ADD_N_12 Add Contact with Existing Phone

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered, at least one contact is added
- **Steps:**
  1. Send POST request
     `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "aragorn@ranger.gov",
          "phone": "<phone of another contact>",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
- **Expected Result:**
  1. Response 400 Bad Request
  2. Contact is not added

### API_ADD_N_13  Add Contact with invalid Phone

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data (phone):**
  1. with letters (900000006a)
  2. with plus (+900000006)
  3. with bracket ((900)000006)
  4. 9 symbol length (123456789)
  5. 16 symbols length (1234567890123456)
  6. with leading whitespace ( 900000006)
  7. with trailing whitespace (900000006 )
  8. with internal whitespace (900 000006)
- **Steps:**
  1. Send POST request
     `{
          "id": "1",
          "name": "Aragorn",
          "lastName": "Son of Arathorn",
          "email": "aragorn@ranger.gov",
          "phone": "<test data>",
          "address": "The Throne Room, Gondor",
          "description": "The King"
        }`
- **Expected Result:**
  1. Response 400 Bad Request

### API_ADD_N_14 Add Contact with Invalid Description

- **Test Type:** API
- **Component:** Add Contact
- **Precondition:** user is registered
- **Test Data (description):**
  1. no description: `{
          "id": "1",
          "name": "Eowyn",
          "lastName": "Daughter of Eomund",
          "email": "for@freedom.gov",
          "phone": "447900000011",
          "address": "Edoras"
        }`
  2. description null: `{
          "id": "1",
          "name": "Eowyn",
          "lastName": "Daughter of Eomund",
          "email": "for@freedom.gov",
          "phone": "447900000011",
          "address": "Edoras",
          "description": null
        }`
  3. invalid data type: `{
          "id": "1",
          "name": "Eowyn",
          "lastName": "Daughter of Eomund",
          "email": "for@freedom.gov",
          "phone": "447900000011",
          "address": "Edoras",
          "description": 1234
        }`
- **Steps:**
  1. Send POST request from test data
- **Expected Result:**
  1. Response 400 Bad Request

### UI_ADD_P_01 Add Contact with Valid Data

- **Test Type:** UI
- **Component:** Add Contact
- **Precondition:** user is registered, go to Add Contact page
- **Steps:**<br>
  1. add valid Name
  2. add valid Last name
  3. add valid Email
  4. add valid Phone
  5. add valid Address
  6. add valid Description
  7. click on Save button
- **Expected Result:**
  1. Contact is added

### UI_ADD_P_02 Add Contact with Data with Non-English Letters

- **Test Type:** UI
- **Component:** Add Contact
- **Precondition:** user is registered, go to Add Contact page
- **Test data:**
  1. Russian
  2. Diacritic
  3. Hebrew
  4. Arabic
- **Steps:**<br>
  1. add Name from test data
  2. add Last name from test data
  3. add valid Email
  4. add valid Phone
  5. add Address from test data
  6. add Description from test data
  7. click on Save button
- **Expected Result:**
  1. Contact is added
  2. Contact is displayed correctly

### UI_ADD_P_03 Add Contact with Special Characters

- **Test Type:** UI
- **Component:** Add Contact
- **Precondition:** user is registered, go to Add Contact page
- **Test data:**
  1. HTML-tag (<b></b>)
  2. ""
  3. ''
  4. +
  5. emoji
- **Steps:**<br>
  1. add Name from test data
  2. add Last name from test data
  3. add valid Email
  4. add valid Phone
  5. add Address from test data
  6. add Description from test data
  7. click on Save button
- **Expected Result:**
  1. Contact is added
  2. Contact is displayed correctly

### UI_ADD_P_04 Add Contact with Copy-Paste Input

- **Test Type:** UI
- **Component:** Add Contact
- **Precondition:** user is registered, go to Add Contact page
- **Steps:**<br>
  1. add Name with copy-paste
  2. add Last name with copy-paste
  3. add Email with copy-paste
  4. add Phone with copy-paste
  5. add Address with copy-paste
  6. add Description with copy-paste
  7. click on Save button
- **Expected Result:**
  1. Contact is added

### UI_ADD_N_01 Add Contact with Empty Required Fields

- **Test Type:** UI
- **Component:** Add Contact
- **Precondition:** user is registered, go to Add Contact page
- **Test Data:**
  1. name
  2. last name
  3. email
  4. phone
  5. address
- **Steps:**<br>
  1. leave field from test data empty
  2. fill in other fields
  3. click on Save button
- **Expected Result:**
  1. Error message

### INT_SYS_N_01 Lost Connection While Filling Add Contact Form

- **Test Type:** Interruption
- **Component:** System
- **Precondition:** user is logged in
- **Steps:**<br>
  1. Open https://telranedu.web.app/home
  2. Navigate to Add Page
  3. Start filling fields (Name, Last name, Phone)
  4. Simulate loss of Internet connection (disable WiFi)
- **Expected Result:**
  1. Error message
  2. After reconnecting user can continue filling out the form, data is not lost

### INT_SYS_N_02 Page Refreshed While Filling Forms

- **Test Type:** Interruption
- **Component:** System
- **Precondition:** user is logged in
- **Steps:**<br>
  1. Open https://telranedu.web.app/home
  2. Navigate to Add Page
  3. Start filling fields (Name, Last name, Phone)
  4. Refresh the page
- **Expected Result:**
  1. Form is empty, without corrupted data

### INT_SYS_N_03 Behavior with Browser Back and Forward Buttons

- **Test Type:** Interruption
- **Component:** System
- **Precondition:** browser is opened
- **Steps:**<br>
  1. Open https://telranedu.web.app/home
  2. Click on Back browser button
  3. Click on Forward browser button
  4. Log in
  5. Open contact
  6. Click on Back browser button
  7. Click on Forward browser button
- **Expected Result:**
  - user can return to login page with Forward button (step 3)
  - user use Back/Forward buttons on the website

### MOB_REG_P_01 Register with Valid Credentials

- **Test Type:** Mobile UI
- **Component:** Registration
- **Steps:**<br>
  1. Open the app
  2. Enter valid email
  3. Enter valid password
  4. Tap on Registration Button
- **Expected Result:**
  1. User is registered successfully
  2. Contacts Page is opened

### MOB_REG_N_01 Register with Missing Email

- **Test Type:** Mobile UI
- **Component:** Registration
- **Test Data:**
  1. no email
  2. blank email
  3. whitespace
- **Precondition:** login page is opened
- **Steps:**<br>
  1. Enter email as in test data
  2. Enter valid password
  3. Tap on Registration Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password" (requirement F1)

### MOB_REG_N_02 Register with Invalid Password

- **Test Type:** Mobile UI
- **Component:** Registration
- **Test Data (Password):**
  1. lowletters7^ - no uppercase letters
  2. UPLETTERS6# - no lowercase letters
  3. NoNumbers^ - no numbers
  4. NoSpecials5 - no special characters
  5. 6Плохо^2! - non-English letters
  6. P@sw0rd - too short (7 symbols)
  7. P@sw0rdRightHere - too long (16 symbols)
- **Steps:**<br>
  1. Enter email
  2. Enter password from test data
  3. Tap on Registration Button
- **Expected Result:**
  1. User is not registered
  2. Error message "Wrong email or password"

### MOB_LOG_P_01 Log in with Valid Credentials

- **Test Type:** Mobile UI
- **Component:** Login
- **Preconditions:** app is opened
- **Steps:**<br>
  1. Enter valid email
  2. Enter valid password
  3. Tap on Login Button
- **Expected Result:**
  1. User is logged in
  2. Contacts page is opened

### MOB_LOG_P_02 Log in into Account Created on Web on Mobile

- **Test Type:** Mobile UI
- **Component:** Login
- **Preconditions:** user is registered on web, app is opened
- **Steps:**<br>
  1. Enter registered on web email
  2. Enter registered on web password
  3. Tap on Login Button
- **Expected Result:**
  1. User is logged in
  2. Contacts page is opened
  3. Added contacts are displayed

### MOB_LOG_N_01 Log in with Unregistered Email

- **Test Type:** Mobile UI
- **Component:** Login
- **Preconditions:** app is opened
- **Steps:**<br>
  1. Enter unregistered email
  2. Enter password
  3. Tap on Login Button
- **Expected Result:**
  1. Error message "Login or password incorrect"

### MOB_ADD_P_02 Add Contact with Non-English Letters in Name, Last Name, Address, Description

- **Test Type:** Mobile UI
- **Component:** Add Contact
- **Preconditions:** app is opened, user is logged in
- **Steps:**<br>
  1. Tap on "+"
  2. Enter name with non-English letters
  3. Enter last name with non-English letters
  4. Enter email
  5. Enter phone
  6. Enter address with non-English letters
  7. Enter description with non-English letters
  8. Tap on "Create"
- **Expected Result:**
  1. Contact is displayed correctly

### MOB_ADD_P_03 Add Contact with Special Characters in Allowed fields

- **Test Type:** Mobile UI
- **Component:** Add Contact
- **Preconditions:** app is opened, user is logged in
- **Steps:**<br>
  1. Tap on "+"
  2. Enter name with special characters
  3. Enter last name with special characters
  4. Enter email with special characters
  5. Enter phone
  6. Enter address with special characters
  7. Enter description with special characters
  8. Tap on "Create"
- **Expected Result:**
  1. Contact is displayed correctly

### MOB_SYS_P_02 Multiple Instances Work on Same Data

- **Test Type:** Mobile
- **Component:** Login, List of contacts, Add Contact
- **Preconditions:** app is opened
- **Steps:**<br>
  1. Enter email on first device
  2. Enter password on first device
  3. Tap on Login on first device
  4. Enter email on second device
  5. Enter password on second device
  6. Tap on Login on second device
  7. Scroll Contacts List Page on the first device
  8. Scroll Contacts List Page on the second device
  9. Tap on a contact on the first device
  10. Swipe left to edit contact on the second device
  11. Edit contact info
  12. Tap on save
  13. Swipe right to remove contact on the first device
  14. Log out on the first device
- **Expected Result:**
  1. User can log in using different devices simultaneously
  2. User can view Contacts List Page simultaneously
  3. Contact edited on one device updates on another
  4. Contact removed on one device is removed on another
  5. User can log out on the first device and stay logged in on another

### MOB_SYS_P_03 App Handles Repeated Add/Delete Cycles

- **Test Type:** Mobile
- **Component:** List of contacts, Add Contact, Remove Contact
- **Preconditions:** app is opened, user is logged in
- **Steps:**<br>
  1. Tap on "+"
  2. Enter name
  3. Enter last name
  4. Enter email
  5. Enter phone
  6. Enter address
  7. Enter description
  8. Tap on "Create"
  9. Swipe right to delete contact
  10. Tap on "Yes"
  11. Repeat 10 times
- **Expected Result:** cycle is handled correctly

### MOB_SYS_P_04 Install App

- **Test Type:** Mobile
- **Component:** System
- **Steps:**<br>
  1. Install file contact-android.apk
  2. Open the app from menu
- **Expected Result:** app is installed and opened correctly

### MOB_SYS_P_05 Rotate device in each screen

- **Test Type:** Mobile
- **Component:** System
- **Preconditions:** app is opened, login page is opened, contacts are created
- **Steps:**<br>
  1. Rotate device
  2. Enter email
  3. Enter password
  4. Tap on Login
  5. Rotate device, after rotating stay in landscape mode
  6. Swipe left to edit contact
  7. Rotate device, after rotating stay in landscape mode
  8. Edit info
  9. Tap on "Save"
  10. On the Contacts List Page swipe right to delete contact
  11. Tap on another contact
  12. Rotate device
- **Expected Result:** each screen is displayed and opened correctly in all modes

### MOB_SYS_P_08 App Compatibility Across Devices

- **Test Type:** Mobile
- **Component:** System
- **Emulators:**
  - Small Phone, 4.65 inch, Android 11
  - Pixel 8, 6.17 inch, Android 15
  - Pixel 9 Pro XL, 6.8 inch, Android 16
- **Steps:**<br>
  1. Install the app on the device
  2. Launch the app
  3. Enter email
  4. Enter password
  5. Tap on Register
  6. Tap on three dots 
  7. Tap to log out
  8. Enter email
  9. Enter password
  10. Tap on Login 
  11. Tap on + 
  12. Enter name 
  13. Enter last name 
  14. Enter email 
  15. Enter phone 
  16. Enter address 
  17. Enter description 
  18. Tap on Create 
  19. Swipe left to edit contact 
  20. Edit info 
  21. Tap on Save 
  22. Swipe right to delete contact 
  23. Tap on Yes
- **Expected Result:** screens displayed correctly and functions work on all devices

### MOB_SYS_P_09 Behavior With Different Network Types

- **Test Type:** Mobile
- **Component:** System
- **Steps:**<br>
  1. Connect to Wi-Fi
  2. Open the app
  3. Log in
  4. Create contact
  5. Disable Wi-Fi
  6. Set network type 5G
  7. Open contact 
  8. Edit contact
  9. Set network type 4G
  10. Open contact
  11. Remove contact
  12. Set network type 3G
  13. Create contact
  14. Log out
  15. Log in
- **Expected Result:** all operations succeed without or with minimum delay. If there is a delay, app shows loading indicator

### MOB_SYS_N_01 Send App to Background

- **Test Type:** Mobile
- **Component:** System
- **Preconditions:** app is opened, user is logged in
- **Steps:**<br>
  1. Tap on +
  2. Enter name
  3. Enter last name
  4. Press the Home button on the phone
  5. Wait 30 seconds
  6. Reopen app
- **Expected Result:** data is not lost

### MOB_SYS_N_02 Turn off the Screen Mid-Action

- **Test Type:** Mobile
- **Component:** System
- **Preconditions:** app is opened, user is logged in
- **Steps:**<br>
  1. Tap on +
  2. Enter name
  3. Enter last name
  4. Turn off the screen
  5. Wait 30 seconds
  6. Turn on the screen
- **Expected Result:** data is not lost

### MOB_SYS_N_03 Lost Connection Mid-Action

- **Test Type:** Mobile
- **Component:** System
- **Preconditions:** app is opened, user is logged in
- **Steps:**<br>
  1. Enter contact info
  2. Turn on airplane mode
  3. Tap on Create
  4. Turn off airplane mode, wait until phone is reconnected
  5. Tap on Create
- **Expected Result:**
  - user cannot create contact without connection
  - user stays on the same screen after tapping Create without connection
  - data is not lost
  - user can create contact after reconnecting

### MOB_SYS_N_04 Low battery

- **Test Type:** Mobile
- **Component:** System
- **Preconditions:** app is opened
- **Steps:**<br>
  1. Log in
  2. Decrease the battery level to 20%
  3. Create a contact
  4. Decrease the battery level to 10%
  5. Edit a contact
  6. Decrease the battery level to 5%
  7. Create a contact
  8. Decrease the battery level to 1% (device shuts down)
  9. Set charging
  10. Reopen the app
- **Expected Result:** App continues working normally, after shutting down can be opened again

### MOB_ACC_P_01 Screen Reader Reads Labels

- **Test Type:** Mobile
- **Component:** System
- **Preconditions:** 
  - TalkBack is enabled
  - the app is opened
- **Steps:**<br>
  1. Check how all the inscriptions and input fields are read on the Login Page
  2. Enter credentials
  3. Navigate to Register button 
  4. Check how all the inscriptions and input fields are read on empty Contacts List Page 
  5. Navigate to three dots, check how options are read 
  6. Navigate to Log out button
  7. Enter credentials
  8. Navigate to Login button
  9. Check how all the inscriptions and input fields are read on Add Contact Page
  10. Enter contact info
  11. Navigate to Create button
  12. Check how all the inscriptions and input fields are read on Contacts List Page
  13. Navigate to a contact button
  14. Check how all the inscriptions and input fields are read on Contacts Details Page
  15. Swipe left with two fingers
  16. Check how all the inscriptions and input fields are read on Update Contact Page
  17. Navigate to Save button
  18. Swipe right with two fingers
  19. Check how all the inscriptions and input fields are read on Confirm Deleting Message 
  20. Navigate to Yes
- **Expected Result:** 
  - all inscriptions and input fields are read correctly
  - touches with enabled TalkBack work correctly