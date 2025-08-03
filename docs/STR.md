# Overview

**STR identifier:**	STR_v3<br>
**Date created:** 03/08/2025<br>
**Version:** v3.0<br>

# Test Scope
Chosen tests for execution.<br>
Focused on testing the Registration, Login, and Get All Contacts APIs, including exploratory testing performed using Java and Postman.<br>

## Registration API

| TC ID        | Title                           | Tools   | Reason for Inclusion           | Status        | Bug ID     |
|--------------|---------------------------------|---------|--------------------------------|---------------|------------|
| API_REG_P_01 | Register with Valid Credentials | Java    | Functional flow                | Pass          |            |
| API_REG_N_01 | Register with Missing Email     | Postman | Functional flow, format errors | Failed #4     | BUG_API_04 |
| API_REG_N_04 | Register with Invalid Password  | Java    | Functional flow                | Failed #5, #7 | BUG_API_01 |
| API_REG_N_05 | Register with Duplicate Email   | Java    | Functional flow                | Failed        | BUG_API_02 |

| Test ID        | Title                             | Tools   | Reason for Inclusion | Report ID      | Bug ID     |
|----------------|-----------------------------------|---------|----------------------|----------------|------------|
| EXP_API_REG_01 | Register with Capitalized Email   | Java    | Practice             | EXP_RPT_API_01 | BUG_API_03 |
| EXP_API_REG_02 | Register with Long Email          | Java    | Practice             | EXP_RPT_API_02 |            |
| EXP_API_REG_03 | Register with Various Emails      | Java    | Edge cases           | EXP_RPT_API_03 |            |
| EXP_API_REG_04 | Register with Various Passwords   | Postman | Edge cases, security | EXP_RPT_API_04 | BUG_API_04 |
| EXP_API_REG_05 | Register with Invalid Header      | Postman | Format errors        | EXP_RPT_API_05 | BUG_API_05 |
| EXP_API_REG_06 | Register with Malformed JSON Body | Postman | Format errors        | EXP_RPT_API_06 | BUG_API_06 |

## Log in API

| TC ID        | Title                                               | Tools | Reason for Inclusion | Status | Bug ID     |
|--------------|-----------------------------------------------------|-------|----------------------|--------|------------|
| API_LOG_P_01 | Log in with Registered Email                        | Java  | Functional flow      | Pass   |            |
| API_LOG_N_01 | Log in with Unregistered Email                      | Java  | Functional flow      | Failed | BUG_API_07 |
| API_LOG_N_02 | Log in with Registered Email but Incorrect Password | Java  | Functional flow      | Failed | BUG_API_07 |

## Get All Contacts API

| TC ID        | Title                                            | Tools   | Reason for Inclusion | Status | Bug ID |
|--------------|--------------------------------------------------|---------|----------------------|--------|--------|
| API_ALL_P_01 | Get all contacts when user has no contacts       | Postman | Edge case            |        |        |
| API_ALL_P_02 | Get all contacts when user has exactly 1 contact | Java    | Edge case            |        |        |
| API_ALL_P_04 | Get all contacts with special characters         | Java    | Character encoding   |        |        |
| API_ALL_N_01 | Get all contacts without authentication          | Postman | Security             |        |        |
| API_ALL_N_02 | Get all contacts with invalid token              | Postman | Security             |        |        |

| Test ID        | Title                                          | Tools   | Reason for Inclusion | Report ID | Bug ID |
|----------------|------------------------------------------------|---------|----------------------|-----------|--------|
| EXP_API_ALL_01 | Get all contacts using invalid HTTP method     | Java    | Format error         |           |        |
| EXP_API_ALL_03 | Get all contacts with invalid query parameters | Postman | Format error         |           |        |

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

**Test Artifacts:**
- **Test Cases and Data:** docs/STD.md
- **Test Scripts:**
  - src/test/java/api_tests/RegistrationRestTests.java
  - src/test/java/api_tests/LoginRestTests.java
