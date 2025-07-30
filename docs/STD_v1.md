# Overview

**STD Identifier:** STD-v1<br>
**Date Created:**	30/06/2025<br>
**Version:**    v1.0<br>

# Content
* Test Cases Summary
  * Registration API 
  * Log in API
  * Get All Contacts API
  * Create New Contact API
* Detailed Test Cases
* Test Coverage Notes
* Questions

# Test Cases Summary

## Log in API

### API-TS8	Log in with valid data - Positive

API-LOG-ALL-P-001	Log in with registered Email

### API-TS9	Log in with wrong Email - Negative

API-LOG-EML-N-001	Log in with unregistered Email  
API-LOG-EML-N-002	Log in with empty Email
API-LOG-EML-N-0021  Log in with Null Email (inserted between API-LOG-EML-N-002 and API-LOG-EML-N-003)
API-LOG-EML-N-003	Log in with blank Email

### API-TS10	Log in with wrong Password - Negative

API-LOG-PWD-N-001	Log in with existing Email but incorrect Password  
API-LOG-PWD-N-002	Log in with empty Password
API-LOG-PWD-N-0021  Log in with Null Password (inserted between API-LOG-PWD-N-002 and API-LOG-PWD-N-003)
API-LOG-PWD-N-003	Log in with blank Password

### API-TS11	API Request Format Validation - Negative

API-LOG-FRM-N-001	API call with invalid Content-Type header  
API-LOG-FRM-N-002	API call with malformed JSON body

## Get All Contacts API

### API-TS12	Get All Contacts - Positive
API-CON-ALL-P-001	Get all contacts when user has no contacts
API-CON-ALL-P-002	Get all contacts when user has contacts
### API-TS13	Get Contacts with invalid token - Negative
API-CON-ALL-N-001	Get all contacts without authentification
API-CON-ALL-N-002	Get all contacts with invalid token

# Detailed Test Cases

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

### API-LOG-EML-N-0021	Log in with Null Email

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** None<br>
**Steps:**<br>
Send POST request without email
``{
  "username": null,
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

### API-LOG-PWD-N-0021	Log in with blank Password

**Endpoint:** /v1/user/login/usernamepassword<br>
**Preconditions:** User is registered with email blankpassword@gmail.com and password #0Breakfast!<br>
**Steps:**<br>
Send POST request with blank password
``{
  "username": "wrongpassword@gmail.com",
  "password": null
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

## API-TS12	Get All Contacts - Positive

### API-CON-ALL-P-001	Get all contacts when user has no contacts
**Endpoint:** /v1/contacts<br>
**Preconditions:** User is registered. No contacts are created in user's profile.<br>
**Steps:**<br>
Send GET request<br>
**Expected Result:**
1. Response code 200.
2. Emtpy list is returned, not null.

### API-CON-ALL-P-002	Get all contacts when user has contacts
**Endpoint:** /v1/contacts<br>
**Preconditions:** User is registered. User's profile has contacts.<br>
**Steps:**
Send GET requets<br>
**Expected Result:**
1. Response code 200
2. List of contacts returned

## API-TS13	Get Contacts with invalid token - Negative

### API-CON-ALL-N-001	Get all contacts without authentification
**Endpoint:** /v1/contacts<br>
**Steps:**
Send GET without Authorization header<br>
**Expected Result:**
Response code 401

### API-CON-ALL-N-002	Get all contacts with invalid token
**Endpoint:** /v1/contacts<br>
**Steps:**
Send GET with Authorization: Bearer invalid_token<br>
**Expected Result:**
Response code 401

