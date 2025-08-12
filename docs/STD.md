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

| ID           | Title                                           | Level | Component    | Tool    | Reason for Inclusion           |
|--------------|-------------------------------------------------|-------|--------------|---------|--------------------------------|
| API_REG_P_01 | Register with Valid Credentials                 | API   | Registration | Java    | Functional flow                |
| API_REG_N_01 | Register with Missing Email                     | API   | Registration | Postman | Functional flow, format errors |
| API_REG_N_04 | Register with Invalid Password                  | API   | Registration | Java    | Functional flow                |
| API_REG_N_05 | Register with Duplicate Email                   | API   | Registration | Java    | Functional flow                |
| API_LOG_P_01 | Log in with Registered Email                    | API   | Login        | Java    | Functional flow                |
| API_LOG_N_01 | Log in with Unregistered Email                  | API   | Login        | Java    | Functional flow                |
| API_LOG_N_02 | Log in with Registered Email but Wrong Password | API   | Login        | Java    | Functional flow                |

## Exploratory Tests

| ID             | Title                             | Level | Component    | Tool    | Reason for Inclusion |
|----------------|-----------------------------------|-------|--------------|---------|----------------------|
| EXP_API_REG_01 | Register with Capitalized Email   | API   | Registration | Java    | Practice             |
| EXP_API_REG_02 | Register with Long Email          | API   | Registration | Java    | Practice             |
| EXP_API_REG_03 | Register with Various Emails      | API   | Registration | Java    | Edge cases           |
| EXP_API_REG_04 | Register with Various Passwords   | API   | Registration | Postman | Edge cases, security |
| EXP_API_REG_05 | Register with Invalid Header      | API   | Registration | Postman | Format errors        |
| EXP_API_REG_06 | Register with Malformed JSON Body | API   | Registration | Postman | Format errors        |
