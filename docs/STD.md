# Overview

**STD Identifier:** STD-v5<br>
**Date Created:** 07/10/2025<br>
**Version:** v5<br>
All data is example, actual data is generated for each execution.

# Content

1. Summary of TCs<br>
  1.1 Scenario Test Cases<br>
  1.2 Exploratory Tests<br>
2. Test Environment<br>

# Summary of TCS

All UI tests marked as "Automated" are first executed manually to explore the page and verify elements. After that, the automated script is executed.
So, every test marked as "Automated" is executed manually and automatically.

## Scenario Test Cases

| ID            | Title                                          | Reason for Inclusion                        |
|---------------|------------------------------------------------|---------------------------------------------|
| API_REG_P_01  | Register with Valid Credentials                | Functional flow                             |
| API_REG_N_01  | Register with Missing Email                    | Functional flow, format errors              |
| API_REG_N_03  | Register with Invalid Email                    | Bug in UI                                   |
| API_REG_N_04  | Register with Invalid Password                 | Functional flow                             |
| API_REG_N_05  | Register with Duplicate Email                  | Functional flow                             |
| API_LOG_P_01  | Log in with Registered Email                   | Functional flow                             |
| API_LOG_N_01  | Log in with Unregistered Email                 | Functional flow                             |
| API_LOG_N_02  | Log in with Wrong Password                     | Functional flow                             |
| UI_NAV_P_01   | Open Home Page from Navigation                 | Execution with EXP_NAV_01                   |
| UI_NAV_P_02   | Open About Page from Navigation                | Execution with EXP_NAV_01                   |
| UI_NAV_P_03   | Open Login Page from Navigation                | Execution with UI_LOG_P_01                  |
| UI_REG_P_01   | Register with Valid Credentials                | Functional flow                             |
| UI_REG_P_02   | Register with Copy-Paste                       | Functional flow                             |
| UI_REG_N_01   | Register with Missing Email                    | Missing of the key field                    |
| UI_REG_N_03   | Register with All Empty Fields                 | Error handling                              |
| UI_REG_N_04   | Register with Invalid Email                    | Field validation on the client side         |
| UI_REG_N_05   | Register with Invalid Password                 | Bugs in API, BUG_REG_API_01, BUG_REG_API_02 |
| UI_REG_N_06   | Register with Duplicate Email                  | Functional flow                             |
| UI_REG_N_07   | Register with Rapid Clicking                   | Preventing duplicate submissions            |
| UI_LOG_P_01   | Log in with Valid Credentials                  | Functional flow                             |
| UI_LOG_P_03   | Log in with with Autofill                      | Functional flow                             |
| UI_LOG_N_01   | Log in with Unregistered Email                 | Error handling                              |
| API_ADD_P_01  | Add Contact with Valid Data                    | Functional flow                             |
| API_ADD_P_02  | Add Contact with Existing Name                 | Functional flow                             |
| API_ADD_P_03  | Add Contact with Valid Name                    | Functional flow                             |
| API_ADD_P_08  | Add Contact with Valid Address                 | Functional flow                             |
| API_ADD_P_11  | Add Contact without Unrequired Fields          | Functional flow                             |
| API_ADD_N_01  | Add Contact without Authentication             | Security                                    |
| API_ADD_N_02  | Add Contact with Invalid Token                 | Practice                                    |
| API_ADD_N_021 | Add Contact with Outdated Token                | Practice                                    |
| API_ADD_N_13  | Add Contact with Invalid Phone                 | Functional flow                             |
| API_ADD_N_14  | Add Contact with Invalid Description           | Practice                                    |
| UI_ADD_P_01   | Add Contact with Valid Data                    | Functional flow                             |
| UI_ADD_P_02   | Add Contact with Data with Non-English Letters | Functional flow                             |
| UI_ADD_P_03   | Add Contact with Special Characters            | Functional flow                             |
| UI_ADD_P_04   | Add Contact with Copy-Paste Input              | Functional flow                             |
| UI_ADD_N_01   | Add Contact with Empty Required Fields         | Functional flow                             |
| UI_ADD_N_02   | Add Contact with Blank Required Fields         | Error handling                              |
| FUN_SYS_N_01  | Use Website with Interruptions                 | Functional flow                             |
| FUN_SYS_N_02  | Session Expired                                | Security                                    |
| MOB_REG_P_01  | Register with Valid Credentials                | Functional flow                             |
| MOB_REG_P_02  | Register with Copy-Paste                       | Functional flow                             |
| MOB_REG_N_01  | Register with Missing Email                    | Error handling                              |
| MOB_REG_N_02  | Register with Invalid Password                 | Functional flow                             |
| MOB_LOG_P_01  | Log in with Valid Credentials                  | Functional flow                             |
| MOB_LOG_P_02  | Log in into Account Created on Web on Mobile   | Functional flow                             |
| MOB_LOG_N_01  | Log in with Unregistered Email                 | Functional flow                             |
| MOB_ADD_P_01  | Add Contact Using Gesture (Long Press / Swipe) | Functional flow                             |
| MOB_ADD_P_02  | Add Contact with Non-English Letters           | Unexpected characters                       |
| MOB_ADD_P_03  | Add Contact with Special Characters            | Unexpected characters                       |
| MOB_SYS_P_01  | Scroll Through Long Contact List               | Functional flow                             |
| MOB_SYS_P_02  | Multiple Instances Work on Same Data           | Synchronization                             |
| MOB_SYS_P_03  | App Handles Repeated Add/Delete Cycles         | Performance                                 |
| MOB_SYS_P_04  | Install App                                    | Smoke                                       |
| MOB_SYS_P_05  | Rotate device in each screen                   | Functional flow                             |
| MOB_SYS_P_06  | Reach Main Buttons with One Hand               | Usability                                   |
| MOB_SYS_P_07  | App Compatibility Across OS Versions           | Usability                                   |
| MOB_SYS_P_08  | App Compatibility Across Devices               | Usability                                   |
| MOB_SYS_P_09  | Screen Reader Reads Labels                     | Accessibility                               |
| MOB_SYS_P_10  | App Performance When Adding 100+ Contacts      | Performance                                 |
| MOB_SYS_N_01  | Use App with Interruptions                     | Functional flow                             |
| MOB_SYS_N_02  | Delete App                                     | Functional flow                             |

