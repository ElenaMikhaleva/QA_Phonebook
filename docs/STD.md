# Overview

**STD Identifier:** PHONEBOOK-STD-v1.0-17-07-2025<br>
**Date Created:**	30/06/2025<br>
**Version:**    v1.0<br>

# Content
* Test Cases Summary
  * Registration API
  * Log in API
* Detailed Test Cases (Registration API)
* Detailed Test Cases (Log in API)
* Test Coverage Notes
* Questions

# Test Cases Summary

## Registration API

### API-TS1	Register with valid Email - Positive

API-REG-EML-P-001	Register with valid credentials  
API-REG-EML-P-002	Register with Email with capitalized letters (log in works with caps)  
API-REG-EML-P-003	Register with Email with capitalized letters (log in works without caps)  
API-REG-EML-P-004	Register with Email of max length  
API-REG-EML-P-005	Register with Email with hyphen in domain  
API-REG-EML-P-006	Register with Email with subdomains  

### API-TS2	Register with invalid Email - Negative
API-REG-EML-N-001	Register with empty Email  
API-REG-EML-N-002	Register with blank Email  
API-REG-EML-N-003	Register with Email that has only special symbols before @  
API-REG-EML-N-004	Register with Email without @  
API-REG-EML-N-005	Register with Email with more than one @  
API-REG-EML-N-006	Register with Email with no symbols before @  
API-REG-EML-N-007	Register with Email with no symbols after @  
API-REG-EML-N-008	Register with Email with no dot in domain  
API-REG-EML-N-009	Register with Email with no symbols before dot in domain  
API-REG-EML-N-010	Register with Email with no symbols after dot in domain
API-REG-EML-N-011	Register with Email with Russian letters  
API-REG-EML-N-012	Register with Email with diacritic letters (è)  
API-REG-EML-N-013	Register with Email with leading whitespace  
API-REG-EML-N-014	Register with Email with whitespace inside the email  
API-REG-EML-N-015	Register with Email with trailing whitespace  
API-REG-EML-N-016	Register with Email that has multiple dots  
API-REG-EML-N-017	Register with Email with invalid hyphen in domain placement  
API-REG-EML-N-018	Register with Email that has unicode emoji  
API-REG-EML-N-019	Register with Email that has newline character \n  
API-REG-EML-N-020	Register with Email that has tab \t
API-REG-EML-N-021	Register with Email exceeding max length

### API-TS3	Register with valid Password - Positive
API-REG-PWD-P-001	Register with min length Password  
API-REG-PWD-P-002	Register with max length Password that has 15 symbols  
API-REG-PWD-P-003	Register with Password that has special characters @$#^&*!  
API-REG-PWD-P-004	Register with Password that has one special character

### API-TS4	Register with invalid Password - Negative
API-REG-PWD-N-001	Register with empty Password  
API-REG-PWD-N-002	Register with blank Password  
API-REG-PWD-N-003	Register with Password that has no uppercase letters  
API-REG-PWD-N-004	Register with Password that has no lowercase letters  
API-REG-PWD-N-005	Register with Password that has no numbers  
API-REG-PWD-N-006	Register with Password without special characters  
API-REG-PWD-N-007	Register with Password that has Hebrew letters  
API-REG-PWD-N-008	Register with Password that has '/"\,.:;<>|  
API-REG-PWD-N-009	Register with Password that has whitespace  
API-REG-PWD-N-010	Register with Password that has newline character  
API-REG-PWD-N-011	Register with Password that has tab  
API-REG-PWD-N-012	Register with too short Password  
API-REG-PWD-N-013	Register with too long Password  
API-TS5	Register with valid duplicate credentials - Positive  
API-REG-EXS-P-001	Register with existing Password  
### API-TS6	Register with invalid duplicate credentials - Negative
API-REG-EXS-N-001	Register with existing Email and existing Password  
API-REG-EXS-N-002	Register with existing Email without uppercase letters  
API-REG-EXS-N-003	Register with existing Email and new valid Password
### API-TS7	API Request Format Validation - Negative
API-REG-FRM-N-001	API call with invalid Content-Type header  
API-REG-FRM-N-002	API call with malformed JSON body

