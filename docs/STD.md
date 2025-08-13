# Overview

**STD Identifier:** STD-v4<br>
**Date Created:** 12/08/2025<br>
**Version:** v4.0<br>
All data is example, actual data is generated for each execution.

# Content

1. Summary of TCs<br>
  1.1 Scenario Test Cases<br>
  1.2 Exploratory Tests<br>

# Summary of TCS

## Scenario Test Cases

| ID           | Title                           | Level | Component    | Automation       | Reason for Inclusion                |
|--------------|---------------------------------|-------|--------------|------------------|-------------------------------------|
| API_REG_P_01 | Register with Valid Credentials | API   | Registration | Automated        | Functional flow                     |
| API_REG_N_01 | Register with Missing Email     | API   | Registration | Manual (Postman) | Functional flow, format errors      |
| API_REG_N_04 | Register with Invalid Password  | API   | Registration | Automated        | Functional flow                     |
| API_REG_N_05 | Register with Duplicate Email   | API   | Registration | Automated        | Functional flow                     |
| API_LOG_P_01 | Log in with Registered Email    | API   | Login        | Automated        | Functional flow                     |
| API_LOG_N_01 | Log in with Unregistered Email  | API   | Login        | Automated        | Functional flow                     |
| API_LOG_N_02 | Log in with Wrong Password      | API   | Login        | Automated        | Functional flow                     |
| UI_NAV_P_01  | Open Home Page from Navigation  | UI    | Navigation   | Automated        | Basic navigation link               |
| UI_REG_P_01  | Register with Valid Credentials | UI    | Registration | Automated        | Functional flow                     |
| UI_REG_P_02  | Register with Copy-Paste        | UI    | Registration | Manual           | Functional flow                     |
| UI_REG_N_01  | Register with Missing Email     | UI    | Registration | Manual           | Missing of the key field            |
| UI_REG_N_03  | Register with All Empty Fields  | UI    | Registration | Manual           | Error handling                      |
| UI_REG_N_04  | Register with Invalid Email     | UI    | Registration | Automated        | Field validation on the client side |
| UI_REG_N_06  | Register with Duplicate Email   | UI    | Registration | Automated        | Functional flow                     |
| UI_REG_N_07  | Register with Rapid Clicking    | UI    | Registration | Manual           | Preventing duplicate submissions    |
| UI_LOG_P_01  | Log in with Valid Credentials   | UI    | Login        | Automated        | Functional flow                     |
| UI_LOG_P_03  | Log in with with Autofill       | UI    | Login        | Manual           | Functional flow                     |
| UI_LOG_N_01  | Log in with Unregistered Email  | UI    | Login        | Automated        | Error handling                      |

## Exploratory Tests

| ID             | Title                             | Level | Component    | Automation       | Reason for Inclusion |
|----------------|-----------------------------------|-------|--------------|------------------|----------------------|
| EXP_API_REG_01 | Register with Capitalized Email   | API   | Registration | Automated        | Practice             |
| EXP_API_REG_02 | Register with Long Email          | API   | Registration | Automated        | Practice             |
| EXP_API_REG_03 | Register with Various Emails      | API   | Registration | Automated        | Edge cases           |
| EXP_API_REG_04 | Register with Various Passwords   | API   | Registration | Manual (Postman) | Edge cases, security |
| EXP_API_REG_05 | Register with Invalid Header      | API   | Registration | Manual (Postman) | Format errors        |
| EXP_API_REG_06 | Register with Malformed JSON Body | API   | Registration | Manual (Postman) | Format errors        |
| EXP_UI_NAV_01  | Navigate Using Keyboard           | UI    | Navigation   | Automated        | Practice             |
| EXP_UI_REG_02  | Register with Various Emails      | UI    | Registration | Manual           | Edge cases           |
| EXP_UI_LOG_01  | Fill and Submit Using Keyboard    | UI    | Login        | Automated        | Practice             |
| EXP_UI_LOG_03  | Log in with Various Passwords     | UI    | Login        | Manual           | Edge cases           |
