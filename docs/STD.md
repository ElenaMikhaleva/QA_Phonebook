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

| ID            | Title                                          | Notes                                       |
|---------------|------------------------------------------------|---------------------------------------------|
| API_REG_P_01  | Register with Valid Credentials                |                                             |
| API_REG_N_01  | Register with Missing Email                    |                                             |
| API_REG_N_02  | Register with Missing Password                 |                                             |
| API_REG_N_03  | Register with Invalid Email                    |                                             |
| API_REG_N_04  | Register with Invalid Password                 |                                             |
| API_REG_N_05  | Register with Duplicate Email                  |                                             |
| API_LOG_P_01  | Log in with Registered Email                   |                                             |
| API_LOG_N_01  | Log in with Unregistered Email                 |                                             |
| API_LOG_N_02  | Log in with Wrong Password                     |                                             |
| API_LOG_N_03  | Log in with Missing Email                      |                                             |
| API_LOG_N_04  | Log in with Missing Password                   |                                             |
| UI_NAV_P_01   | Open Home Page from Navigation                 | Execution with EXP_NAV_01                   |
| UI_NAV_P_02   | Open About Page from Navigation                | Execution with EXP_NAV_01                   |
| UI_NAV_P_03   | Open Login Page from Navigation                | Execution with UI_LOG_P_01                  |
| UI_REG_P_01   | Register with Valid Credentials                |                                             |
| UI_REG_P_02   | Register with Copy-Paste                       |                                             |
| UI_REG_N_01   | Register with Missing Email                    |                                             |
| UI_REG_N_02   | Register with Missing Password                 |                                             |
| UI_REG_N_03   | Register with All Empty Fields                 |                                             |
| UI_REG_N_04   | Register with Invalid Email                    |                                             |
| UI_REG_N_05   | Register with Invalid Password                 | Bugs in API, BUG_REG_API_01, BUG_REG_API_02 |
| UI_REG_N_06   | Register with Duplicate Email                  |                                             |
| UI_REG_N_07   | Register with Rapid Clicking                   |                                             |
| UI_LOG_P_01   | Log in with Valid Credentials                  |                                             |
| UI_LOG_P_02   | Log in with with Copy-Paste                    |                                             |
| UI_LOG_P_03   | Log in with with Autofill                      |                                             |
| API_ADD_P_04  | Add Contact with Existing Last Name            |                                             |
| API_ADD_P_05  | Add Contact with Valid Last Name               |                                             |
| API_ADD_P_06  | Add Contact with Valid Email                   |                                             |
| API_ADD_P_07  | Add Contact with Existing Address              |                                             |
| API_ADD_P_08  | Add Contact with Valid Address                 |                                             |
| API_ADD_P_09  | Add Contact with Existing Description          |                                             |
| API_ADD_P_10  | Add Contact with Valid Description             |                                             |
| UI_LOG_N_01   | Log in with Unregistered Email                 |                                             |
| UI_LOG_N_02   | Log in with Missing Email                      |                                             |
| UI_LOG_N_03   | Log in with Missing Password                   |                                             |
| UI_LOG_N_04   | Log in with Rapid Clicking                     |                                             |
| API_ADD_P_01  | Add Contact with Valid Data                    |                                             |
| API_ADD_P_02  | Add Contact with Existing Name                 |                                             |
| API_ADD_P_03  | Add Contact with Valid Name                    |                                             |
| API_ADD_P_04  | Add Contact with Existing Last Name            |                                             |
| API_ADD_P_05  | Add Contact with Valid Last Name               |                                             |
| API_ADD_P_06  | Add Contact with Valid Email                   |                                             |
| API_ADD_P_07  | Add Contact with Existing Address              |                                             |
| API_ADD_P_08  | Add Contact with Valid Address                 |                                             |
| API_ADD_P_09  | Add Contact with Existing Description          |                                             |
| API_ADD_P_10  | Add Contact with Valid Description             |                                             |
| API_ADD_P_11  | Add Contact without Unrequired Fields          |                                             |
| API_ADD_P_12  | Add Contact with Valid Phone                   |                                             |
| API_ADD_N_01  | Add Contact without Authentication             |                                             |
| API_ADD_N_02  | Add Contact with Invalid Token                 |                                             |
| API_ADD_N_021 | Add Contact with Outdated Token                |                                             |
| API_ADD_N_12  | Add Contact with Existing Phone                |                                             |
| API_ADD_N_13  | Add Contact with Invalid Phone                 |                                             |
| API_ADD_N_14  | Add Contact with Invalid Description           |                                             |
| UI_ADD_P_01   | Add Contact with Valid Data                    |                                             |
| UI_ADD_P_02   | Add Contact with Data with Non-English Letters |                                             |
| UI_ADD_P_03   | Add Contact with Special Characters            |                                             |
| UI_ADD_P_04   | Add Contact with Copy-Paste Input              |                                             |
| UI_ADD_N_01   | Add Contact with Empty Required Fields         |                                             |
| UI_ADD_N_02   | Add Contact with Blank Required Fields         |                                             |
| INT_SYS_N_01  | Lost Connection While Filling Forms            |                                             |
| INT_SYS_N_02  | Page Refreshed While Filling Forms             |                                             |
| INT_SYS_N_03  | Behavior with Browser Back and Forward Buttons |                                             |
| MOB_NAV_P_01  | Open Home Screen                               | Execution with MOB_REG_P_01                 |
| MOB_NAV_P_02  | Open Login Screen                              | Execution with MOB_REG_P_01                 |
| MOB_REG_P_01  | Register with Valid Credentials                |                                             |
| MOB_REG_N_01  | Register with Missing Email                    |                                             |
| MOB_REG_N_02  | Register with Invalid Password                 |                                             |
| MOB_LOG_P_01  | Log in with Valid Credentials                  |                                             |
| MOB_LOG_P_02  | Log in into Account Created on Web on Mobile   |                                             |
| MOB_LOG_N_01  | Log in with Unregistered Email                 |                                             |
| MOB_ADD_P_01  | Add Contact Using Gesture (Long Press / Swipe) |                                             |
| MOB_ADD_P_02  | Add Contact with Non-English Letters           |                                             |
| MOB_ADD_P_03  | Add Contact with Special Characters            |                                             |
| MOB_SYS_P_01  | Scroll Through Long Contact List               |                                             |
| MOB_SYS_P_02  | Multiple Instances Work on Same Data           |                                             |
| MOB_SYS_P_03  | App Handles Repeated Add/Delete Cycles         |                                             |
| MOB_SYS_P_04  | Install App                                    |                                             |
| MOB_SYS_P_05  | Rotate device in each screen                   |                                             |
| MOB_SYS_P_06  | Reach Main Buttons with One Hand               |                                             |
| MOB_SYS_P_07  | App Compatibility Across OS Versions           |                                             |
| MOB_SYS_P_08  | App Compatibility Across Devices               |                                             |
| MOB_SYS_P_09  | Behavior With Different Network Types          |                                             |
| MOB_SYS_N_01  | Send App to Background                         |                                             |
| MOB_SYS_N_02  | Turn off the Screen Mid-Action                 |                                             |
| MOB_SYS_N_03  | Lost Connection Mid-Action                     |                                             |
| MOB_SYS_N_04  | Low battery                                    |                                             |
|               | Delete App                                     |                                             |
| MOB_ACC_P_01  | Screen Reader Reads Labels                     |                                             |