- **Test Execution Logs:** 
  - Automated Tests Logs:
    - test_logs/log-20250802T191609.log
    - test_logs/log-20250802T194313.log
    - test_logs/log-20250803T142445.log
- **Postman Runs:**
  - src/test/postman/postman_reg_test_run.json

# Bug Reports

## BUG_API_01 Register with Invalid Password

- **Environment:** Java, RestAssured
- **Severity:** Medium
- **Component:** Registration API
- **Test Case ID:** API_REG_N_04
- **Requirement Reference:** T10, T11, T12, T13, T14
- **Test info:** automated test method `API_REG_N_04()`
- **Test data:** 
  1. ``{ "username": "s2n@example.com", "password": "���SHpl63@@" }`` - [5] non-English letters
  2. ``{ "username": "4p3@example.com", "password": "Lh9&3g!wFxCL$Sh7" }`` - [7] too long (16 symbols)
- **Steps:**
  1. Send POST request to registration endpoint with JSON from data
- **Expected Result:**
  1. API returns 400
  2. Error message
- **Actual Result:**
  1. API returns 200 OK
  2. API returns token
- **Attachments:** test_logs/log-20250802T191609.log

## BUG_API_02 Register with Duplicate Email

- **Environment:** Java, RestAssured
- **Severity:** Medium
- **Component:** Registration API
- **Test Case ID:** API_REG_N_05
- **Requirement Reference:** Swagger
- **Test info:** automated test method `API_REG_N_05()`
- **Test data:**
  1. ``{ "username": "wuw5z9a@test.com", "password": "Ex8^ng0R*G2y" }``, ``{ "username": "wuw5z9a@test.com", "password": "Ex8^ng0R*G2y" }`` - same password
  2. ``{ "username": "qjih@example.com", "password": "Wc8!a&RgKTJ0" }``, ``{ "username": "qjih@example.com", "password": "Ih1^IOr$U8Xk" }`` - new password
- **Steps:**
  1. Send POST request to registration endpoint with first data set
  2. Send POST request to registration endpoint with second data set
- **Expected Result:**
  1. API returns 409
  2. Body with message type Object
  3. Error message "User already exists"  
- **Actual Result:**
  1. API returns 409 Conflict
  2. Message type is String
  3. Error message "User already exists"
- **Attachments:** test_logs/log-20250802T191609.log

## BUG_API_03 Log in with Capitalized Email

- **Environment:** Java, RestAssured
- **Severity:** Medium
- **Component:** Log in API
- **Test ID:** bug is found while executing EXP_API_REG_01
- **Test info:** automated test method `EXP_API_REG_01()`
- **Steps:**
  1. send POST request ``{ "username": "KUVFqtnb@example.com", "password": "Tf8&NvXs&zhL" }``
  2. if registration is successful, attempt to log in with the same credentials
- **Expected Result:**
  1. Registration API returns 200
  2. Log in API returns 200
- **Actual Result:**
  - Log in API returns 401 Unauthorized
  - only login with fully lowercase email succeeded
- **Attachments:** test_logs/log-20250802T191609.log

## BUG_API_04 Register with Missing Email

- **Environment:** Postman
- **Severity:** Medium
- **Component:** Registration API
- **Test ID:** API_REG_N_01
- **Requirement Reference:** requirement T1, T2, Swagger
- **Test data:** ``{ "username": " ", "password": "#2Breakfast!" }`` - [4] whitespace instead of email
- **Steps:** 
  1. send POST request for registration endpoint
- **Expected Result:**
  1. API returns 400
  2. Message '"username": "must not be blank"'.
- **Actual Result:**
  1. API returns 400
  2. No message in the body JSON
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_API_04 Register with Various Passwords