## Log in API

### API-TS8	Log in with valid data - Positive
API-LOG-ALL-P-001	Log in with registered Email
### API-TS9	Log in with wrong Email - Negative
API-LOG-EML-N-001	Log in with unregistered Email  
API-LOG-EML-N-002	Log in with empty Email  
API-LOG-EML-N-003	Log in with blank Email
### API-TS10	Log in with wrong Password - Negative
API-LOG-PWD-N-001	Log in with existing Email but incorrect Password  
API-LOG-PWD-N-002	Log in with empty Password  
API-LOG-PWD-N-003	Log in with blank Password
### API-TS11	API Request Format Validation - Negative
API-LOG-FRM-N-001	API call with invalid Content-Type header  
API-LOG-FRM-N-002	API call with malformed JSON body

# Detailed Test Cases (Registration API)
all data is example, actual data is generated

## API-TS1	Register with valid Email - Positive

### API-REG-EML-P-001	Register with valid credentials
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered   
**Steps:**  
Send POST request
    ``{
        "username": "pippintook@gmail.com",
        "password": "#2Breakfast!"
    }``  
**Expected Result:**  
1. API returns 200.
2. API returns token.
3. API doesn't return password in body or headers.
4. Cookies do not contain password.
5. User is successfully registered.
6. User can log in with the same credentials

### API-REG-EML-P-002	Register with Email with capitalized letters (log in works with caps)
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
   ``{
        "username": "upperPippin@gmail.com",
        "password": "#2Breakfast!"
   }``  
**Expected Result:**  
Expected result is assumed based on RFC 1035  
1. API returns 200.
2. API returns token.
3. User is successfully registered.
4. User can log in with capitalization (upperPippin@gmail.com)

### API-REG-EML-P-003	Register with Email with capitalized letters
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
   ``{
        "username": "upperTook@gmail.com",
        "password": "#2Breakfast!"
   }``  
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 200.
2. API returns token.
3. User is successfully registered.
4. User can log in without capitalization (uppertook@gmail.com)

### API-REG-EML-P-004	Register with Email of max length
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request with email: [local_part=64 char]@[domain_part=189 char] where total = 254 char
    ``{
        "username": "12345weryuii6789123asdfsa4567890kjh45670assd1234567lkjnvb8901234@abcdefghijklmweiurweoijklmasdasodifuapwoeiruekpfksdthgwesjldkjslkfjfljasdpfasdfoijaskldvlzxcvkjcnopqrstuvwxyzabefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz.com",
        "password": "5LongBreakfast!"
    }``  
**Expected Result:**  
Expected result is assumed based on RFC 3696  
1. API returns 200.
2. API returns token.
3. User is successfully registered.
4. User can log in with the same credentials

### API-REG-EML-P-005	Register with Email with hyphen in domain
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
    ``{
        "username": "pippin@hyphen-hobbiton.com",
        "password": "#2Breakfast!"
    }``  
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 200.
2. API returns token.
3. User is successfully registered.
4. User can log in with the same credentials

### API-REG-EML-P-006	Register with Email with subdomains
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
    ``{
        "username": "subdomain@hobbiton.shire.com",
        "password": "#2Breakfast!"
    }``  
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 200.
2. API returns token.
3. User is successfully registered.
4. User can log in with the same credentials

## API-TS2	Register with invalid Email - Negative	

### API-REG-EML-N-001	Register with empty Email
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"password": "#2Breakfast!"
}``  
**Expected Result:**  
1. API returns 400 (requirement T1)
2. Message '"username": "must not be blank"'  

### API-REG-EML-N-002	Register with blank Email

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T2)
2. Error message