## Exploratory Sessions

| ID          | Title                                            | Component           | Reason for Inclusion                             |
|-------------|--------------------------------------------------|---------------------|--------------------------------------------------|
| EXP_AUTH_01 | Authentication with Capitalized Letters in Email | Registration, Login | Practice                                         |
| EXP_AUTH_02 | Authentication with Long Email                   | Registration, Login | No maximum length is given                       |
| EXP_AUTH_03 | Authentication with Various Emails               | Registration, Login | Edge cases                                       |
| EXP_AUTH_04 | Authentication with Various Passwords            | Registration, Login | Edge cases, security                             |
| EXP_AUTH_05 | Authentication API with Invalid Request Format   | Registration, Login | Format errors                                    |
| EXP_NAV_01  | Navigate Using Keyboard                          | System              | Practice                                         |
| EXP_NAV_02  | Actions Using Old Token                          | User-only pages     | Security                                         |
| EXP_ADD_01  | Add Contact with Given ID                        | Add Contact         | It is unclear if ID key is needed in API request |
| EXP_MOB_01  | Monkey Testing                                   | System              | Common situation                                 |            

# Test Environment

Desktop:
- Google Chrome version 139.0.7258.127 (Official Build) (64-bit)
- Mozilla Firefox version 141.0.3
- Microsoft Edge version 139.0.3405.86 (Official build) (64-bit)

Mobile (browser version):
- Google Pixel 7 (real device), Chrome Mobile version 139.0.7258.123

# Coverage Matrix

| ID          | Chrome | Firefox | Edge | Chrome Mobile |
|-------------|--------|---------|------|---------------|
| UI_REG_P_01 | yes    | yes     | yes  | yes           |
| UI_REG_P_02 | yes    | -       | -    | -             |
| UI_REG_N_01 | yes    | -       | -    | -             |
| UI_REG_N_03 | yes    | -       | -    | -             |
| UI_REG_N_04 | yes    | yes     | yes  | yes           |
| UI_REG_N_06 | yes    | yes     | yes  | yes           |
| UI_REG_N_07 | yes    | -       | -    | -             |
| UI_LOG_P_01 | yes    | yes     | yes  | yes           |
| UI_LOG_P_03 | yes    | -       | -    | -             |
| UI_LOG_N_01 | yes    | yes     | yes  | yes           |
| UI_ADD_P_01 | yes    | yes     | yes  | yes           |
| UI_ADD_P_02 | yes    | -       | -    | -             |
| UI_ADD_P_03 | yes    | -       | -    | -             |
| UI_ADD_P_04 | yes    | -       | -    | -             |
| UI_ADD_N_01 | yes    | yes     | yes  | yes           |