## Exploratory Sessions

| ID          | Title                                            | Notes                                            |
|-------------|--------------------------------------------------|--------------------------------------------------|
| EXP_AUTH_01 | Authentication with Capitalized Letters in Email |                                                  |
| EXP_AUTH_02 | Authentication with Long Email                   | No maximum length is given                       |
| EXP_AUTH_03 | Authentication with Various Emails               |                                                  |
| EXP_AUTH_04 | Authentication with Various Passwords            |                                                  |
| EXP_AUTH_05 | Authentication API with Invalid Request Format   |                                                  |
| EXP_NAV_01  | Navigate Using Keyboard                          |                                                  |
| EXP_NAV_02  | Actions Using Old Token                          | User-only pages                                  |
| EXP_ADD_01  | Add Contact with Given ID                        | It is unclear if ID key is needed in API request |
| EXP_MOB_01  | Monkey Testing                                   | System                                           |            

# Test Environment

Desktop:
- Google Chrome version 139.0.7258.127 (Official Build) (64-bit)
- Mozilla Firefox version 141.0.3
- Microsoft Edge version 139.0.3405.86 (Official build) (64-bit)

Mobile:
- emulator: Google Pixel 8, Android 15
- emulator: Small Phone, 4.65 inch, Android 11
- emulator: Google Pixel 9 Pro XL, 6.8 inch, Android 16

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