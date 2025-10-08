# Overview

**STR identifier:**	STR_v5<br>
**Date created:** 07/10/2025<br>
**Version:** v5<br>

# Content
1. Test Scope<br>
  1.1 Scenario Test Cases<br>
  1.2 Exploratory Tests<br>
2. Summary
3. Test Artifacts
4. Bug Reports
5. Exploratory Test Reports

# Test Scope
Chosen tests for execution.<br>
Focused on testing the Registration and Login, including exploratory testing performed using Java and Postman.<br>

## Scenario Test Cases

| ID            | Title                                          | Automation       | Status        | Bug ID                         |
|---------------|------------------------------------------------|------------------|---------------|--------------------------------|
| API_REG_P_01  | Register with Valid Credentials                | Automated        | Passed        | -                              |
| API_REG_N_01  | Register with Missing Email                    | Manual (Postman) | Failed #4     | BUG_REG_API_04                 |
| API_REG_N_03  | Register with Invalid Email                    | Manual (Postman) | Failed #2, #3 | BUG_REG_API_10, BUG_REG_API_11 |
| API_REG_N_04  | Register with Invalid Password                 | Automated        | Failed #5, #7 | BUG_REG_API_01, BUG_REG_API_02 |
| API_REG_N_05  | Register with Duplicate Email                  | Automated        | Failed        | BUG_REG_API_03                 |
| API_LOG_P_01  | Log in with Registered Email                   | Automated        | Passed        | -                              |
| API_LOG_N_01  | Log in with Unregistered Email                 | Automated        | Failed        | BUG_LOG_API_02                 |
| API_LOG_N_02  | Log in with Wrong Password                     | Automated        | Failed        | BUG_LOG_API_02                 |
| UI_NAV_P_01   | Open Home Page from Navigation                 | Manual           | Passed        |                                |
| UI_NAV_P_02   | Open About Page from Navigation                | Manual           | Passed        |                                |
| UI_NAV_P_03   | Open Login Page from Navigation                | Manual           | Passed        |                                |
| UI_REG_P_01   | Register with Valid Credentials                | Automated        | Failed mobile | BUG_HOM_UI_01                  |
| UI_REG_P_02   | Register with Copy-Paste                       | Manual           | Passed        | -                              |
| UI_REG_N_01   | Register with Missing Email                    | Manual           | Failed        | BUG_REG_UI_03                  |
| UI_REG_N_03   | Register with All Empty Fields                 | Manual           | Passed        | -                              |
| UI_REG_N_04   | Register with Invalid Email                    | Automated        | Failed #2, #3 | BUG_REG_UI_05, BUG_REG_UI_06   |
| UI_REG_N_05   | Register with Invalid Password                 | Manual           | Failed #5, #7 | BUG_REG_UI_01, BUG_REG_UI_02   |
| UI_REG_N_06   | Register with Duplicate Email                  | Automated        | Failed        | BUG_REG_UI_08                  |
| UI_REG_N_07   | Register with Rapid Clicking                   | Manual           | Passed        | -                              |
| UI_LOG_P_01   | Log in with Valid Credentials                  | Automated        | Passed        | -                              |
| UI_LOG_P_03   | Log in with with Autofill                      | Manual           | Passed        | -                              |
| UI_LOG_N_01   | Log in with Unregistered Email                 | Automated        | Passed        | -                              |
| API_ADD_P_01  | Add Contact with Valid Data                    | Automated        | Passed        | -                              |
| API_ADD_P_02  | Add Contact with Existing Name                 | Automated        | Passed        | -                              |
| API_ADD_P_03  | Add Contact with Valid Name                    | Automated        | Passed        | -                              |
| API_ADD_P_08  | Add Contact with Valid Address                 | Automated        | Passed        | -                              |
| API_ADD_P_11  | Add Contact without Unrequired Fields          | Automated        | Passed        | -                              |
| API_ADD_N_01  | Add Contact without Authentication             | Automated        | Failed        | BUG_ADD_API_01                 |
| API_ADD_N_02  | Add Contact with Invalid Token                 | Manual           | Passed        | -                              |
| API_ADD_N_021 | Add Contact with Outdated Token                | Manual           | Passed        | -                              |
| API_ADD_N_13  | Add Contact with Invalid Phone                 | Automated        | Passed        | -                              |
| API_ADD_N_14  | Add Contact with Invalid Description           | Manual           | Failed        | BUG_ADD_API_02                 |
| UI_ADD_P_01   | Add Contact with Valid Data                    | Automated        | Passed        | -                              |
| UI_ADD_P_02   | Add Contact with Data with Non-English Letters | Manual           | Passed        | -                              |
| UI_ADD_P_03   | Add Contact with Special Characters            | Manual           | Passed        | -                              |
| UI_ADD_P_04   | Add Contact with Copy-Paste Input              | Manual           | Passed        | -                              |
| UI_ADD_N_01   | Add Contact with Empty Required Fields         | Manual           | Failed        | BUG_ADD_UI_01, BUG_ADD_UI_02   |
| UI_ADD_N_02   | Add Contact with Blank Required Fields         | Manual           | Failed        | BUG_ADD_UI_01, BUG_ADD_UI_02   |
| FUN_SYS_N_01  | Use Website with Interruptions                 |                  |               |                                |
| FUN_SYS_N_02  | Session Expired                                |                  |               |                                |
| MOB_REG_P_01  | Register with Valid Credentials                |                  |               |                                |
| MOB_REG_P_02  | Register with Copy-Paste                       |                  |               |                                |
| MOB_REG_N_01  | Register with Missing Email                    |                  |               |                                |
| MOB_REG_N_02  | Register with Invalid Password                 |                  |               |                                |
| MOB_LOG_P_01  | Log in with Valid Credentials                  |                  |               |                                |
| MOB_LOG_P_02  | Log in into Account Created on Web on Mobile   |                  |               |                                |
| MOB_LOG_N_01  | Log in with Unregistered Email                 |                  |               |                                |
| MOB_ADD_P_01  | Add Contact Using Gesture (Long Press / Swipe) |                  |               |                                |
| MOB_ADD_P_02  | Add Contact with Non-English Letters           |                  |               |                                |
| MOB_ADD_P_03  | Add Contact with Special Characters            |                  |               |                                |
| MOB_SYS_P_01  | Scroll Through Long Contact List               |                  |               |                                |
| MOB_SYS_P_02  | Multiple Instances Work on Same Data           |                  |               |                                |
| MOB_SYS_P_03  | App Handles Repeated Add/Delete Cycles         |                  |               |                                |
| MOB_SYS_P_04  | Install App                                    |                  |               |                                |
| MOB_SYS_P_05  | Rotate device in each screen                   |                  |               |                                |
| MOB_SYS_P_06  | Reach Main Buttons with One Hand               |                  |               |                                |
| MOB_SYS_P_07  | App Compatibility Across OS Versions           |                  |               |                                |
| MOB_SYS_P_08  | App Compatibility Across Devices               |                  |               |                                |
| MOB_SYS_P_09  | Screen Reader Reads Labels                     |                  |               |                                |
| MOB_SYS_P_10  | App Performance When Adding 100+ Contacts      |                  |               |                                |
| MOB_SYS_N_01  | Use App with Interruptions                     |                  |               |                                |
| MOB_SYS_N_02  | Delete App                                     |                  |               |                                |

