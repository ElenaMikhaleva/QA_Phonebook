
# Overview

**STP Identifier:** PHONEBOOK-STP-v1.0-30-06-2025  
**Project Name:** Phonebook Testing  
**Date Created:** 30/06/2025  
**Version:** v1.0  
**Responsibilities:** Creation of STP, STD, test execution, STR — Elena Mikhaleva

## Test Objectives
- Validate Registration API
- Validate Log in API

## Scope of Testing
- API-level validation rules (email format, password complexity, required fields)
- Functional and boundary testing of selected APIs

## Out of Scope
- Features requiring user to be logged in (e.g., role management, admin features)

## Testing Type
- Gray-box testing (API functional and boundary testing)

## Testing Tools
- Postman
- Java

## Test Entry Criteria
1. Approved and finalized requirements
2. Test cases ready
3. Test environment and tools set up
4. Spot checks passed, no critical blockers

## Item Pass/Fail Criteria
- No defects remaining in ‘Not Fixed’ state blocking progress

## Test Exit Criteria
- All critical test cases passed
- No open blockers or critical defects

## Schedule
1. Planning: 30/06/2025
2. Test Design: 17/07/2025
3. First Test Session: 27/07/2025
4. Reports & Delivery: 10/08/2025

## Risks
- Insufficient product requirements
- Lack of technical resources
- New functionality added mid-sprint

## Environments
- Publicly accessible working site used for all test sessions
- Postman version 11.55.5
- Java version 17.0.12
- IntelliJ IDEA 2025.1.1.1 (Community Edition)

# What will be tested
- Registration flow with valid and invalid data
- Log in flow with valid and invalid data
- Boundary testing (email and password fields)
- Error handling and validation messages 
- Secure handling of user data