### API-REG-EML-N-003	Register with Email that has only special symbols before @

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "!!!@gmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
Expected result is assumed to avoid ambiguity, security risks, and delivery issues.
1. API returns 400 (requirement T2)
2. Error message

### API-REG-EML-N-004	Register with Email without @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "woatsigngmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T3)
2. Error message

### API-REG-EML-N-005	Register with Email with more than one @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "two@atsigns@gmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T3)
2. Error message

### API-REG-EML-N-006	Register with Email with no symbols before @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "@gmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T3)
2. Error message

### API-REG-EML-N-007	Register with Email with no symbols after @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "nodomain@",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T5)
2. Error message

### API-REG-EML-N-008	Register with Email with no dot in domain
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "nodot@gmailcom",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
Expected result is assumed since it's rejected by most API.
1. API returns 400
2. Error message

### API-REG-EML-N-009	Register with Email with no symbols before dot in domain
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"username": "nodot@gmailcom",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 400
2. Error message

### API-REG-EML-N-010	Register with Email with no symbols after dot in domain
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "afterdot@gmail.",
  "password": "0Symbols("
}``   
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 400
2. Error message

### API-REG-EML-N-011	Register with Email with Russian letters
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "пиппин@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
1. API returns 400 (requirement T6)
2. Error message

### API-REG-EML-N-012	Register with Email with diacritic letters (è)
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "pïppiñtŏk@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
1. API returns 400 (requirement T6)
2. Error message

### API-REG-EML-N-013	Register with Email with leading whitespace
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": " leadspace@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error message

### API-REG-EML-N-014	Register with Email with whitespace inside the email
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "white space@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error message

### API-REG-EML-N-015	Register with Email with trailing whitespace
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "trailspace@gmail.com ",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error message

### API-REG-EML-N-016	Register with Email that has multiple dots

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "dot..dot@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error message

### API-REG-EML-N-017	Register with Email with invalid hyphen in domain placement

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "hyphen@gmail-.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 400
2. Error message

### API-REG-EML-N-018	Register with Email that has unicode emoji

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "emo😈ji@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error message

### API-REG-EML-N-019	Register with Email that has newline character \n

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "new  
line@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error message

### API-REG-EML-N-020	Register with Email that has tab \t

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "username": "has     tab@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error message

### API-REG-EML-N-021	Register with Email exceeding max length
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request with email [local_part>=64 char]@[domain_part>=189 char] where total = 255 char<br>
``{
  "username": "12345weryuii6789123asdfs5a4567890kjh45670assd1234567lkjnvb8901234@abcdefghijklmweiurweoijklmasdasodifuapwoeiruekpfksdthgwesjldkjslkfjfljasdpfasdfoijaskldvlzxcvkjcnopqrstuvwxyzabefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 3696
1. API returns 400
2. Error message

## API-TS3	Register with valid Password - Positive	

### API-REG-PWD-P-001	Register with min length Password
**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request with password length 8 symbols
``{
  "username": "minpassword@gmail.com",
  "password": "8Symbol-"
}``<br>
**Expected Result:**<br>
1. API returns 200 (requirement T14).
2. API returns token.
3. User can log in with the same credentials

### API-REG-PWD-P-002	Register with max length Password
**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request with password length 15 symbols
``{
  "username": "maxpassword@gmail.com",
  "password": "15^SymbolsHere!"
}``<br>
**Expected Result:**<br>
1. API returns 200 (requirement T15).
2. API returns token.
3. User can log in with the same credentials

### API-REG-PWD-P-003	Register with Password that has special characters

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request with password that has special characters @$#^&*!
``{
  "username": "specialspassword@gmail.com",
  "password": "4Char@$#^&*!"
}``<br>

1. API returns 200 (requirement T9).
2. API returns token.
3. User can log in with the same credentials

### API-REG-PWD-P-004	Register with Password that has one special character

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request with password that has one of special characters @$#^&*!
``{
  "username": "specialpassword@gmail.com",
  "password": "1Character@"
}``<br>
**Expected Result:**<br>
1. API returns 200 (requirement T9).
2. API returns token.
3. User can log in with the same credentials.

## API-TS4	Register with invalid Password - Negative

### API-REG-PWD-N-001	Register with empty Password

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request without password
``{
  "username": "pippinpassword@gmail.com"
}``<br>
**Expected Result:**<br>
1. API returns 400 (requirement T7)
2. Error message

### API-REG-PWD-N-002	Register with blank Password

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request with blank password
``{
  "username": "pippinpassword@gmail.com",
  "password": ""
}``<br>
**Expected Result:**<br>
1. API returns 400 (requirement T8)
2. Error message

### API-REG-PWD-N-003	Register with Password that has no uppercase letters

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "lowletters7^"
}``<br>
**Expected Result:**
1. API returns 400 (requirement T11)
2. Error message