- **Environment:** Postman
- **Severity:** Medium
- **Component:** Registration API
- **Test ID:** bug is found while executing EXP_RPT_API_04
- **Test Data:**
  1. ``{ "username": "test1754163739867@mail.com", "password": "P@s'"\/<>`;8" }`` - [2] allowed special characters and '"\/<>`
  2. ``{ "username": "test1754164036005@mail.com", "password": "P@ss\nw0rd" }`` - [4] new line character
  3. ``{ "username": "test1754164138206@mail.com", "password": "P@ss\tw0rd" }`` - [5] tabulation
- **Steps:**
  1. send POST request for registration endpoint
- **Expected Result:**
  1. API returns 200 OK or 400 Bad Request
  2. Password is handled safely
- **Actual Result:**
  1. API returns 500 Internal Server Error
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_API_05 Register with Invalid Header

- **Environment:** Postman
- **Severity:** Medium
- **Component:** Registration API
- **Test ID:** bug is found while executing EXP_API_REG_05
- **Steps**
  1. send POST request to registration endpoint
    - Header: ``Content-Type: text/plain``
    - Body: ``{ "username": "Dudley_Steuber@gmail.com", "password": "P@ssw0rd" }``
- **Expected Result:**
  1. API returns code < 500 (e.g., 415 Unsupported Media Type)
  2. Clear error message
- **Actual result:**
  1. API returns 500 Internal Server Error
  2. Message "Content type 'text/plain;charset=UTF-8' not supported"
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_API_06 Register with Malformed JSON Body

- **Environment:** Postman
- **Severity:** Medium
- **Component:** Registration API
- **Test ID:** bug is found while executing EXP_API_REG_06
- **Steps:**
  1. Send POST request with malformed JSON (without comma) ``{ "username": "Giovani39@example.com" "password": "P@ssw0rd" }``
- **Expected Result:**
  1. API returns code < 500
  2. Clear error message
- **Actual result:**
  1. API returns 500 Internal Server Error
  2. Message "JSON parse error: Unexpected character ('\"' (code 34)): was expecting comma to separate Object entries"
- **Attachments:** src/test/postman/postman_reg_test_run.json

## BUG_API_07 Log in with Unregistered Email

- **Environment:** Java, RestAssured
- **Severity:** Medium
- **Component:** Log in API
- **Test ID:** API_LOG_N_01
- **Test info:** automated test method `API_LOG_N_01()`
- **Steps:**<br>
  1. Send POST request
     ``{
       "username": "vht@example.com",
       "password": "Wx4^A#$F!AQ4"
     }``
- **Expected Result:**
  1. API returns 401
  2. Error message as Object with text "Login or Password incorrect"
- **Actual result:**
  1. API returns 401 Unauthorized
  2. Error message as String "Login or Password incorrect"
- **Attachments:** test_logs/log-20250803T142445.log

## BUG_API_08 Log in with Registered Email but Incorrect Password

- **Environment:** Java, RestAssured
- **Severity:** Medium
- **Component:** Log in API
- **Test ID:** API_LOG_N_02
- **Test info:** automated test method `API_LOG_N_02()`
- **Preconditions:** send POST request to registration endpoint ``{ "username": "eug@example.com", "password": "Qu5#MFf64NGJ" }``
- **Steps:**<br>
  1. Send POST request to log in endpoint
     ``{
       "username": "eug@example.com"
       "password": "Ea6!^w5hJQWt"
     }``
- **Expected Result:**
  1. API returns 401
  2. Error message as Object with text "Login or Password incorrect"
- **Actual result:**
  1. API returns 401 Unauthorized
  2. Error message as String "Login or Password incorrect"
- **Attachments:** test_logs/log-20250803T142445.log

# Exploratory Test Reports

## EXP_RPT_API_01 Register with Capitalized Email

- **Environment:** Java, RestAssured
- **Component:** Registration API
- **Test ID:** EXP_API_REG_01
- **Purpose:**  investigate whether the API treats email addresses as case-sensitive or case-insensitive, and if consistent login behavior is maintained.
- **Test info:** automated test method `EXP_API_REG_01()`
- **Steps:**
  1. send POST request ``{ "username": "KUVFqtnb@example.com", "password": "Jm6$C4sOAV!J" }`` to registration endpoint
  2. if registration is successful, attempt to log in with
     1. ``{ "username": "KUVFqtnb@example.com", "password": "Jm6$C4sOAV!J" }``
     2. ``{ "username": "kuvfqTNB@example.com", "password": "Jm6$C4sOAV!J" }``
     3. ``{ "username": "kuvfqtnb@example.com", "password": "Jm6$C4sOAV!J" }``
  3. if registration is successful, attempt to register using:
     1. ``{ "username": "kuvfqtnb@example.com", "password": "Jm6$C4sOAV!J" }``
     2. ``{ "username": "KUVFQTNB@example.com", "password": "Jm6$C4sOAV!J" }``
- **Results:**
  - email with casing is registered
  - the system normalizes email addresses to lowercase internally
  - login with original casing fails even though it was the email used during registration - BUG_API_03
  - only login with fully lowercase email succeeded
  - attempts to re-register the same email in any casing were correctly blocked

  | Step | Action   | Email                | Result           | Token                         |
  |------|----------|----------------------|------------------|-------------------------------|
  | 1    | Register | KUVFqtnb@example.com | 200 OK           | "sub": "kuvfqtnb@example.com" |
  | 2.1  | Log in   | kuvfqTNB@example.com | 401 Unauthorized |                               |
  | 2.2  | Log in   | kuvfqTNB@example.com | 401 Unauthorized |                               |
  | 2.3  | Log in   | kuvfqtnb@example.com | 200 OK           | "sub": "kuvfqtnb@example.com" |
  | 3.1  | Register | kuvfqtnb@example.com | 409 Conflict     |                               |
  | 3.2  | Register | KUVFQTNB@example.com | 409 Conflict     |                               |

- **Notes:**
  - results suggest that email casing is normalized for registration and conflict detection, but not for login authentication
  - results are inconsistent, likely a usability issue.
- **Attachments:** test_logs/log-20250802T191609.log

## EXP_RPT_API_02 Register with Long Email

- **Environment:** Java, RestAssured
- **Component:** Registration API
- **Test ID:** EXP_API_REG_02
- **Purpose:** explore how the system handles long email addresses.
- **Test info:** automated test method `EXP_API_REG_02()`
- **Test data:**
  1. ``{ "username": "kk6fcwzxk8owyf0y7qk7rzd8xh2wlj7td38mb7r35ct54c05vuer0gmsldglppvv@iwddioqvisamtqexvdxanuhrwolsueunsqdpaffqcwlixwjkbsbuudnvahhouxojghybajrfzaibrtuwinyigzilvhmywuolgfakchbeynzgcdujyhlmzbdgkcqjrnwzehadrlojslgqkzwpzaojmkqzywlbtnfbvjasbngymuvnlodlwigcigskp.com", "password": "Dr7$v79@6605" }``- email 254 characters length
  2. ``{ "username": "t7plysw8eg1qzpf9ewclcm2oklg4plkmxc3kgl18sc7h1gvwlpnv5o76rm57ydq3b@myfdiyslbbtrzlzihhpowxdedwzmnnbrkoacrykbibhodkfsayhqckcljwqryffvgldvnsylnctgrzsdawsxlfwtznekpccrtkunwgbyvmbjlmmfxxdznloruwmtcrnrsnjndsmaifozwwrbesufvhechbqvqjerkgcbrgxodjdkhedxitlhdcixt.com", "password": "Gb8!O^U&bN*a" }`` - email 255 characters length<br>
  additional test data:<br>
  3. ``{ "username": "kvv68jwx0b4ab5lqdcqo5iw0ulawxybmr23bpy7kufpwksjmusvdib0xihh1zlzn29@test.com", "password": "Ma3#!Y1kP$Yc" }`` - email 75 characters length
  4. ``{ "username": "h9ukof1xo7n9wab82nzbtgjduz5nw6z3gsqewjby2joje19syt5rqa994rvr9n@example.com", "password": "Rp8!!s0cc0@c" }`` - email 74 characters length
- **Steps:**
  1. send a POST request to the registration endpoint
  2. if registration was successful try to log in using the same credentials
- **Results:**
  - registration with email 254, 255 and 75 characters long fail with 400 Bad Request and message `"username":"must be a well-formed email address"`
  - registration with email 74 characters long is successful
  - log in with email 74 characters long is successful
- **Notes:**
  - the system enforces an email length limit below 75 characters, which does not align with common standards (e.g., 254-character limit per RFC).
  - The maximum allowed email length is not defined in the current requirements, making it unclear whether this behavior is intended or a validation defect.
- **Attachments:** test_logs/log-20250802T191609.log

## EXP_RPT_API_03 Register with Various Emails

- **Environment:** Java, RestAssured
- **Component:** Registration API
- **Test ID:** EXP_API_REG_03
- **Purpose:** explore how the system handles registration with different emails. Confirm whether the system accepts and processes these formats correctly during both registration and login.
- **Test info:** automated test method `EXP_API_REG_03()`
- **Test data:**
  1. ``{ "username": "ouryx@test-example.com", "password": "Zb9*@7GsLgnE" }`` - hyphen in domain
  2. ``{ "username": "ujscl@test.example.com", "password": "Ke6@5Dx@vBQG" }`` - email with subdomains
  3. ``{ "username": "qkbjd@examplecom", "password": "Hs9$vHSDhfo9" }`` - no dot in domain
  4. ``{ "username": "mthlq@.com", "password": "Ez2@aIYhL3BO" }`` - no char before dot in domain
  5. ``{ "username": "lqlzu@example.", "password": "Eg7$0zjyxREi" }`` - no char after dot in domain
  6. ``{ "username": "bm..hf@example.com", "password": "Qx6!Ceyv03kA" }`` - multiple dots
  7. ``{ "username": " vxdnr@example.com", "password": "Wi1@&FtCoqQp" }`` - leading whitespace
  8. ``{ "username": "my zp@example.com", "password": "Wc0$ifE2F3pG" }`` - internal whitespace
  9. ``{ "username": "krnxb@example.com ", "password": "Pu4&uB0ZSIFu" }`` - trailing whitespace
  10. ``{ "username": "opnlg😈@example.com", "password": "Yo8$!sDCCrln" }`` - emoji
  11. ``{ "username": "vm\nvl@example.com", "password": "Ak6!WRsE&!0n" }`` - new line character
  12. ``{ "username": "cy\tei@example.com", "password": "Fo4$AoeiIb2c" }`` - tabulation
- **Steps:**
  1. send a POST request to the registration endpoint
  2. if registration was successful try to log in using the same credentials
- **Results:**
  - data sets 1, 2 are accepted by the system. They are also valid according to RFC 1035
  - data set 3 is accepted, although most API reject email with no dot in domain
  - data sets 4, 5, 7, 8 are rejected. They are also prohibited by RFC 1035
  - data sets 6, 11, 12 are rejected. They are also prohibited by RFC 5322
  - no login attempt was made for failed registrations — as expected

    | Data | Email                  | Result          | Log in |
    |------|------------------------|-----------------|--------|
    | 1    | ouryx@test-example.com | 200 OK          | 200 OK |
    | 2    | ujscl@test.example.com | 200 OK          | 200 OK |
    | 3    | qkbjd@examplecom       | 200 OK          | 200 OK |
    | 4    | mthlq@.com             | 400 Bad Request |        |
    | 5    | lqlzu@example.         | 400 Bad Request |        |
    | 6    | bm..hf@example.com     | 400 Bad Request |        |
    | 7    | vxdnr@example.com      | 400 Bad Request |        |
    | 8    | my zp@example.com      | 400 Bad Request |        |
    | 9    | krnxb@example.com      | 400 Bad Request |        |
    | 10   | opnlg😈@example.com    | 400 Bad Request |        |
    | 11   | vm\nvl@example.com     | 400 Bad Request |        |
    | 12   | cy\tei@example.com     | 400 Bad Request |        |

- **Notes:**
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