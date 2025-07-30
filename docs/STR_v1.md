# Overview

**STR identifier:**	STR_v1<br>
**Date created:** 27/07/2025<br>
**Version:** v1.0<br>

# Test Scope
Chosen tests for execution.

## Registration API

| TC ID             | Title                                              | Tools         | Reason for Inclusion             | Status | Bug ID         |
|-------------------|----------------------------------------------------|---------------|----------------------------------|--------|----------------|
| API_REG_EML_P_01 | Register with valid credentials                    | Postman, Java | Basic functional flow (+ log in) | Passed |                |
| API-REG-EML-P-004 | Register with Email of max length                  | Java          | Boundary testing                 | Failed | BUG-API-REG-01 |
| API-REG-EML-N-001 | Register with empty Email                          | Postman       | Error handling                   | Passed |                |
| API-REG-EML-N-012 | Register with Email with diacritic letters         | Postman       | Error handling                   | Failed | BUG-API-REG-02 |
| API-REG-EML-N-018 | Register with Email that has unicode emoji         | Postman       | Input validation edge            | Passed |                |
| API-REG-EML-N-021 | Register with Email exceeding max length           | Java          | Boundary testing                 | Passed |                |
| API-REG-PWD-N-008 | Register with Password that has '/"\,.:;<>         | Postman       | Exploratory testing, security    | Passed |                |
| API-REG-PWD-N-012 | Register with too short Password                   | Java          | Boundary testing                 | Passed |                |
| API-REG-PWD-N-013 | Register with too long Password                    | Java          | Boundary testing                 | Failed | BUG-API-REG-03 |
| API-REG-EXS-N-001 | Register with existing Email and existing Password | Java          | Included for practice            | Failed | BUG-API-REG-04 |
| API-REG-FRM-N-002 | API call with malformed JSON body                  | Postman       | Included for practice            | Failed | BUG-API-REG-05 |

## Log in API

| TC ID             | Title                                             | Tools         | Reason for Inclusion  | Status | Bug ID |
|-------------------|---------------------------------------------------|---------------|-----------------------|--------|--------|
| API-LOG-EML-N-003 | Log in with blank Email                           | Postman       | Error handling        |        |        |
| API-LOG-PWD-N-001 | Log in with existing Email but incorrect Password | Postman, Java | Included for practice |        |        |
| API-LOG-FRM-N-001 | API call with invalid Content-Type header         | Postman       | Included for practice |        |        |

## Get All Contacts API

| TC ID             | Title                                      | Tools   | Reason for Inclusion | Status | Bug ID |
|-------------------|--------------------------------------------|---------|----------------------|--------|--------|
| API-CON-ALL-P-001 | Get all contacts when user has no contacts | Postman | Edge case            |        |        |
| API-CON-ALL-P-002 | Get all contacts when user has contacts    | Java    | Core functional test |        |        |
| API-CON-ALL-N-001 | Get all contacts without authentification  | Postman | Security, practice   |        |        |
| API-CON-ALL-N-002 | Get all contacts with invalid token        | Postman | Security, practice   |        |        |

# Execution Summary

11 tests executed, 6 passed, 5 failed

Test Artifacts:
* Postman collection: src/test/postman/postman_collection.json
* src/test/java/api_tests/RegistrationTests.java

# Bug Reports

## BUG-API-REG-01
**Title:** Registration fails for valid max-length email address (254 characters total)<br>
**Environment:** Java, RestAssured<br>
**Severity:** Medium<br>
**Component:** Registration API<br>
**Test Case ID:** API-REG-EML-P-004<br>
**Requirement Reference:** assumed based on RFC 3696<br>
**Test info:** automated test method `reg_PositiveTest_maxEmail_200()`<br>