## Exploratory Tests

| ID          | Title                                            | Performed | Bug ID         |
|-------------|--------------------------------------------------|-----------|----------------|
| EXP_AUTH_01 | Authentication with Capitalized Letters in Email | Performed | BUG_LOG_API_01 |
| EXP_AUTH_02 | Authentication with Long Email                   | Performed | -              |
| EXP_AUTH_03 | Authentication with Various Emails               | Performed | -              |
| EXP_AUTH_04 | Authentication with Various Passwords            | Performed | BUG_REG_API_12 |
| EXP_AUTH_05 | Authentication API with Invalid Request Format   | Performed | BUG_REG_API_12 |
| EXP_NAV_01  | Navigate Using Keyboard                          | Performed | -              |
| EXP_NAV_02  | User-Only Actions Using Old Token                | Performed | -              |
| EXP_ADD_01  | Add Contact with Given ID                        | Performed | BUG_ADD_API_03 |
| EXP_MOB_01  | Monkey Testing                                   |           |                |

# Summary

## Tests

- **Total Tests Written (Repository):** 64 tests
- **Tests Planned for Execution:** 38 tests
- **Tests Executed:** 38 tests
  - Passed: 23 tests
  - Failed: 15 tests
  - Pass Rate: 61%

- **Exploratory Sessions Planned for Execution:** 8 sessions
- Bugs Found During Exploratory Sessions: 4 bugs

## Bugs

- **Total Bugs Found:** 31 bugs
- **Severity:**
  - Critical: 1 bug
  - High: 2 bugs
  - Medium: 21 bugs
  - Low: 7 bugs
- **Bugs Density:**
  - Home Page: 1 bug
  - Navigation: 0 bugs
  - Registration: 20 bugs
  - Login: 4 bugs
  - Contact List: 1 bug
  - Add Contacts: 5 bugs

## Coverage

- **Requirements Covered by Tests:** 44%
- **Levels Covered:** API, Functional, UI
- **Modules Covered:** Navigation, Registration, Login, Add Contact
- **Untested Areas:** All Contacts, Delete Contact, Update Contact, Sign out, Security Testing

**Notes:**
- The Registration API has critical issues around password validation and email casing that may impact security and user experience. Some requests result in 500 Response.
- Response schema need alignment with specifications to ensure consistency.
- Some functional and validation requirements are not fully defined, leading to ambiguity in expected behavior.

# Test Artifacts
- **Test Cases and Data:** docs/STD.md
- **Test Scripts:**
  - src/test/java/api_tests/RegistrationRestTests.java
  - src/test/java/api_tests/LoginRestTests.java
- **Test Execution Logs:** 
  - Automated Tests Logs:
    - test_logs/log-20250802T191609.log
    - test_logs/log-20250802T194313.log
    - test_logs/log-20250803T142445.log
    - test_logs/log-20250817T132438.log
    - test_logs/log-20250817T132635.log
    - test_logs/log-20250817T132748.log
    - test_logs/log-20250817T145357.log
    - test_logs/log-20250817T150058.log
    - test_logs/log-20250817T150148.log
    - test_logs/log-20250911T202458.log
    - test_logs/log-20250915T212650.log
  - Postman Runs:
    - src/test/postman/postman_reg_test_run.json

# Bug Reports

## BUG_HOM_UI_01 Home Page in Mobile Web Version is Misaligned

- **Severity:** Medium (the layout is fine in landscape mode)
- **Test ID:** found while executing UI_REG_P_01
- **Environment:** Google Chrome Mobile
- **Component:** Home Page
- **Steps:**
  1. Open Home Page
- **Expected Result:** the layout is valid
- **Actual result:** the layout in portrait mode is hugely misaligned and not centered, Login Button is not available.
- **Attachments:** src/test/screenshots/BUG_UI_02.png

## BUG_REG_API_01 Registration API Accepts Passwords with Non-English Letters

- **Severity:** Medium
- **Test Case ID:** API_REG_N_04
- **Environment:** Java, RestAssured
- **Component:** Registration API
- **Requirement Reference:** requirement T10
- **Test info:** automated test method `API_REG_N_04_test()`
- **Steps:**
  1. Send POST request to registration endpoint with JSON, where password has non-English letters:<br>
    ``{ "username": "s2n@example.com", "password": "ффЕSHpl63@@" }``
- **Expected Result:**
  1. API returns 400
  2. Error message
- **Actual Result:**
  1. API returns 200 OK
  2. API returns token
- **Attachments:** test_logs/log-20250802T191609.log

## BUG_REG_API_02 Registration API Accepts Too Long Password