### API-REG-PWD-N-004	Register with Password that has no lowercase letters

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "UPLETTERS6#"
}``<br>
**Expected Result:**
1. API returns 400 (requirement T12)
2. Error message

### API-REG-PWD-N-005	Register with Password that has no numbers
**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "NoNumbers^"
}``<br>
**Expected Result:**
1. API returns 400 (requirement T13)
2. Error message

### API-REG-PWD-N-006	Register with Password without special characters
**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "NoSpecials5"
}``<br>
**Expected Result:**
1. API returns 400 (requirement T14)
2. Error message

### API-REG-PWD-N-007	Register with Password that has Hebrew letters

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "6^יאללה2"
}``<br>
**Expected Result:**
1. API returns 400 (requirement T10)
2. Error message

### API-REG-PWD-N-008	Register with Password that has '/"\,.:;<>|

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "`Pass/"",.:;<>8"
}``<br>
**Expected Result:**
Behavior is undefined in requirements. These special characters are not listed as allowed, but could be used if handled safely.

### API-REG-PWD-N-009	Register with Password that has whitespace

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "P@ss w0rd"
}``<br>
**Expected Result:**
Behavior undefined in requirements.

### API-REG-PWD-N-010	Register with Password that has newline character
**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "P@ss
w0rd"
}``<br>
**Expected Result:**
Expected result is assumed for security reasons.
1. API returns 400
2. Error message

### API-REG-PWD-N-011	Register with Password that has tab

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinpassword@gmail.com",
  "password": "P@ss
w0rd"
}``<br>
**Expected Result:**
Expected result is assumed for security reasons.
1. API returns 400
2. Error message

### API-REG-PWD-N-012	Register with too short Password

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request with password length 7 symbols
``{
  "username": "pippinpassword@gmail.com",
  "password": "P@sw0rd"
}``<br>
**Expected Result:**
1. API returns 400 (requirement T14)
2. Error message

### API-REG-PWD-N-013	Register with too long Password

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** user is not registered<br>
**Steps:**<br>
Send POST request with password length 16 symbols
``{
  "username": "pippinpassword@gmail.com",
  "password": "P@ssw0rdRightHer"
}``<br>
**Expected Result:**
1. API returns 400 (requirement T15)
2. Error message

## API-TS5	Register with valid duplicate credentials - Positive

### API-REG-EXS-P-001	Register with existing Password

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** User is registered with different email (password@gmail.com) and same password(P@ssw0rd)<br>
**Steps:**<br>
Send POST request
``{
  "username": "samepassword@gmail.com",
  "password": "P@ssw0rd"
}``<br>
**Expected Result:**
Expected result is assumed.
1. API returns 200.
2. API returns token.
3. User is successfully registered.
4. User can log in with the same credentials

## API-TS6	Register with invalid duplicate credentials - Negative

