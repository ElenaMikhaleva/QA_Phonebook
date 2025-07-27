# Overview

**STR identifier:**	PHONEBOOK-STR-v1.0-27-07-2025<br>
**Date created:** 27/07/2025<br>
**Version:** v1.0<br>

# Test Scope
Chosen tests for execution.

## Registration API

| TC ID             | Title                                              | Tools         | Reason for Inclusion                         |
|-------------------|----------------------------------------------------|---------------|----------------------------------------------|
| API-REG-EML-P-001 | Register with valid credentials                    | Postman, Java | Basic functional flow, also validates log in |
| API-REG-EML-P-004 | Register with Email of max length                  | Java          | Boundary testing                             |
| API-REG-EML-N-001 | Register with empty Email                          | Postman       | Error handling                               |
| API-REG-EML-N-012 | Register with Email with diacritic letters         | Postman       | Error handling                               |
| API-REG-EML-N-018 | Register with Email that has unicode emoji         | Postman       | Input validation edge                        |
| API-REG-EML-N-021 | Register with Email exceeding max length           | Java          | Boundary testing                             |
| API-REG-PWD-N-008 | Register with Password that has '/"\,.:;<>         | Java          | Exploratory testing, security                |
| API-REG-PWD-N-014 | Register with too short Password                   | Java          | Boundary testing                             |
| API-REG-PWD-N-013 | Register with too long Password                    | Java          | Boundary testing                             |
| API-REG-EXS-N-001 | Register with existing Email and existing Password | Java          | Error handling                               |
| API-REG-FRM-N-002 | API call with malformed JSON body                  | Postman       | API format robustness                        |

# Execution Summary

Test Artifacts:
* Postman collection: src/test/postman/Postman_collection.json
* Collection run results: src/test/postman/Postman_test_run.json

# Test Reports


