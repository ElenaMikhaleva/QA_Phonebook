
# Overview

**STP Identifier:** STP-v5<br>
**Project Name:** Phonebook Testing Authentication Testing<br>
**Date Created:** 07/10/2025<br>
**Version:** v5, added Mobile Testing<br>
**Responsibilities:** creation of STP, STD, test execution, STR — Elena Mikhaleva<br>

## Test Objectives
- Validate navigation and page transitions
- Validate registration and login APIs
- Validate registration and login flows through the UI
- Validate contact creation and contact list retrieval APIs
- Validate UI flows for adding and displaying contacts
- Validate correct integration between UI and API
- Validate mobile app behavior on various devices, orientations, and network conditions
- Test cases selected for this cycle prioritize critical scenarios and tests valuable for practice and learning

## Scope of Testing
- API Level: validation rules (email format, password complexity, required fields), functional and boundary testing 
- UI Level: functional flows, error message display, navigation, form validation, security behaviors
- Mobile Level: layout responsiveness, reliability, synchronization, compatibility, performance

## Test Case Management

- All designed test cases are documented in TC Repository
- For this test cycle, a prioritized subset of test cases has been selected for execution

## Out of Scope
- Features requiring user to be logged in (e.g., role management, admin features)
- Performance, load, and stress testing
- Test cases outside the selected subset for this cycle

## Testing Types
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

### Mobile Testing

- Android Studio Emulator – device emulation
- Appium – cross-platform mobile automation testing framework
- ADB (Android Debug Bridge) – device control and logging
- Chrome DevTools Remote Debugging – Mobile web inspection
- Physical Devices

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
1. Planning: 12/09/2025
2. Test Design: 20/10/2025
3. First Test Session: 21/10/2025
4. Reports & Delivery: 30/12/2025

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
- Android Studio Emulator
- Appium

# What will be tested
- Registration API flow with valid and invalid data
- Login flow API with valid and invalid data
- Registration UI flow with valid and invalid data
- Login UI flow with valid and invalid data
- Contact creation API with valid and invalid data
- Contact list retrieval API with/without contacts
- Contact creation UI flow with valid and invalid data
- Contact list UI flow with/without contacts
- Boundary testing for email and password fields
- Error handling and validation messages 
- Secure handling of user data
- Integration between UI actions and API responses
- Layout responsiveness of mobile app
- Synchronization between web and mobile version
- Compatibility of mobile app with different environments
- Only test cases selected for this cycle will be executed; others remain documented in the TC Repository for future cycles