### API-REG-EXS-N-001	Register with existing Email and existing Password

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** User is registered with the same email (samecredentials@gmail.com) and password (P@ssw0rd1)<br>
**Steps:**<br>
Send POST request
``{
  "username": "samecredentials@gmail.com",
  "password": "P@ssw0rd1"
}``<br>
**Expected Result:**
1. API returns 409
2. Error message

### API-REG-EXS-N-002	Register with existing Email without uppercase letters

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** User is registered with the same email with uppercase letters (sameUpEmail@gmail.com)<br>
**Steps:**<br>
Send POST request
``{
  "username": "sameupemail@gmail.com",
  "password": "P@ssw0rd2"
}``<br>
**Expected Result:**
1. API returns 409
2. Error message

### API-REG-EXS-N-003	Register with existing Email and new valid Password

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** User is registered with the same email (sameemail@gmail.com) and password (P@ssw0rd4)<br>
**Steps:**<br>
Send POST request
``{
  "username": "sameemail@gmail.com",
  "password": "P@ssw0rd3"
}``<br>
**Expected Result:**
1. API returns 409
2. Error message

## API-TS7	API Request Format Validation - Negative

### API-REG-FRM-N-001	API call with invalid Content-Type header

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** User is not registered<br>
**Steps:**<br>
Send POST request<br>
``Header: Content-Type: text/plain``<br>
``Body:
{
  "username": "wrongheader@gmail.com",
  "password": "P@ssw0rd"
}``<br>
**Expected Result:**
1. API returns 415 (assumed)
2. Error message

### API-REG-FRM-N-002	API call with malformed JSON body

**Endpoint:** /v1/user/registration/usernamepassword<br>
**Preconditions:** User is not registered<br>
**Steps:**<br>
Send POST request with malformed JSON (without ',')
``{
  "username": "wrongheader@gmail.com"
  "password": "P@ssw0rd"
}``<br>
**Expected Result:**
1. API returns 400 (assumed)
2. Error message

# Detailed Test Cases (Log in API)

## API-TS8	Log in with valid data - Positive

### API-LOG-ALL-P-001	Log in with registered Email

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** User is registered with email pippinlogin@gmail.com, password #2Breakfast!<br>
**Steps:**<br>
Send POST request
``{
  "username": "pippinlogin@gmail.com"
  "password": "#0Breakfast!"
}``<br>
**Expected Result:**
1. API returns 200
2. API returns token
3. API doesn't return password in body or headers.
4. Cookies do not contain password.

## API-TS9	Log in with wrong Email - Negative

### API-LOG-EML-N-001	Log in with unregistered Email

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** None<br>
**Steps:**<br>
Send POST request
``{
  "username": "nonexisting@gmail.com"
  "password": "#0Breakfast!"
}``<br>
**Expected Result:**
1. API returns 401
2. Error message

### API-LOG-EML-N-002	Log in with empty Email

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** None<br>
**Steps:**<br>
Send POST request without email
``{
  "password": "#0Breakfast!"
}``<br>
**Expected Result:**
1. API returns 401
2. Error message

### API-LOG-EML-N-003	Log in with blank Email

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** None<br>
**Steps:**<br>
Send POST request with blank email
``{
  "username": "",
  "password": "#0Breakfast!"
}``<br>
**Expected Result:**
1. API returns 401
2. Error message

## API-TS10	Log in with wrong Password - Negative

### API-LOG-PWD-N-001	Log in with existing Email but incorrect Password

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** User is registered with email wrongpassword@gmail.com, password #0Breakfast!<br>
**Steps:**<br>
Send POST request
``{
  "username": "wrongpassword@gmail.com",
  "password": "#0Breakfast!"
}``<br>
**Expected Result:**
1. API returns 401
2. Error message

### API-LOG-PWD-N-002	Log in with empty Password

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** User is registered with email emptypassword@gmail.com and password #0Breakfast!<br>
**Steps:**<br>
Send POST request without password
``{
  "username": "wrongpassword@gmail.com"
}``<br>
**Expected Result:**
1. API returns 401
2. Error message