**Steps:**<br>
1. Send POST request to endpoint /v1/user/registration/usernamepassword with the following JSON:<br>
   ```
   {
      "username": "jn6azzznw43hs5pz4kpnk5uziixx9a8lu498lzw2q8gkb4f1jx9kmk27dl31dui5@f5rgmerzfypn77p8nzswa721x6m7840d2aaal31fk4ktukd9g4k1ffe9z66q13o84rfmgatp472d1pp0g2fd136lj5r20b1spolhqsnfof3hp6t1y3uygvf7wn9zl5cvo1q130ryosmt8ebj0p5vckg07gztrw49mmk8n3i2765rnhtv2lwddimjv.com",
      "password": "&2Diacritic"
   }
   ```
   Local_part length is 64 char, domain part length is 189 char, total length is 254 char.

**Expected Result:**<br>
1. API returns 200.
2. API returns token.
3. User is successfully registered.
4. User can log in with the same credentials<br>

**Actual Result:**<br>
1. API returns 400 Bad Request.
2. User is not registered<br>

**Attachments:**<br>
* test_logs/log-20250729T213419.log

## BUG-API-REG-02

**Title:** API accepts email with diacritic character (è) — should return 400 Bad Request<br>
**Environment:** Postman<br>
**Severity:** Medium<br>
**Component:** Registration API<br>
**Test Case ID:** API-REG-EML-N-012<br>
**Requirement Reference:** T6 Customer email - English only letters<br>
**Steps:**<br>
1. Send POST request to endpoint /v1/user/registration/usernamepassword with the following JSON:<br>
   ```
   {
   "username": "pïppiñtŏk@gmail.com,
   "password": "&2Diacritic
   }
   ```
**Expected Result:**<br>
1. API returns 400 Bad Request
2. Response body is:
    ```
    { "username": "must be a well-formed email address" }
    ```
3. User is not registered<br>

**Actual Result:**<br>
1. API returns 200 OK.
2. Token is issued.
3. User is registered<br>

**Attachments:**<br>
* Collection run results: src/test/postman/reg_test_run.json

## BUG-API-REG-03

**Title:** Register with too long Password<br>
**Environment:** Java, RestAssured<br>
**Severity:** Medium<br>
**Component:** Registration API<br>
**Test Case ID:** API-REG-PWD-N-013<br>
**Requirement Reference:** requirement T15<br>
**Steps:**<br>
Send POST request with password length 16 symbols
``{
  "username": "pippinpassword@gmail.com",
  "password": "P@ssw0rdRightHer"
}``<br>

**Expected Result:**<br>
1. API returns 400
2. Error message

**Actual Result:**<br>
1. API returns 200 OK
2. Token is issued

**Attachments:**<br>
* test_logs/log-20250729T213419.log

## BUG-API-REG-04

**Title:** Register with existing Email and existing Password
**Environment:** Java, RestAssured<br>
**Severity:** Medium<br>
**Component:** Registration API<br>
**Test Case ID:** API-REG-EXS-N-001<br>
**Requirement Reference:** Swagger<br>
**Steps:**<br>
Send POST request
``{
  "username": "samecredentials@gmail.com",
  "password": "P@ssw0rd1"
}``<br>

**Expected Result:**
1. API returns 409
2. Error message with schema
``
{
  "timestamp": "2025-07-29T13:33:48.596Z",
  "status": 0,
  "error": "string",
  "message": {},
  "path": "string"
}
``<br>

**Actual Result:**<br>
1. API returns 409 Conflict
2. Message field in JSON is String, not object
``
{
  "timestamp":"2025-07-29T18:34:28",
  "status":409,
  "error":"Conflict",
  "message":"User already exists",
  "path":"/v1/user/registration/usernamepassword"
}
``

**Attachments:**<br>
* test_logs/log-20250729T213419.log

## BUG-API-REG-05

**Title:** API call with malformed JSON body<br>
**Environment:** Postman<br>
**Severity:** Medium<br>
**Component:** Registration API<br>
**Test Case ID:** API-REG-FRM-N-002<br>
**Requirement Reference:** assumed<br>
**Steps:**<br>
Send POST request with malformed JSON (without ',')
``{
  "username": "wrongheader@gmail.com"
  "password": "P@ssw0rd"
}``<br>

**Expected Result:**<br>
1. API returns 400
2. Error message

**Actual Result:**
1. API returns 500 Internal Server Error

**Attachments:**<br>
* Collection run results: src/test/postman/reg_test_run.json