- **Severity:** Medium
- **Test Case ID:** API_REG_N_04
- **Environment:** Java, RestAssured
- **Component:** Registration API
- **Requirement Reference:** requirement T15 (max password 15 characters)
- **Test info:** automated test method `API_REG_N_04_test()`
- **Steps:**
  1. Send POST request to registration endpoint with JSON with password length 16 characters:<br>
     ``{ "username": "4p3@example.com", "password": "Lh9&3g!wFxCL$Sh7" }``
- **Expected Result:**
  1. API returns 400
  2. Error message
- **Actual Result:**
  1. API returns 200 OK
  2. API returns token
- **Attachments:** test_logs/log-20250802T191609.log

## BUG_REG_API_03 Registration API Returns String Instead of Object in Error Message

- **Severity:** Low (frontend handles it)
- **Test Case ID:** API_REG_N_05
- **Environment:** Java, RestAssured
- **Component:** Registration API
- **Requirement Reference:** Swagger
- **Test info:** automated test method `API_REG_N_05()`
- **Steps:**
  1. Send POST request to registration endpoint<br>
     ``{ "username": "wuw5z9a@test.com", "password": "Ex8^ng0R*G2y" }``
  2. Send POST request to registration endpoint<br>
     ``{ "username": "wuw5z9a@test.com", "password": "Ex8^ng0R*G2y" }``
- **Expected Result:**
  1. API returns 409
  2. Body with message type Object
  3. Message "User already exists"
- **Actual Result:**
  1. API returns 409 Conflict
  2. Message type is String
- **Attachments:** test_logs/log-20250802T191609.log

## BUG_REG_API_04 Registration API Returns JSON without Message for Missing Email

- **Severity:** Low (frontend handles it)
- **Test ID:** API_REG_N_01
- **Environment:** Postman
- **Component:** Registration API
- **Requirement Reference:** requirement T2, Swagger
- **Steps:**
  1. send POST request to registration endpoint with whitespace instead of email<br>
    ``{ "username": " ", "password": "#2Breakfast!" }``
- **Expected Result:**
  1. API returns 400
  2. Message '"username": "must not be blank"'.
- **Actual Result:**
  1. API returns 400
  2. No message in the body of JSON
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_REG_API_10 Registration API Allows Non-English Letters in Email

- **Severity:** High
- **Test ID:** API_REG_N_03
- **Environment:** Postman
- **Component:** Registration API
- **Requirements Reference:** requirement T6
- **Data Sets:**
  1. ``{ "username": "цаСсЫетРРф@example.com", "password": "Xx1*!yg21Auz" }`` - email contains Cyrillic characters
  2. ``{ "username": "ëçööçûï@example.com", "password": "Pz9!$pi2nn7G" }`` - email contains diacritic characters
- **Steps:**<br>
  1. Send JSON from test data
- **Expected Result:** user is not registered
- **Actual Result:** user is registered

## BUG_REG_API_11 Registration API Allows Email without At Sign

- **Severity:** High
- **Test ID:** API_REG_N_03
- **Environment:** Postman
- **Component:** Registration API
- **Requirements Reference:** requirement T3
- **Steps:**<br>
  1. Send JSON with email without @ ``{ "username": "hjzmdldxwt.com", "password": "Sc7^2F8YRu7K" }``
- **Expected Result:** user is not registered
- **Actual Result:** user is registered

## BUG_REG_API_12 Registration API returns 500 Error