### API-LOG-PWD-N-003	Log in with blank Password

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** User is registered with email blankpassword@gmail.com and password #0Breakfast!<br>
**Steps:**<br>
Send POST request with blank password
``{
  "username": "wrongpassword@gmail.com",
  "password": ""
}``<br>
**Expected Result:**
1. API returns 401
2. Error message

## API-TS11	API Request Format Validation - Negative

### API-LOG-FRM-N-001	API call with invalid Content-Type header

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** User is registered with email header@gmail.com and password #0Breakfast!<br>
**Steps:**<br>
Send POST request<br>
   ``Header: Content-Type: text/plain``<br>
    ``Body: 
    {
     "username": "header@gmail.com",
     "password": "#0Breakfast!"
   }``<br>
**Expected Result:**
1. API returns 401
2. Error message

### API-LOG-FRM-N-002	API call with malformed JSON body

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** User is registered with email json@gmail.com and password #0Breakfast!<br>
**Steps:**<br>
Send POST request with malformed JSON (without ', ')
``{
  "username": "json@gmail.com"
  "password": "#0Breakfast!"
}``<br>
**Expected Result:**
1. API returns 401
2. Error message

# Test Coverage Notes
* Passwords are not returned in responses or logs. - covered by TC API-REG-EML-P-001, API-LOG-ALL-P-001

# Questions

1. In Swagger it is said, for duplicate user API returns 409, for any other registration error 400; for all log in error 401. Shouldn't API responses be more specific? <br>
2. What API response should be for invalid Content-Type header? TC API-REG-EXS-N-001 <br>
3. What API response should be for malformed JSON? TC API-REG-EXS-N-002

## Registration

1. If empty and blank is not allowed in the field, is " " allowed? <br>
2. Is email case-sensitive? Assumed no: TC API-REG-EML-P-002, API-REG-EML-P-003 <br>
3. What is email max length? Assumed 254 symbols: TC API-REG-EML-P-004, API-REG-EML-N-021 <br>
4. Can email contain hyphen in domain? Assumed yes: TC API-REG-EML-P-005 <br>
5. Can email contain subdomains? Assumed, yes: TC API-REG-EML-P-006 <br>
6. Can email have no dots in domain? Assumed, no: TC API-REG-EML-N-008 <br>
7. Can email have no symbols before dot in domain? Assumed, no: TC API-REG-EML-N-009 <br>
8. Can email have no symbols after dot in domain? Assumed, no: TC API-REG-EML-N-010 <br>
9. Can email have whitespaces? Assumed, no: TC API-REG-EML-N-013, API-REG-EML-N-014, API-REG-EML-N-015 <br>
10. Can email have multiple dots? Assumed, no: TC API-REG-EML-N-016 <br>
11. What is invalid placement for hyphen in domain? TC API-REG-EML-N-017 <br>
12. Can email have emoji? Assumed, no: TC API-REG-EML-N-018 <br>
13. Can email have newline character? Assumed, no: TC API-REG-EML-N-019 <br>
14. Can email have tabulatioin? Assumed, no: TC API-REG-EML-N-020 <br>
15. In passwords only @$#^&*! are allowed, as said in requirements? Not other special characters that are used often? (?%) Characters that might worsen security? ('/""\,.:;<>|): TC API-REG-PWD-N-008 <br>
    If yes, add information for users. If no, change requirements. <br>
    In practice user can register with % in password <br>
16. Can password contain emoji? <br>
17. Can password contain whitespace? TC API-REG-PWD-N-009 <br>
18. Can password have newline character? Assumed no: TC API-REG-PWD-N-010 <br>
19. Can password have tabulation? Assumed no: TC API-REG-PWD-N-011 <br>
20. User can register with new email but existing password? Assumed yes: TC API-REG-EXS-P-001 <br>
