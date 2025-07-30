# Overview

**STR identifier:**	STR_v2<br>
**Date created:** 30/07/2025<br>
**Version:** v2.0<br>

# Test Scope
Chosen tests for execution.

## Registration API

| TC ID        | Title                           | Tools | Reason for Inclusion           | Status | Bug ID |
|--------------|---------------------------------|-------|--------------------------------|--------|--------|
| API_REG_P_01 | Register with Valid Credentials | Java  | Functional flow (+ log in)     |        |        |
| API_REG_N_01 | Register with Missing Fields    | Java  | Functional flow, format errors |        |        |
| API_REG_N_04 | Register with Duplicate Email   | Java  | Functional flow                |        |        |

| TC ID          | Title                             | Tools   | Reason for Inclusion    | Status | Result ID |
|----------------|-----------------------------------|---------|-------------------------|--------|-----------|
| EXP_API_REG_01 | Register with Capitalized Email   | Postman | Practice                |        |           |
| EXP_API_REG_04 | Register with Various Passwords   | Postman | Edge cases, Security    |        |           |
| EXP_API_REG_05 | Register with Invalid Header      | Postman | Format errors, practice |        |           |
| EXP_API_REG_06 | Register with Malformed JSON Body | Postman | Format errors           |        |           |

