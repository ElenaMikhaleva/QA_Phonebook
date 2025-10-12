
# Summary

Exploratory sessions are kept in STD, STR.

## Scenario Test Cases

| ID            | Title                                          | Test Type | Level           | Component     | Version         | Status                         |
|---------------|------------------------------------------------|-----------|-----------------|---------------|-----------------|--------------------------------|
| API_REG_P_01  | Register with Valid Credentials                | Positive  | API             | Registration  | Details below   | Executed 02/08/25              |
| API_REG_N_01  | Register with Missing Email                    | Negative  | API             | Registration  | Details below   | Executed 02/08/25              |
| API_REG_N_02  | Register with Missing Password                 | Negative  | API             | Registration  | Details below   | Not Executed                   |
| API_REG_N_03  | Register with Invalid Email                    | Negative  | API             | Registration  | Details below   | Executed 17/08/25              |
| API_REG_N_04  | Register with Invalid Password                 | Negative  | API             | Registration  | Details below   | Executed 02/08/25              |
| API_REG_N_05  | Register with Duplicate Email                  | Negative  | API             | Registration  | Details below   | Executed 02/08/25              |
| API_LOG_P_01  | Log in with Registered Email                   | Positive  | API             | Login         | Details below   | Executed 03/08/25              |
| API_LOG_N_01  | Log in with Unregistered Email                 | Negative  | API             | Login         | Details below   | Executed 03/08/25              |
| API_LOG_N_02  | Log in with Wrong Password                     | Negative  | API             | Login         | Details below   | Executed 03/08/25              |
| API_LOG_N_03  | Log in with Missing Email                      | Negative  | API             | Login         | Details below   | Not Executed                   |
| API_LOG_N_04  | Log in with Missing Password                   | Negative  | API             | Login         | Details below   | Not Executed                   |
| UI_NAV_P_01   | Open Home Page from Navigation                 | Positive  | UI              | Navigation    | High-level only | Executed with Navigation Tests |
| UI_NAV_P_02   | Open About Page from Navigation                | Positive  | UI              | Navigation    | High-level only | Executed with Navigation Tests |
| UI_NAV_P_03   | Open Login Page from Navigation                | Positive  | UI              | Navigation    | High-level only | Executed with Login Tests      |
| UI_REG_P_01   | Register with Valid Credentials                | Positive  | UI              | Registration  | Details below   | Executed 15/08/25              |
| UI_REG_P_02   | Register with Copy-Paste                       | Positive  | UI              | Registration  | Details below   | Executed 15/08/25              |
| UI_REG_N_01   | Register with Missing Email                    | Negative  | UI              | Registration  | Details below   | Executed 15/08/25              |
| UI_REG_N_02   | Register with Missing Password                 | Negative  | UI              | Registration  | Details below   | Not Executed                   |
| UI_REG_N_03   | Register with All Empty Fields                 | Negative  | UI              | Registration  | Details below   | Executed 15/08/25              |
| UI_REG_N_04   | Register with Invalid Email                    | Negative  | UI              | Registration  | Details below   | Executed 17/08/25              |
| UI_REG_N_05   | Register with Invalid Password                 | Negative  | UI              | Registration  | Details below   | Executed 17/08/25              |
| UI_REG_N_06   | Register with Duplicate Email                  | Negative  | UI              | Registration  | Details below   | Executed 17/08/25              |
| UI_REG_N_07   | Register with Rapid Clicking                   | Negative  | UI              | Registration  | Details below   | Executed 17/08/25              |
| UI_LOG_P_01   | Log in with Valid Credentials                  | Positive  | UI              | Login         | Details below   | Executed 17/08/25              |
| UI_LOG_P_02   | Log in with with Copy-Paste                    | Positive  | UI              | Login         | Details below   | Not Executed                   |
| UI_LOG_P_03   | Log in with with Autofill                      | Positive  | UI              | Login         | Details below   | Executed 17/08/25              |
| UI_LOG_N_01   | Log in with Unregistered Email                 | Negative  | UI              | Login         | Details below   | Executed 17/08/25              |
| UI_LOG_N_02   | Log in with Missing Email                      | Negative  | UI              | Login         | Details below   | Not Executed                   |
| UI_LOG_N_03   | Log in with Missing Password                   | Negative  | UI              | Login         | Details below   | Not Executed                   |
| UI_LOG_N_04   | Log in with Rapid Clicking                     | Negative  | UI              | Login         | Details below   | Not Executed                   |
| API_ADD_P_01  | Add Contact with Valid Data                    | Positive  | API             | Add Contact   | Details below   | Executed 12/09/25              |
| API_ADD_P_02  | Add Contact with Existing Name                 | Positive  | API             | Add Contact   | Details below   | Executed 12/09/25              |
| API_ADD_P_03  | Add Contact with Valid Name                    | Positive  | API             | Add Contact   | Details below   | Executed 14/09/25              |
| API_ADD_P_04  | Add Contact with Existing Last Name            | Positive  | API             | Add Contact   | Details below   | Not Executed                   |
| API_ADD_P_05  | Add Contact with Valid Last Name               | Positive  | API             | Add Contact   | Details below   | Not Executed                   |
| API_ADD_P_06  | Add Contact with Valid Email                   | Positive  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_P_07  | Add Contact with Existing Address              | Positive  | API             | Add Contact   | Details below   | Not Executed                   |
| API_ADD_P_08  | Add Contact with Valid Address                 | Positive  | API             | Add Contact   | Details below   | Executed 14/09/25              |
| API_ADD_P_09  | Add Contact with Existing Description          | Positive  | API             | Add Contact   | Details below   | Not Executed                   |
| API_ADD_P_10  | Add Contact with Valid Description             | Positive  | API             | Add Contact   | Details below   | Not Executed                   |
| API_ADD_P_11  | Add Contact without Unrequired Fields          | Positive  | API             | Add Contact   | Details below   | Executed 15/09/25              |
| API_ADD_P_12  | Add Contact with Valid Phone                   | Positive  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_01  | Add Contact without Authentication             | Negative  | API             | Add Contact   | Details below   | Executed 15/09/25              |
| API_ADD_N_02  | Add Contact with Invalid Token                 | Negative  | API             | Add Contact   | Details below   | Executed 19/09/25              |
| API_ADD_N_021 | Add Contact with Outdated Token                | Negative  | API             | Add Contact   | Details below   | Executed 19/09/25              |
| API_ADD_N_03  | Add Contact with Duplicate ID                  | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_04  | Add Contact with Invalid Request Format        | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_05  | Add Contact with Missing Name                  | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_06  | Add Contact with Missing Last Name             | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_07  | Add Contact with Missing Email                 | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_08  | Add Contact with Existing Email                | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_09  | Add Contact with Invalid Email                 | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_10  | Add Contact with Missing Address               | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_11  | Add Contact with Missing Phone                 | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_12  | Add Contact with Existing Phone                | Negative  | API             | Add Contact   | High-level only | Not Executed                   |
| API_ADD_N_13  | Add Contact with Invalid Phone                 | Negative  | API             | Add Contact   | Details below   | Executed 19/09/25              |
| API_ADD_N_14  | Add Contact with Invalid Description           | Negative  | API             | Add Contact   | Details below   | Executed 19/09/25              |
| UI_ADD_P_01   | Add Contact with Valid Data                    | Positive  | UI              | Add Contact   | Details below   | Executed 20/09/25              |
| UI_ADD_P_02   | Add Contact with Non-English Letters           | Positive  | UI              | Add Contact   | Details below   | Executed 20/09/25              |
| UI_ADD_P_03   | Add Contact with Special Characters            | Positive  | UI              | Add Contact   | Details below   | Executed 20/09/25              |
| UI_ADD_P_04   | Add Contact with Copy-Paste                    | Positive  | UI              | Add Contact   | Details below   | Executed 20/09/25              |
| UI_ADD_N_01   | Add Contact with Empty Required Fields         | Negative  | UI              | Add Contact   | Details below   | Executed 20/09/25              |
| UI_ADD_N_02   | Add Contact with Blank Required Fields         | Negative  | UI              | Add Contact   | High-level only | Not Executed                   |
| INT_SYS_N_01  | Lost Connection While Filling Add Contact Form | Negative  | Interruption    | System        | High-level only | Not Executed                   |
| MOB_NAV_P_01  | Open Home Screen                               | Positive  | Mob UI          | Navigation    | High-level only | Not Executed                   |
| MOB_NAV_P_02  | Open Login Screen                              | Positive  | Mob UI          | Navigation    | High-level only | Not Executed                   |
| MOB_REG_P_01  | Register with Valid Credentials                | Positive  | Mob UI          | Registration  | High-level only | Not Executed                   |
| MOB_REG_P_02  | Register with Copy-Paste                       | Positive  | Mob UI          | Registration  | High-level only | Not Executed                   |
| MOB_REG_N_01  | Register with Missing Email                    | Negative  | Mob UI          | Registration  | High-level only | Not Executed                   |
| MOB_REG_N_02  | Register with Invalid Password                 | Negative  | Mob UI          | Registration  | High-level only | Not Executed                   |
| MOB_LOG_P_01  | Log in with Valid Credentials                  | Positive  | Mob UI          | Login         | High-level only | Not Executed                   |
| MOB_LOG_P_02  | Log in into Account Created on Web on Mobile   | Positive  | Synchronization | Login         | High-level only | Not Executed                   |
| MOB_LOG_N_01  | Log in with Unregistered Email                 | Negative  | Mob UI          | Login         | High-level only | Not Executed                   |
| MOB_ADD_P_01  | Add Contact Using Gesture (Long Press / Swipe) | Positive  | Mob UI          | Add Contact   | High-level only | Not Executed                   |
| MOB_ADD_P_02  | Add Contact with Non-English Letters           | Positive  | Mob UI          | Add Contact   | High-level only | Not Executed                   |
| MOB_ADD_P_03  | Add Contact with Special Characters            | Positive  | Mob UI          | Add Contact   | High-level only | Not Executed                   |
| MOB_SYS_P_01  | Scroll Through Long Contact List               | Positive  | Mob UI          | Contacts List | High-level only | Not Executed                   |
| MOB_SYS_P_02  | Multiple Instances Work on Same Data           | Positive  | Synchronization | Contacts List | High-level only | Not Executed                   |
| MOB_SYS_P_03  | App Handles Repeated Add/Delete Cycles         | Positive  | Stability       | Contacts List | High-level only | Not Executed                   |
| MOB_SYS_P_04  | Install App                                    | Positive  | Mob Smoke       | System        | High-level only | Not Executed                   |
| MOB_SYS_P_05  | Rotate device in each screen                   | Positive  | Compatibility   | System        | High-level only | Not Executed                   |
| MOB_SYS_P_06  | Reach Main Buttons with One Hand               | Positive  | Mob UI          | System        | High-level only | Not Executed                   |
| MOB_SYS_P_07  | App Compatibility Across OS Versions           | Positive  | Compatibility   | System        | High-level only | Not Executed                   |
| MOB_SYS_P_08  | App Compatibility Across Devices               | Positive  | Compatibility   | System        | High-level only | Not Executed                   |
| MOB_SYS_P_09  | Screen Reader Reads Labels                     | Positive  | Mob UI          | System        | High-level only | Not Executed                   |
| MOB_SYS_P_10  | App Performance When Adding 100+ Contacts      | Positive  | Performance     | System        | High-level only | Not Executed                   |
| MOB_SYS_N_01  | Use App with Interruptions                     | Negative  | Functional      | System        | High-level only | Not Executed                   |
| MOB_SYS_N_02  | Delete App                                     | Negative  | Functional      | System        | High-level only | Not Executed                   |

Interruption tests MOBILE
- send an app to the background
- turn off the screen
- exit app mid-action (adding contact)
- rotating the screen
- different types of connection (3G/4G/5G/WiFi/no connection)
- incoming call
- notification
- connecting with new devices
- low battery
- shutdown
- close app after submitting but before server response

Multiple Instances Work on Same Data
- multiple tabs edit the same contact
- web and device

Interruption tests WEB
- page refresh mid-action (adding contact)
- browser back/forward
- tab/window closed mid/action
- multiple tabs acting on same data
- form abandoned
- close browser after submitting but before server response

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
  1. API returns 400 (requirement T2, Swagger)
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
  1. API returns 400 (requirement T8, Swagger)
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
  1. Enter email as in test data
  2. Enter valid password
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
  4. numbers - Baggins3
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



