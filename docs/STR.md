# Overview

**STR identifier:**	STR_v4<br>
**Date created:** 12/08/2025<br>
**Version:** v4.0<br>

# Content
1. Test Scope
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

| ID           | Title                           | Level | Component    | Automation       | Status          | Bug ID                         |
|--------------|---------------------------------|-------|--------------|------------------|-----------------|--------------------------------|
| API_REG_P_01 | Register with Valid Credentials | API   | Registration | Automated        | Passed          |                                |
| API_REG_N_01 | Register with Missing Email     | API   | Registration | Manual (Postman) | Failed #4       | BUG_REG_API_04                 |
| API_REG_N_03 | Register with Invalid Email     | API   | Registration | Manual (Postman) | Failed #2, #3   | BUG_REG_API_10, BUG_REG_API_11 |
| API_REG_N_04 | Register with Invalid Password  | API   | Registration | Automated        | Failed #5, #7   | BUG_REG_API_01, BUG_REG_API_02 |
| API_REG_N_05 | Register with Duplicate Email   | API   | Registration | Automated        | Failed          | BUG_REG_API_03                 |
| API_LOG_P_01 | Log in with Registered Email    | API   | Login        | Automated        | Passed          |                                |
| API_LOG_N_01 | Log in with Unregistered Email  | API   | Login        | Automated        | Failed          | BUG_LOG_API_02                 |
| API_LOG_N_02 | Log in with Wrong Password      | API   | Login        | Automated        | Failed          | BUG_LOG_API_02                 |
| UI_REG_P_01  | Register with Valid Credentials | UI    | Registration | Automated        | Failed (mobile) | BUG_HOM_UI_01                  |
| UI_REG_P_02  | Register with Copy-Paste        | UI    | Registration | Manual           | Passed          |                                |
| UI_REG_N_01  | Register with Missing Email     | UI    | Registration | Manual           | Failed          | BUG_REG_UI_03                  |
| UI_REG_N_03  | Register with All Empty Fields  | UI    | Registration | Manual           | Passed          |                                |
| UI_REG_N_04  | Register with Invalid Email     | UI    | Registration | Automated        | Failed #2, #3   | BUG_REG_UI_05, BUG_REG_UI_06   |
| UI_REG_N_05  | Register with Invalid Password  | UI    | Registration | Manual           | Failed #5, #7   | BUG_REG_UI_01, BUG_REG_UI_02   |
| UI_REG_N_06  | Register with Duplicate Email   | UI    | Registration | Automated        | Failed          | BUG_REG_UI_08                  |
| UI_REG_N_07  | Register with Rapid Clicking    | UI    | Registration | Manual           | Passed          |                                |
| UI_LOG_P_01  | Log in with Valid Credentials   | UI    | Login        | Automated        | Passed          |                                |
| UI_LOG_P_03  | Log in with with Autofill       | UI    | Login        | Manual           | Passed          |                                |
| UI_LOG_N_01  | Log in with Unregistered Email  | UI    | Login        | Automated        | Passed          |                                |

## Exploratory Tests

| ID          | Title                                            | Component           | Bug ID         |
|-------------|--------------------------------------------------|---------------------|----------------|
| EXP_AUTH_01 | Authentication with Capitalized Letters in Email | Registration, Login | BUG_LOG_API_01 |
| EXP_AUTH_02 | Authentication with Long Email                   | Registration, Login |                |
| EXP_AUTH_03 | Authentication with Various Emails               | Registration, Login |                |