- **Severity:** High
- **Test ID:** EXP_AUTH_04
- **Environment:** Postman
- **Component:** Registration API
- **Test Data:**
  1. password with characters `'"\/<>;`: PCyv53/`, AHwd99&&/<
  2. password with new line character: Fl3!Q6mibn\n
  3. password with tabulation: Ej7#8EdQew\t
  4. header `Content-Type: text/plain`, JSON in body
  5. header `Content-Type: text/plain`, plain text "not a json" in body
  6. no Content-Type header
  7. no comma in body: `{ "username": "Giovani39@example.com" "password": "P@ssw0rd" }`
  8. "email" instead of "username": `{ "email": "Giovani39@example.com", "password": "P@ssw0rd" }`
  9. new "state" key: `{ "username": "elena65748@gmail.com", "password": "P@ssw0rd", "state": "CA" }`
- **Steps:**<br>
  1. Send JSON with test data
- **Expected Result:** Response Code < 500
- **Actual Result:** 500 Internal Server Error
- **Attributes:** src/test/postman/postman_reg_test_run.json

## BUG_REG_UI_01 Registration UI Accepts Passwords with Non-English Letters

- **Severity:** Medium
- **Test Case ID:** UI_REG_N_05
- **Environment:** Chrome Desktop, Firefox, Edge
- **Component:** Registration UI
- **Requirement Reference:** requirement T10, F1
- **Test info:** related to BUG_REG_API_01
- **Steps:**
  1. Enter email (sauron@blackgate.io)
  2. Enter valid password with English and non-English letters (ЛеголасArrow#1)
  3. Click on Registration Button
- **Expected Result:**
  1. User is not registered
- **Actual Result:**
  1. User is registered

## BUG_REG_UI_02 Registration UI Accepts Too Long Password

- **Severity:** Medium
- **Test Case ID:** UI_REG_N_05
- **Environment:** Chrome Desktop, Firefox, Edge
- **Component:** Registration UI
- **Requirement Reference:** requirement T15 (max password 15 characters)
- **Test info:** related to BUG_REG_API_02
- **Steps:**
  1. Enter email (sauron@orcnet.com)
  2. Enter valid password length 16 characters (P@ssw0rdRightHer)
  3. Click on Registration Button
- **Expected Result:**
  1. User is not registered
- **Actual Result:**
  1. User is registered

## BUG_REG_UI_03 Registration Request Is Sent on Negative Registration

- **Severity:** Medium
- **Environment:** Chrome Desktop, Firefox, Edge
- **Component:** Registration UI
- **Requirement Reference:** requirement T2
- **Precondition:** login page is opened
- **Steps:**
  1. Enter invalid credentials (registered email, no email, no password)
  2. Click on Registration Button
- **Expected Result:** user is not registered
- **Actual result:** user is not registered, but request is sent to the server
- **Attachments:** src/test/screenshots/BUG_UI_03.png

## BUG_REG_UI_04 Raw Technical Error Message Is Displayed on Negative Registration

- **Severity:** Medium
- **Environment:** Chrome Desktop, Firefox, Edge, Chrome Mobile
- **Component:** Registration UI
- **Steps:**
  1. Enter invalid credentials (registered email, no email, no password)
  2. Click on Registration Button
- **Expected Result:** error message
  - **Actual result:** 
  1. Error message is displayed as popup message
  2. Red message "Registration failed with code 400" above the registration form, that user is not supposed to see

## BUG_REG_UI_05 Frontend Allows Registration with Non-English Letters in Email

- **Severity:** Medium
- **Test ID:** UI_REG_N_04
- **Related Tests:** BUG_REG_API_10
- **Environment:** Chrome Desktop, Firefox, Edge, Chrome Mobile
- **Component:** Registration UI
- **Requirements Reference:** requirement T6
- **Data Sets:**
  1. цаСсЫётРРф@example.com, Xx1*!yg21Auz - email contains Cyrillic characters
  2. ëçööçûï@example.com, Pz9!$pi2nn7G - email contains diacritic characters
- **Steps:**<br>
  1. Enter email from data set
  2. Enter valid password
  3. Click on Registration Button
- **Expected Result:** user is not registered
- **Actual Result:** user is registered
- **Attachments:**
  - test_logs/log-20250817T132635.log
  - test_logs/log-20250817T132748.log

## BUG_REG_UI_06 Frontend Allows Registration with Email without At Sign

- **Severity:** Medium
- **Test ID:** UI_REG_N_04
- **Related Tests:** BUG_REG_API_11
- **Environment:** Chrome Desktop, Firefox, Edge, Chrome Mobile
- **Component:** Registration UI
- **Requirements Reference:** requirement T3
- **Steps:**<br>
  1. Enter email without @ (hjzmdldxwt.com)
  2. Enter valid password (Sc7^2F8YRu7K)
  3. Click on Registration Button
- **Expected Result:** user is not registered
- **Actual Result:** user is registered
- **Attachments:**
  - test_logs/log-20250817T132438.log

## BUG_REG_UI_07 Error Message for Registration Contains Mistake

- **Severity:** Medium
- **Environment:** Google Chrome Desktop, Mozilla Firefox, Microsoft Edge, Chrome Mobile
- **Component:** Registration UI
- **Requirements Reference:** requirement T9 (one of special characters is required: @$#^&*! in password)
- **Steps:**<br>
  1. Enter invalid credentials (password without special characters)
  2. Click on Registration Button
- **Expected Result:** error message
- **Actual Result:** message "Password must contain at least one special symbol from [‘$’,’~’,’-‘,’_’]!" List of characters does not match the requirements.
- **Artifacts:** src/test/screenshots/BUG_UI_06.png

## BUG_REG_UI_08 Error Message for Duplicate Email Contains Mistake

- **Severity:** Low
- **Environment:** Google Chrome Desktop, Mozilla Firefox, Microsoft Edge, Chrome Mobile
- **Component:** Registration UI
- **Test ID:** UI_REG_N_06
- **Preconditions:** registered user (email zupw@example.com)
- **Steps:**<br>
  1. Enter the registered email (zupw@example.com)
  2. Enter password (Bl6$rZ0tbUkL)
  3. Click on Registration Button
- **Expected Result:**
  1. Error message "User already exists" (requirement F3)
- **Actual Result:**
  1. Error message "User already exist", grammar mistake
- **Artifacts:**
  - src/test/screenshots/BUG_UI_07.png
  - test_logs/log-20250817T145357.log
  - test_logs/log-20250817T150058.log
  - test_logs/log-20250817T150148.log

## BUG_LOG_API_01 Login API Fails with Uppercase Letters in Email

- **Severity:** Medium
- **Test ID:** EXP_AUTH_01
- **Environment:** Java, RestAssured
- **Component:** Login API
- **Test info:** automated test method `EXP_AUTH_01_test()`
- **Steps:**
  1. send POST request to registration endpoint: ``{ "username": "KUVFqtnb@example.com", "password": "Tf8&NvXs&zhL" }``
  2. send POST request to login endpoint: ``{ "username": "KUVFqtnb@example.com", "password": "Tf8&NvXs&zhL" }``
- **Expected Result:**
  1. Registration API returns 2xx or 4xx
  2. Login API returns the same code
- **Actual Result:**
  - Registration API returns 200, log in API returns 401 Unauthorized
  - only login with fully lowercase email succeeds (`kuvfqtnb@example.com`)
- **Attachments:** test_logs/log-20250802T191609.log

## BUG_LOG_API_02 Login API Returns String Instead of Object on Negative Login Attempts

- **Severity:** Low (frontend handles it)
- **Test Case ID:** API_LOG_N_01, API_LOG_N_02
- **Environment:** Java, RestAssured
- **Component:** Login API
- **Requirement Reference:** Swagger
- **Test info:** automated test methods `API_LOG_N_01()`, `API_LOG_N_02()`
- **Steps:**<br>
  1. Send POST request to login endpoint for unregistered email
     ``{
       "username": "vht@example.com",
       "password": "Wx4^A#$F!AQ4"
     }``
  2. Log in with invalid password
     2.1 Send POST request to registration endpoint ``{ "username": "eug@example.com", "password": "Qu5#MFf64NGJ" }``<br>
     2.2 Send POST request to login endpoint with invalid password ``{ "username": "eug@example.com", "password": "Ea6!^w5hJQWt" }``<br>
- **Expected Result:**
  1. API returns 401
  2. Error message as Object with text "Login or Password incorrect"
- **Actual result:**
  1. API returns 401 Unauthorized
  2. Error message as String "Login or Password incorrect"
- **Attachments:** test_logs/log-20250803T142445.log

## BUG_LOG_UI_03 Login Request Is Sent on Negative Login

- **Severity:** Medium
- **Environment:** Chrome Desktop, Firefox, Edge
- **Component:** Login UI
- **Precondition:** login page is opened
- **Steps:**
  1. Enter invalid credentials (unregistered email, no email, no password)
  2. Click on Login Button
- **Expected Result:** user is not logged in
- **Actual result:** user is not registered, but request is sent to the server

## BUG_LOG_UI_01 Raw Technical Error Message Is Displayed on Negative Login

- **Severity:** Medium
- **Environment:** Chrome Desktop, Firefox, Edge, Chrome Mobile
- **Component:** Login UI
- **Steps:**
  1. Enter invalid credentials (unregistered email, no email, no password)
  2. Click on Login Button
- **Expected Result:** error message
  - **Actual result:**
  1. Error message is displayed as popup message
  2. Red message "Login failed with code 400" above the registration form, that user is not supposed to see

## BUG_ALL_UI_01 Empty contacts list message is misaligned on non-full window

- **Severity:** Low
- **Test ID:** found while executing UI_REG_P_01
- **Environment:** Chrome Desktop, Firefox, Edge
- **Component:** Contacts List
- **Preconditions:** login page is opened
- **Steps:**
  1. Register
  2. Resize the browser window to half width
  3. Observe the empty list message
- **Expected Result:** the empty list message is vertically and horizontally centered.
- **Actual result:** "Add new by clicking on Add in NavBar!" is aligned to the right.
- **Attachments:** src/test/screenshots/BUG_UI_01.png

## BUG_ADD_API_01 Wrong Code for Adding Contact without Authentication

- **Severity:** Medium
- **Test ID:** API_ADD_N_01
- **Environment:** Postman, Java, RestAssured
- **Component:** Add Contact API
- **Requirement Reference:** Swagger
- **Test info:** automated test method `API_ADD_N_01_test()`
- **Steps:**
  1. Send POST request without authentication header
     ``{
          "id": "464",
          "name": "QIgOI",
          "lastName": "jaNGo",
          "email": "18@example.com",
          "phone": "544066919438",
          "address": "Zckye",
          "description": "AqZYW"
        }``
- **Expected Result:**
  1. API returns 401 Unauthorized
  2. Response body is as ErrorMessageSchema
- **Actual Result:**
  1. API returns 403 Forbidden
  2. No response body
- **Attachments:** test_logs/log-20250915T212650.log

## BUG_ADD_API_02 Add contact API accepts invalid data type

- **Severity:** Low
- **Test ID:** API_ADD_N_14
- **Environment:** Postman
- **Component:** Add Contact API
- **Test Data:**
  1. boolean description: `{
      "id": "u-g",
      "name": "Merry",
      "lastName": "Brandybuck",
      "email": "Reece.Howell@gmail.com",
      "phone": "070371709101",
      "address": "Brandy Hall, Buckland, The Shire",
      "description": true
    }`
  2. int description: `{
    "id": "4-c",
    "name": "Merry",
    "lastName": "Brandybuck",
    "email": "Jermaine.Beier@gmail.com",
    "phone": "070371709101",
    "address": "Brandy Hall, Buckland, The Shire",
    "description": 1234
    }`
- **Steps:**<br>
  1. Send JSON with test data
- **Expected Result:** Error
- **Actual Result:** 200 OK
- **Attributes:** src/test/postman/postman_reg_test_run.json

## BUG_ADD_API_03 API Create Contact Requires Unneeded ID

- **Severity:** Medium
- **Test ID:** EXP_ADD_01
- **Environment:** Postman
- **Component:** Add Contact API
- **Test Data:**
  - String ("v-7")
  - int (6574)
  - boolean (true)
  - existing id ("fc7ddd76-37c1-4c36-a6d3-63f3d22f4fdf")
- **Steps:**
  1. Send JSON with test data: `{
    "id": <id from test data>,
    "name": "Merry",
    "lastName": "Brandybuck",
    "email": "Jermaine.Beier@gmail.com",
    "phone": "070371709101",
    "address": "Brandy Hall, Buckland, The Shire",
    "description": 1234
    }`
- **Expected Result:** error for non-String datatypes, ID is given to the contact, existing id returns error
- **Actual Result:** contact is given new ID, that is sent in response message
- **Notes:** it is unclear why ID is required in request, if system creates new one based on a pattern. Probably it is better not to require ID in response.
- **Attributes:** src/test/postman/postman_reg_test_run.json

## BUG_ADD_UI_01 No Indication for Missing Fields

- **Severity:** Low
- **Test ID:** UI_ADD_N_01, UI_ADD_N_02
- **Environment:** Chrome Desktop
- **Component:** Add Contact UI
- **Steps:**
  1. leave one required field empty (name, last name, email, phone or address)
  2. fill in other required fields
  3. click no Save button
- **Expected Result:** button is displayed differently and is not clickable, message about missing fields
- **Actual Result:** button is not clickable, but looks the same, no message for Name, Last name

## BUG_ADD_UI_02 Successful Creating Contact without Email

- **Severity:** Medium
- **Test ID:** UI_ADD_N_01
- **Environment:** Chrome Desktop
- **Component:** Add Contact UI
- **Steps:**
  1. fill in Name, Last name, Phone, Address
  2. leave Email field empty
  3. click no Save button
- **Expected Result:** contact is not created, error message
- **Actual Result:** contact is created

# Test Reports for Exploratory Sessions

## EXP_AUTH_01 Authentication with Capitalized Letters in Email

- **Session goal:** investigate whether the API treats email addresses as case-sensitive or case-insensitive, and if consistent login behavior is maintained.
- **Scope:**
  - API Registration, email field
  - API Login, email field
  - UI Registration, email field
  - UI Login, email field
- **Time:** 30 minutes
- **Environment:**
  - Postman for API
  - Chrome Desktop
  - Java for Automated Tests (for practice)
- **Test Ideas:**
  1. registration request with email with uppercase letters (`KUVFqtnb@example.com`)
  2. registration request with the same email, but different casing (`kuvfqtnb@example.com` - lowercase, `KUVFQTNB@example.com` - uppercase)
  3. login request (`KUVFqtnb@example.com` - original casing, `kuvfqtnb@example.com`- different casing)
- **Test info:** automated test method `EXP_AUTH_01_test()`
- **Results:**
  - email with casing is registered
  - the system normalizes email addresses to lowercase internally
  - only login with fully lowercase email succeeded
  - attempts to re-register the same email in any casing were correctly blocked

  | Level | Action   | Email                | Result               | Token                         |
  |-------|----------|----------------------|----------------------|-------------------------------|
  | API   | Register | KUVFqtnb@example.com | 200 OK               | "sub": "kuvfqtnb@example.com" |
  | API   | Register | kuvfqtnb@example.com | 409 Conflict         |                               |
  | API   | Register | KUVFQTNB@example.com | 409 Conflict         |                               |
  | API   | Log in   | KUVFqtnb@example.com | 401 Unauthorized     |                               |
  | API   | Log in   | kuvfqTNB@example.com | 401 Unauthorized     |                               |
  | API   | Log in   | kuvfqtnb@example.com | 200 OK               | "sub": "kuvfqtnb@example.com" |
  | UI    | Register | JGHxbhu@example.com  | Success              | "sub": "jghxbhu@example.com"  |
  | UI    | Register | jghxbhu@example.com  | Failed (user exists) |                               |
  | UI    | Register | JGHXBHU@example.com  | Failed (user exists) |                               |
  | UI    | Log in   | JGHxbhu@example.com  | Failed               |                               |
  | UI    | Log in   | jghxbhu@example.com  | Success              | "sub": "jghxbhu@example.com"  |
- **Bugs:**
  - login with original casing fails even though it was the email used during registration - BUG_LOG_API_01
- **Notes:**
  - results suggest that email casing is normalized for registration and conflict detection, but not for login authentication
  - results are inconsistent, likely a usability issue.
  - RFC 5321 and 5322 specify that email local parts are technically case-sensitive, but in practice most systems treat them as case-insensitive.
- **Attachments:** test_logs/log-20250802T191609.log

### EXP_AUTH_02 Authentication with Long Email

- **Session goal:** explore system behavior with long email addresses during registration and login, and verify that the UI remains stable.
- **Scope:**
  - API Registration, email field
  - API Login, email field
  - UI Registration, email field
  - UI Login, email field
- **Time:** 30 minutes
- **Environment:**
  - Postman for API
  - Chrome Desktop
  - Java for Automated Tests (for practice)
- **Test Ideas:**
  1. registration and login with email length 254 characters
  2. registration and login with email length 255 characters
- **Test info:** automated test method `EXP_AUTH_02_test()`
- **Results:**
    
  | Level | Action   | Email Length | Result                                                                      |
  |-------|----------|--------------|-----------------------------------------------------------------------------|
  | API   | Register | 254 char.    | 400 Bad Request, message `"username":"must be a well-formed email address"` |
  | UI    | Register | 254 char.    | Message "Wrong email or password", UI is not broken                         |
  | API   | Register | 255 char.    | 400 Bad Request, message `"username":"must be a well-formed email address"` |
  | API   | Register | 75 char.     | 400 Bad Request, message `"username":"must be a well-formed email address"` |
  | API   | Register | 50 char.     | 200 OK                                                                      |
  | API   | Register | 65 char.     | 200 OK                                                                      |
  | API   | Register | 70 char.     | 200 OK                                                                      |
  | API   | Register | 74 char.     | 400 Bad Request, message `"username":"must be a well-formed email address"` |
  | API   | Register | 73 char.     | 200 OK, "sub" in token is valid                                             |
  | API   | Login    | 73 char.     | 200 OK, "sub" in token is valid                                             |
  | UI    | Register | 73 char.     | 200 OK                                                                      |
  | UI    | Login    | 73 char.     | 200 OK                                                                      |
- **Notes:**
  * RFC 3696 states that the max email length is 254 characters. Local part length can be up to 64 characters, domain length (including dots) can be 189 characters.
  - the system enforces an email length limit below 74 characters, which does not align with common standards (e.g., 254-character limit per RFC).
  - The maximum allowed email length is not defined in the current requirements, making it unclear whether this behavior is intended or a validation defect.
- **Attachments:** test_logs/log-20250802T191609.log

### EXP_AUTH_03 Authentication with Various Emails

- **Session goal:** explore how the system handles registration and login with emails, containing special characters, emoji, control characters.
- **Scope:**
  - API Registration, email field
  - API Login, email field
  - UI Registration, email field
  - UI Login, email field
- **Time:** 30 minutes
- **Environment:**
  - Postman for API
  - Chrome Desktop
  - Java for Automated Tests (for practice)
- **Test Ideas (Email):**
  1. hyphen (`pippin@hyphen-hobbiton.com`, `pippin@-hobbiton.com`, `pippin@hobbiton-.com`)
  2. dot placement (`subdomain@hobbiton.shire.com`, `nodot@examplecom`, `beforedot@.com`, `afterdot@example.`, `dot..dot@example.com`)
  3. whitespace (` leadspace@example.com`, `white space@example.com`, `trailspace@example.com `)
  4. emoji (`emo😈ji@example.com`)
  5. control characters (`new\nline@example.com`, `has     tab@example.com`)
- **Test info:** automated test method `EXP_AUTH_03_test()`
- **Results:**

  | Email                                 | API Reg         | API Login | UI Reg                              | UI Login |
  |---------------------------------------|-----------------|-----------|-------------------------------------|----------|
  | ouryx@test-example.com                | 200 OK          | 200 OK    | Accepted                            | Accepted |
  | ouryx@-example.com                    | 400 Bad Request | -         | Declined, request is sent to server | -        |
  | ouryx@example-.com                    | 400 Bad Request | -         | Declined, request is sent to server | -        |
  | ujscl@test.example.com                | 200 OK          | 200 OK    | Accepted                            | Accepted |
  | qkbjd@examplecom                      | 200 OK          | 200 OK    | Accepted                            | Accepted |
  | mthlq@.com                            | 400 Bad Request | -         | -                                   | -        |
  | lqlzu@example.                        | 400 Bad Request | -         | -                                   | -        |
  | bm..hf@example.com                    | 400 Bad Request | -         | -                                   | -        |
  | vxdnr@example.com (lead. whitespace)  | 400 Bad Request | -         | Declined, request is sent to server | -        |
  | my zp@example.com                     | 400 Bad Request | -         | -                                   | -        |
  | krnxb@example.com (trail. whitespace) | 400 Bad Request | -         | -                                   | -        |
  | opnlg😈@example.com                   | 400 Bad Request | -         | Declined, request is sent to server | -        |
  | vm\nvl@example.com                    | 400 Bad Request | -         | Declined, request is sent to server | -        |
  | cy\tei@example.com                    | 400 Bad Request | -         | Declined, request is sent to server | -        |

  System behavior is partly aligned with RFCs, but expected rules for email validation are not documented.
- **Notes:**
  - RFC 1035 allows hyphens in domain names (except at the start/end of a label). The system behaviour is the same.
  - RFC 1035 allows subdomains. The system behaviour is the same.
  - most API reject email with no dot in domain. The system allows it.
  - RFC 1035 states that domain label must contain at least one alphanumeric character before and after the dot. The system behaviour is the same.
  - RFC 5322 does not allow unescaped whitespaces. The system behaviour is the same.
  - RFC 5322 does not allow dots in unquoted local-parts of an email address. The system behaviour is the same.
  - RFC 5322 does not allow control characters (\n, \t). The system behaviour is the same.
- **Attachments:** test_logs/log-20250802T194313.log

### EXP_AUTH_04 Authentication with Various Passwords

- **Session goal:** explore how the system handles registration using various passwords, including password with special characters that are not listed in requirements, whitespaces, control characters.
- **Scope:**
  - API Registration, password field
  - API Login, password field
  - UI Registration, password field
  - UI Login, password field
- **Time:** 30 minutes
- **Environment:**
  - Postman for API
  - Chrome Desktop
  - Java for Automated Tests (for practice)
- **Test Ideas (Password):**
  1. allowed special characters (`P@ssw0rd`)
  2. characters that are not listed in allowed special characters (`Passw0rd?`, `P@ssw0rd?`, `Pas'"\/<>``;8`, `P@s'"\/<>``;8`)
  3. whitespace (` P@ssw0rd`, `P@ss w0rd`, `P@ssw0rd `)
  4. control characters (`P@ss\nw0rd`, `P@ss\tw0rd`)
  5. emoji (`P@ss😈w0rd`)
