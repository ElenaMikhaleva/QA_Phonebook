
# Overview

**STP Identifier:** STP-v3 
**Project Name:** Phonebook Testing Authentication Testing
**Date Created:** 12/08/2025  
**Version:** v3.0  
**Responsibilities:** creation of STP, STD, test execution, STR — Elena Mikhaleva

## Test Objectives
- Validate registration and login APIs
- Validate registration and login flows through the UI
- Validate navigation and page transitions in authentication flow
- Validate correct integration between UI and API
- Testing limited to the subset of test cases selected for this cycle, prioritizing critical scenarios and tests valuable for practice and learning

## Scope of Testing
- API Level: validation rules (email format, password complexity, required fields), functional and boundary testing 
- UI Level: functional flows, error message display, navigation, form validation, security behaviors

## Test Case Management

- All designed test cases are documented in TC Repository
- For this test cycle, a prioritized subset of test cases has been selected for execution

## Out of Scope
- Features requiring user to be logged in (e.g., role management, admin features)
- Performance, load, and stress testing
- Test cases outside the selected subset for this cycle

## Testing Type
- Gray-box testing (functional, boundary, and integration testing at API and UI levels)

## Testing Tools

### Programming

- Java 17.0.12 – Automated testing environment
- Gradle – Build and dependency management tool
- Lombok 1.18.28 – Simplified Java code via annotations
- Git – Version control system

### API Testing

- Postman 11.57.0 – API testing with automated test scripts
- REST Assured 4.5.1 – Automated API testing
- JSON Schema Validator 3.0.0 – API response schema validation
- Gson 2.8.6 – JSON parsing for automated tests

### UI Testing

- Selenium Java 4.26.0 – UI automated testing
- ChromeDriver – Browser driver for Selenium UI tests
- Chrome DevTools – Browser developer tool for UI inspection, checking network calls manually

### Test Management

- TestNG 7.11.0 – Test execution and reporting framework
- Logback Classic 1.5.18 – Logging framework for test execution output
- Google Sheets – Spreadsheet tool for creating documentation

## Test Entry Criteria
1. Approved and finalized requirements
2. Prioritized test case subset selected
3. Test environment and tools set up
4. Spot checks passed, no critical blockers

## Item Pass/Fail Criteria
- No defects remaining in ‘Not Fixed’ state blocking authentication functionality

## Test Exit Criteria
- All critical test cases passed
- No open blockers or critical defects

## Schedule
1. Planning: 12/08/2025
2. Test Design: 15/08/2025
3. First Test Session: 22/08/2025
4. Reports & Delivery: 25/08/2025

## Risks
- Incomplete product requirements
- Unstable API/UI builds

## Environments
- Publicly accessible site
- Google Chrome version 139.0.7258.127 (Official Build) (64-bit)
- Postman version 11.55.5
- Java version 17.0.12
- IntelliJ IDEA 2025.1.1.1 (Community Edition)
- Selenium Java 4.26.0

# What will be tested
- Registration API flow with valid and invalid data
- Login flow API with valid and invalid data
- Registration UI flow with valid and invalid data
- Login UI flow with valid and invalid data
- Boundary testing for email and password fields
- Error handling and validation messages 
- Secure handling of user data
- Integration between UI actions and API responses
- Only test cases selected for this cycle will be executed; others remain documented in the TC Repository for future cycles