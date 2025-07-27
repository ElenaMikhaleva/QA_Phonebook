# Overview

**STD Identifier:** PHONEBOOK-STD-v1.0-17-07-2025<br>
**Date Created:**	30/06/2025<br>
**Version:**    v1.0<br>

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

### API-TS4	Register with invalid Password (missing requirements) - Negative
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
API-LOG-ALL-P-001	Log in with registered Email and correct Password
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

# Detailed Test Cases (all data is example, actual data is generated)

## API-TS1	Register with valid Email - Positive

### API-REG-EML-P-001	Register with valid credentials
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered   
**Steps:**  
Send POST request
    ``{
        "email": "pippintook@gmail.com",
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
        "email": "upperPippin@gmail.com",
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
        "email": "upperTook@gmail.com",
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
        "email": "12345weryuii6789123asdfsa4567890kjh45670assd1234567lkjnvb8901234@abcdefghijklmweiurweoijklmasdasodifuapwoeiruekpfksdthgwesjldkjslkfjfljasdpfasdfoijaskldvlzxcvkjcnopqrstuvwxyzabefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz.com",
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
        "email": "pippin@hyphen-hobbiton.com",
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
        "email": "subdomain@hobbiton.shire.com",
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
"email": "",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T2)
2. Error

### API-REG-EML-N-003	Register with Email that has only special symbols before @

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"email": "!!!@gmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
Expected result is assumed to avoid ambiguity, security risks, and delivery issues.
1. API returns 400 (requirement T2)
2. Error

### API-REG-EML-N-004	Register with Email without @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"email": "woatsigngmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T3)
2. Error

### API-REG-EML-N-005	Register with Email with more than one @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"email": "two@atsigns@gmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T3)
2. Error

### API-REG-EML-N-006	Register with Email with no symbols before @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"email": "@gmail.com",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T3)
2. Error

### API-REG-EML-N-007	Register with Email with no symbols after @
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"email": "nodomain@",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
1. API returns 400 (requirement T5)
2. Error

### API-REG-EML-N-008	Register with Email with no dot in domain
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"email": "nodot@gmailcom",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
Expected result is assumed since it's rejected by most API.
1. API returns 400
2. Error

### API-REG-EML-N-009	Register with Email with no symbols before dot in domain
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request  
``{
"email": "nodot@gmailcom",
"password": "#2Breakfast!"
}  ``  
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 400
2. Error

### API-REG-EML-N-010	Register with Email with no symbols after dot in domain
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "afterdot@gmail.",
  "password": "0Symbols("
}``   
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 400
2. Error

### API-REG-EML-N-011	Register with Email with Russian letters
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "пиппин@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
1. API returns 400 (requirement T6)
2. Error

### API-REG-EML-N-012	Register with Email with diacritic letters (è)
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "pïppiñtŏk@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
1. API returns 400 (requirement T6)
2. Error

### API-REG-EML-N-013	Register with Email with leading whitespace
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": " leadspace@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error

### API-REG-EML-N-014	Register with Email with whitespace inside the email
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "white space@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error

### API-REG-EML-N-015	Register with Email with trailing whitespace
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "trailspace@gmail.com ",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error

### API-REG-EML-N-016	Register with Email that has multiple dots

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "dot..dot@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error

### API-REG-EML-N-017	Register with Email with invalid hyphen in domain placement

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "hyphen@gmail-.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 1035
1. API returns 400
2. Error

### API-REG-EML-N-018	Register with Email that has unicode emoji

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "emo😈ji@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error

### API-REG-EML-N-019	Register with Email that has newline character \n

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "new  
line@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error

### API-REG-EML-N-020	Register with Email that has tab \t

**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request
``{
  "email": "has     tab@gmail.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 5322
1. API returns 400
2. Error

### API-REG-EML-N-021	Register with Email exceeding max length
**Endpoint:** /v1/user/registration/usernamepassword  
**Preconditions:** user is not registered  
**Steps:**  
Send POST request with email [local_part>=64 char]@[domain_part>=189 char] where total = 255 char
``{
  "email": "12345weryuii6789123asdfs5a4567890kjh45670assd1234567lkjnvb8901234@abcdefghijklmweiurweoijklmasdasodifuapwoeiruekpfksdthgwesjldkjslkfjfljasdpfasdfoijaskldvlzxcvkjcnopqrstuvwxyzabefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz.com",
  "password": "#2Breakfast!"
}``   
**Expected Result:**  
Expected result is assumed based on RFC 3696
1. API returns 400
2. Error