- **Test info:** automated test method `EXP_AUTH_04_test()`
- **Results:**

  | Password (API)                 | API Reg                   | API Login | Password(UI) | UI Reg                                                           | UI Login    |
  |--------------------------------|---------------------------|-----------|--------------|------------------------------------------------------------------|-------------|
  | Ij8@0aWzyX                     | 200 OK                    | 200 OK    | Ij8@0aWzy    | Accepted                                                         | Accepted    |
  | PZDthk238~_                    | 400 Bad Request           | -         | PZDthk238~   | Declined, request is sent to the server                          | -           |
  | KMos78$!%%                     | 200 OK                    | -         | KMos78$!%    | Accepted                                                         | Accepted    |
  | PCyv53/`                       | 500 Internal Server Error | -         | PCyv53/`     | Declined, request is sent to the server                          | -           |
  | AHwd99&&/<                     | 500 Internal Server Error | -         | Hwd99&&/<    | Declined, request is sent to the server                          | Accepted    |
  | Js2&^9!Zoe (lead. whitespace)  | 200 OK                    | 200 OK    | Js2&^9!Zo    | Accepted                                                         | Accepted    |
  | Cn1@f Pa5$t                    | 200 OK                    | 200 OK    | n1@f Pa5$t   | Accepted                                                         | Accepted    |
  | Eq4#t@hmPE (trail. whitespace) | 200 OK                    | 200 OK    | Eq4#t@hmP    | Accepted                                                         | Accepted    |
  | Fl3!Q6mibn\n                   | 500 Internal Server Error | -         | Al3!Q6mibn\n | Declined for copy-paste, keyboard input. Success for typing "\n" | Same as Reg |
  | Ej7#8EdQew\t                   | 500 Internal Server Error | -         | j7#8EdQew\t  | Declined for copy-paste, keyboard input. Success for typing "\t" | Same as Reg |
  | Tr4&dj2tgJ😈                   | 200 OK                    | 200 OK    | r4&dj2tgJ😈  | Accepted                                                         | Accepted    |

  System doesn't register passwords that do not contain characters listed in requirements, but allows other special symbols (emoji), including potentially dangerous (`'"\/<>;`).
  Frontend doesn't allow new line character and tabulation as copy-paste and keyboard input, but allows typing.
  API returns server error for some special characters and control characters (BUG_REG_API_12).
  Expected behaviour is not documented.