| EXP_API_REG_04 | Register with Various Passwords   | API   | Registration | Manual (Postman) | EXP_RPT_API_04 | BUG_REG_API_05, BUG_REG_API_06, BUG_REG_API_07 |
| EXP_API_REG_05 | Register with Invalid Header      | API   | Registration | Manual (Postman) | EXP_RPT_API_05 | BUG_REG_API_08                                 |
| EXP_API_REG_06 | Register with Malformed JSON Body | API   | Registration | Manual (Postman) | EXP_RPT_API_06 | BUG_REG_API_09                                 |
| EXP_UI_NAV_01  | Navigate Using Keyboard           | UI    | Navigation   | Automated        |                |                                                |
| EXP_UI_REG_02  | Register with Various Emails      | UI    | Registration | Manual           |                |                                                |
| EXP_UI_LOG_01  | Fill and Submit Using Keyboard    | UI    | Login        | Automated        |                |                                                |
| EXP_UI_LOG_03  | Log in with Various Passwords     | UI    | Login        | Manual           |                |                                                |

# Summary

- **Total tests planned:** 20
  - 12 test cases
  - 8 exploratory tests
- **Tests executed:** 13 tests
  - 7 test cases
  - 6 exploratory tests
- **Passed:** 2 test case
- **Failed:** 5 test cases
  - test case API_REG_N_04 failed due to 2 out of 7 data sets failing
  - test case API_REG_N_05 failed due to 2 out of 2 data sets failing
  - test case API_REG_N_01 failed due to 1 out of 4 data sets failing
  - 4 bugs are found during execution of exploratory tests
- **Skipped:** 7 tests

**Notes:**
- The Registration API has critical issues around password validation and email casing that may impact security and user experience. 
- Response schema need alignment with specifications to ensure consistency.
- Some functional and validation requirements (EXP_RPT_API_01, EXP_API_REG_03) are not fully defined, leading to ambiguity in expected behavior.

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
- **Postman Runs:**
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

## BUG_REG_API_05 Registration API Fails with Special Characters in Password (500 Error)