- **Notes:**
  - requirements state that one of listed special characters (@$#^&*!) is required in password
    special characters (`'"\/<>;`) can lead to SQL injection, JSON injection, HTML injection, or Cross-Site Scripting (XSS) if input is not properly sanitized or escaped.
- **Attachments:**
  - src/test/postman/postman_reg_test_run.json
  - test_logs/log-20250911T202458.log

## EXP_AUTH_05 Authentication with Invalid Request Format

- **Session goal:** investigate how the API handles an invalid Content-Type header.
- **Scope:**
  - API Registration
  - API Login
- **Time:** 30 minutes
- **Environment:**
  - Postman for API
- **Test Ideas (Password):**
  1. wrong header (`Content-Type: text/plain`)
  2. no header
  3. no comma in body (`{ "username": "Giovani39@example.com" "password": "P@ssw0rd" }`)
  4. invalid key in body ("email" instead of "username": `{ "email": "Giovani39@example.com", "password": "P@ssw0rd" }`; new "state" key: `{ "username": "elena65748@gmail.com", "password": "P@ssw0rd", "state": "CA" }`)
- **Results:**
  
  | Request                                        | Component    | Response                                                                            |
  |------------------------------------------------|--------------|-------------------------------------------------------------------------------------|
  | `Content-Type: text/plain`, JSON in body       | Registration | 500 Internal Server Error                                                           |
  | `Content-Type: text/plain`, plain text in body | Registration | 500 Internal Server Error                                                           |
  | No Content-Type Header                         | Registration | 500 Internal Server Error                                                           |
  | Malformed JSON Body (without comma)            | Registration | 500 Internal Server Error                                                           |
  | Invalid Key in Body                            | Registration | 500 Internal Server Error, message "JSON parse error: Unrecognized field \'email\'" |
  | Unexpected Key in Body                         | Registration | 500 Internal Server Error, message "JSON parse error: Unrecognized field \'email\'" |
  | `Content-Type: text/plain`, JSON in body       | Login        | 200 OK                                                                              |
  | `Content-Type: text/plain`, plain text in body | Login        | 400 Bad Request, message "Wrong format Credential Object"                           |
  | No Content-Type Header                         | Login        | 200 OK                                                                              |
  | Malformed JSON Body (without comma)            | Login        | 400 Bad Request, message "Wrong format Credential Object"                           |
  | Invalid Key in Body                            | Login        | 400 Bad Request, message "Wrong format Credential Object"                           |
  | Unexpected Key in Body                         | Login        | 400 Bad Request, message "Wrong format Credential Object"                           |

  Registration API returns server error for some requests (BUG_REG_API_12)
- **Attachments:** src/test/postman/postman_reg_test_run.json

## EXP_NAV_01 Navigate Using Keyboard

- **Session goal:** investigate how navigation using keyboard works.
- **Scope:**
  - UI Header
  - UI Registration
  - UI Login
- **Time:** 30 minutes
- **Environment:**
  - Desktop Browser
- **Test Ideas:**
  - go through header pages and authentication form using Tab and Enter
  - register and log in using Tab, Enter, Shift+Enter, Ctrl+Enter
- **Results:**
  - User can go through Header pages, Authentication form, Add Contact form using Tab and Enter. 
  - Cannot open contact card on Contacts Page using keyboard.
  - Expected Behaviour is not documented.
- **Potential Issues**: keyboard cannot open contact card.

## EXP_NAV_02 User-Only Actions Using Old Token

- (API) token 16:04, 21 of September: eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibXIudG9va0BzaGlyZW1haWwubWUiLCJpc3MiOiJSZWd1bGFpdCIsImV4cCI6MTc1OTA1MjY3NCwiaWF0IjoxNzU4NDUyNjc0fQ.XelQ6RIg82AXIjjUoirr9HSng0RuiKs_MgKulxZsyGQ

- **Session goal:** investigate how API handles outdated tokens.
- **Scope:**
  - API Get Contacts 
  - API Add Contact 
  - API Update Contact
- **Time:** overall 1 week
- **Environment:**
  - Postman for API
- **Test Ideas:**
  1. token 10 minutes old
  2. token 30 minutes old
  3. token 1 hour old
  4. token 1 day old
  5. token 6 days old
  6. token 7 days old
  - **Results:**

    | Token Age | Get Contacts | Add Contact | Update Contact | Delete Contact | Delete All Contacts |
    |-----------|--------------|-------------|----------------|----------------|---------------------|
    | 10 min    | Success      | Success     | Success        | Success        | Success             |
    | 30 min    | Success      | Success     | Success        | Success        | Success             |
    | 1 hour    | Success      | Success     | Success        | Success        | Success             |
    | 1 day     |              |             |                |                |                     |

- **Attachments:** src/test/postman/postman_reg_test_run.json

## EXP_ADD_01 Add Contact with Given ID

- **Session goal:** investigate how "id" key changes response.
- **Scope:**
  - API Add Contact
- **Time:** 30 minutes
- **Environment:**
  - Postman for API
- **Test Ideas (id):**
  1. String
  2. int
  3. boolean
  4. null
  5. existing id
  6. no id key
- **Results:**

  | ID in Request                                   | Status             | ID in Response                       | ID of Created Contact                |
  |-------------------------------------------------|--------------------|--------------------------------------|--------------------------------------|
  | String ("v-7")                                  | Contact is created | 5c75d4ae-f9e9-40c7-a6fa-fb0ae1a2c2b3 | 5c75d4ae-f9e9-40c7-a6fa-fb0ae1a2c2b3 |
  | int (6574)                                      | Contact is created | 4c7c8094-ebfe-4ee3-9d3a-4930b89588b3 | 4c7c8094-ebfe-4ee3-9d3a-4930b89588b3 |
  | boolean (true)                                  | Contact is created | fc7ddd76-37c1-4c36-a6d3-63f3d22f4fdf | fc7ddd76-37c1-4c36-a6d3-63f3d22f4fdf |
  | null                                            | Contact is created | 5f4351ba-434a-41cf-a69b-34e12c18a34f | 5f4351ba-434a-41cf-a69b-34e12c18a34f |
  | exist. ("fc7ddd76-37c1-4c36-a6d3-63f3d22f4fdf") | Contact is created | c6858b90-75fb-4dc4-8e5f-732df578e4e5 | c6858b90-75fb-4dc4-8e5f-732df578e4e5 |
  | no id key                                       | Contact is created | b5adf0e7-6765-41e9-8321-793989f91451 | b5adf0e7-6765-41e9-8321-793989f91451 |

  ID in request JSON is required, but not used and not given to the created contact, BUG_ADD_API_03.  
- **Attachments:** src/test/postman/postman_reg_test_run.json