- **Severity:** Medium (frontend handles the characters, user registers successfully and can log in after)
- **Test ID:** EXP_RPT_API_04
- **Environment:** Postman
- **Component:** Registration API
- **Steps:**
  1. send POST request to registration endpoint with allowed special characters and '"\/<>`<br>
    ``{ "username": "test1754163739867@mail.com", "password": "P@s'"\/<>`;8" }``
- **Expected Result:**
  1. API returns 200 OK or 400 Bad Request
  2. Password is handled safely
- **Actual Result:**
  1. API returns 500 Internal Server Error
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_REG_API_06 Registration API Fails with \n in Password (500 Error)

- **Severity:** Medium (frontend handles it, user registers successfully and can log in after)
- **Test ID:** EXP_RPT_API_04
- **Environment:** Postman
- **Component:** Registration API
- **Steps:**
  1. send POST request to registration endpoint with new line character in password<br>
     ``{ "username": "test1754164036005@mail.com", "password": "P@ss\nw0rd" }``
- **Expected Result:**
  1. API returns 200 OK or 400 Bad Request
  2. Password is handled safely
- **Actual Result:**
  1. API returns 500 Internal Server Error
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_REG_API_07 Registration API Fails with \t in Password (500 Error)

- **Severity:** Medium (frontend handles it, user registers successfully and can log in after)
- **Test ID:** EXP_RPT_API_04
- **Environment:** Postman
- **Component:** Registration API
- **Steps:**
  1. send POST request to registration endpoint with tabulation in password<br>
     ``{ "username": "test1754164138206@mail.com", "password": "P@ss\tw0rd" }``
- **Expected Result:**
  1. API returns 200 OK or 400 Bad Request
  2. Password is handled safely
- **Actual Result:**
  1. API returns 500 Internal Server Error
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_REG_API_08 Registration API Fails with Invalid Header (500 Error)

- **Severity:** Medium
- **Test ID:** EXP_API_REG_05
- **Environment:** Postman
- **Component:** Registration API
- **Steps**
  1. send POST request to registration endpoint
     Header: ``Content-Type: text/plain``<br>
     Body: ``{ "username": "Dudley_Steuber@gmail.com", "password": "P@ssw0rd" }``
- **Expected Result:**
  1. API returns code < 500 (e.g., 415 Unsupported Media Type)
  2. Clear error message
- **Actual result:**
  1. API returns 500 Internal Server Error
  2. Message "Content type 'text/plain;charset=UTF-8' not supported"
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_REG_API_09 Registration API Fails with Malformed JSON Body (500 Error)

- **Severity:** Medium
- **Test ID:** EXP_API_REG_06
- **Environment:** Postman
- **Component:** Registration API
- **Steps:**
  1. Send POST request with malformed JSON (without comma) ``{ "username": "Giovani39@example.com" "password": "P@ssw0rd" }``
- **Expected Result:**
  1. API returns code < 500
  2. Clear error message
- **Actual result:**
  1. API returns 500 Internal Server Error
  2. Message "JSON parse error: Unexpected character ('\"' (code 34)): was expecting comma to separate Object entries"
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_REG_API_10 Registration API Allows Non-English Letters in Email

- **Severity:** High
- **Test ID:** API_REG_N_03
- **Environment:** Postman
- **Component:** Registration API
- **Requirements Reference:** requirement T6
- **Data Sets:**
  1. ``{ "username": "цаСсЫётРРф@example.com", "password": "Xx1*!yg21Auz" }`` - email contains Cyrillic characters
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
  1. Enter JSON with email without @ ``{ "username": "hjzmdldxwt.com", "password": "Sc7^2F8YRu7K" }``
- **Expected Result:** user is not registered
- **Actual Result:** user is registered

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

- **Session goal:** explore how the system handles registration and login with emails, containing special characters, emoji, control characters
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
  1. hyphen (`pippin@hyphen-hobbiton.com`, `pippin@-hobbiton.com`, `pippin@hobbiton-.com`)
  2. dot placement (`subdomain@hobbiton.shire.com`, `nodot@examplecom`, `beforedot@.com`, `afterdot@example.`, `dot..dot@example.com`)
  3. whitespace (` leadspace@example.com`, `white space@example.com`, `trailspace@example.com `)
  4. emoji (`emo😈ji@example.com - emoji`)
  5. control characters (`new\nline@example.com`, `has     tab@example.com`)
- **Test info:** automated test method `EXP_AUTH_03_test()`
- **Results:**

  | Email                                | API Reg         | UI Reg | API Login                         | UI Login |
  |--------------------------------------|-----------------|--------|-----------------------------------|----------|
  | ouryx@test-example.com               | 200 OK          | 200 OK | Success                           | Success  |
  | ouryx@-example.com                   | 400 Bad Request | -      | Failed, request is sent to server | -        |
  | ouryx@example-.com                   | 400 Bad Request | -      | Failed, request is sent to server | -        |
  | ujscl@test.example.com               | 200 OK          | 200 OK | Success                           | Success  |
  | qkbjd@examplecom                     | 200 OK          | 200 OK | Success                           | Success  |
  | mthlq@.com                           | 400 Bad Request | -      | -                                 | -        |
  | lqlzu@example.                       | 400 Bad Request | -      | -                                 | -        |
  | bm..hf@example.com                   | 400 Bad Request | -      | -                                 | -        |
  | vxdnr@example.com (lead. whitespace) | 400 Bad Request | -      | Failed, request is sent to server | -        |
  | my zp@example.com                    | 400 Bad Request | -      | -                                 | -        |
  | krnxb@example.com (trail. whitespace | 400 Bad Request | -      | -                                 | -        |
  | opnlg😈@example.com                  | 400 Bad Request | -      | Failed, request is sent to server | -        |
  | vm\nvl@example.com                   | 400 Bad Request | -      | Failed, request is sent to server | -        |
  | cy\tei@example.com                   | 400 Bad Request | -      | Failed, request is sent to server | -        |
- **Notes:**
  - RFC 1035 allows hyphens in domain names (except at the start/end of a label). The system behaviour is the same.
  - RFC 1035 allows subdomains. The system behaviour is the same.
  - most API reject email with no dot in domain. The system allows it.
  - RFC 1035 states that domain label must contain at least one alphanumeric character before and after the dot. The system behaviour is the same.
  - RFC 5322 does not allow unescaped whitespaces. The system behaviour is the same.
  - RFC 5322 does not allow dots in unquoted local-parts of an email address. The system behaviour is the same.
  - RFC 5322 does not allow control characters (\n, \t). The system behaviour is the same.
  - System behavior is partly aligned with RFCs, but expected rules for email validation are not documented.
- **Attachments:** test_logs/log-20250802T194313.log



## EXP_RPT_API_04 Register with Various Passwords

- **Environment:** :Postman
- **Component:** Registration API
- **Test ID:** EXP_API_REG_04
- **Purpose:** explore how the system handles registration using various passwords
- **Test info:** automated test method `EXP_API_REG_04()`
- **Test data:**
  1. ``{ "username": "test1754157208522@example.com", "password": "P@ssw0rd?" }`` - allowed special character (@$#^&*!) and also not listed special character
  2. ``{ "username": "test1754163739867@example.com", "password": "P@s'"\/<>`;8" }`` - allowed special characters and '"\/<>`
  3. ``{ "username": "test1754163901212@example.com", "password": "P@ss w0rd" }`` - whitespace
  4. ``{ "username": "test1754164036005@example.com", "password": "P@ss\nw0rd" }`` - new line character
  5. ``{ "username": "test1754164138206@example.com", "password": "P@ss\tw0rd" }`` - tabulation
  6. ``{ "username": "test1754164301962@example.com", "password": "Passw0rd?" }`` - [add] not listed special characters without allowed special characters

- **Steps:**
  1. send a POST request to the registration endpoint
  2. if registration was successful try to log in using the same credentials
- **Results:**
  - data sets 1, 3 are accepted for registration and log in
  - data sets 2, 4, 5 cause server error - BUG_API_04
  - data set 6 is rejected

  | Data | Password     | Result                    | Log in |
  |------|--------------|---------------------------|--------|
  | 1    | P@ssw0rd?    | 200 OK                    | 200 OK |
  | 2    | P@s'"\/<>`;8 | 500 Internal Server Error |        |
  | 3    | P@ss w0rd    | 200 OK                    | 200 OK |
  | 4    | P@ss\nw0rd   | 500 Internal Server Error |        |
  | 5    | P@ss\tw0rd   | 500 Internal Server Error |        |
  | 6    | Passw0rd?    | 400 Bad Request           |        |

- **Notes:**
  - Error handling should be reviewed — the API must not return server errors for invalid input.
  - Requirements should explicitly cover allowed and not allowed special characters
- **Attachments:** src/test/postman/postman_reg_test_run.json

## EXP_RPT_API_05 Register with Invalid Header

- **Environment:** :Postman
- **Component:** Registration API
- **Test ID:** EXP_API_REG_05
- **Purpose:** investigate how the API handles an invalid Content-Type header.
- **Steps**
  1. send POST request to registration endpoint
    * Header: ``Content-Type: text/plain``
    * Body: ``{ "username": "Dudley_Steuber@example.com", "password": "P@ssw0rd" }``
- **Results**:
  1. API returns 500 Internal Server Error - BUG_API_05
- **Attachments:** src/test/postman/postman_reg_test_run.json

## EXP_RPT_API_06 Register with Malformed JSON Body

- **Environment:** :Postman
- **Component:** Registration API
- **Test ID:** EXP_API_REG_06
- **Purpose:** examine API behavior when receiving improperly formatted JSON.
- **Steps:** 
  1. Send POST request with malformed JSON (without comma) ``{ "username": "Giovani39@example.com" "password": "P@ssw0rd" }``
- **Results**:
  1. API returns 500 Internal Server Error - BUG_API_06
- **Attachments:** src/test/postman/postman_reg_test_run.json
