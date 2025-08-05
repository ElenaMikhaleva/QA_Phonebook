
API-TS18	Create Contact with valid Last Name - Positive
API-ADD-SUR-P-001	Create contact with existing Last Name
API-ADD-SUR-P-002	Create contact with Last Name in Hebrew
API-ADD-SUR-P-003	Create contact with Last Name containing numbers
API-ADD-SUR-P-004	Create contact with Last Name containing <> (<b>Anna</b>)
API-ADD-SUR-P-005	Create contact with Last Name containing " ("John")
API-ADD-SUR-P-006	Create contact with Last Name containing ' ('John')
API-ADD-SUR-P-007	Create contact with Last Name containing + (John+Smith)
API-ADD-SUR-P-008	Create contact with Last Name containing apostrophe (O'Connor)
API-ADD-SUR-P-009	Create contact with Last Name containing hyphen (Anne-Marie)
API-ADD-SUR-P-010	Create contact with Last Name containing dot (Dr.Smith)
API-ADD-SUR-P-011	Create contact with Last Name containing at sign (Jack&Jill)
API-ADD-SUR-P-012	Create contact with Last Name containing whitespace (Dr Smith)
API-ADD-SUR-P-013	Create contact with Last Name containing emoji	app should accept or safely ignore
API-ADD-SUR-P-014	Create contact with Last Name that has 1 symbol
API-ADD-SUR-P-015	Create contact with Last Name that has 100 symbols	what is max length?
API-TS19	Create Contact with invalid Last Name - Negative
API-ADD-SUR-N-001	Create contact with null Last Name field
API-ADD-SUR-N-002	Create contact with empty Last Name	error Name cannot be empty
API-ADD-SUR-N-003	Create contact with blank Last Name	error Name cannot be empty
API-ADD-SUR-N-004	Create contact with Last Name that has a leading whitespace	"должен обрезать или дать ошибку
Leading/trailing spaces look invisible but can cause duplicate or broken names (e.g., "" John"" vs. ""John"")
May break sorting, searching, or display
Security-wise, it's a common test to check for input normalization"
API-ADD-SUR-N-005	Create contact with Last Name that has trailing whitespace	"должен обрезать или дать ошибку
Leading/trailing spaces look invisible but can cause duplicate or broken names (e.g., "" John"" vs. ""John"")
May break sorting, searching, or display
Security-wise, it's a common test to check for input normalization"
API-ADD-SUR-N-006	Create contact with Last Name that has newline character (\n)	"App should trim or sanitize input
Name should be rejected or cleaned
If not cleaned, at least displayed safely on one line"
API-ADD-SUR-N-007	Create contact with Last Name that has tab	"App should trim or sanitize input
Name should be rejected or cleaned
If not cleaned, at least displayed safely on one line"
API-TS20	Create Contact with valid Phone - Positive
API-ADD-PHN-P-001	Create contact with min Phone length
API-ADD-PHN-P-002	Create contact with max Phone length
API-TS21	Create Contact with invalid Phone - Negative
API-ADD-PHN-N-001	Create contact with null Phone field
API-ADD-PHN-N-002	Create contact with existing Phone Number
API-ADD-PHN-N-003	Create contact with empty Phone Number
API-ADD-PHN-N-004	Create contact with blank Phone Number
API-ADD-PHN-N-005	Create contact with Phone containing English letters
API-ADD-PHN-N-006	Create contact with Phone containing plus (+15551234567)
API-ADD-PHN-N-007	Create contact with Phone containing leading whitespace
API-ADD-PHN-N-008	Create contact with Phone containing trailing whitespace
API-ADD-PHN-N-009	Create contact with too short Phone
API-ADD-PHN-N-010	Create contact with too long Phone
API-TS22	Create Contact with valid Email - Positive
API-ADD-EML-P-001	Create contact with Email containing capitalized letters
API-ADD-EML-P-002	Create contact with Email of max length
API-TS23	Create Contact with invalid Email - Negative
API-ADD-EML-N-001	Create contact with null Email field
API-ADD-EML-N-002	Create contact with existing Email
API-ADD-EML-N-003	Create contact with empty Email
API-ADD-EML-N-004	Create contact with blank Email
API-ADD-EML-N-005	Create contact with Email without at sign
API-ADD-EML-N-006	Create contact with Email containing two at signs
API-ADD-EML-N-007	Create contact with Email without local part
API-ADD-EML-N-008	Create contact with Email without domain
API-ADD-EML-N-009	Create contact with Email containing English letters
API-TS24	Create Contact with valid Address - Positive
API-ADD-ADR-P-001	Create contact with existing Address
API-ADD-ADR-P-002	Create contact with Address of min length
API-ADD-ADR-P-003	Create contact with Address in Arabic
API-ADD-ADR-P-004	Create contact with Address containing numbers
API-ADD-ADR-P-005	Create contact with Address containing whitespaces
API-ADD-ADR-P-006	Create contact with Address containing dots (St.Paul)
API-ADD-ADR-P-007	Create contact with Address containing hyphens (12-14 Main St)
API-ADD-ADR-P-008	Create contact with Address containing apostrophe (O'Hara Ave)
API-ADD-ADR-P-009	Create contact with Address containing hash (Apt #504)
API-ADD-ADR-P-010	Create contact with Address containing slash (Unit 5/12 Elm Rd)
API-ADD-ADR-P-011	Create contact with Address containing comma (123 King St, Apt 2B)
API-ADD-ADR-P-012	Create contact with Address containing ampersand (Broadway&5th)
API-ADD-ADR-P-013	Create contact with Address containing "
API-ADD-ADR-P-014	Create contact with Address containing '
API-ADD-ADR-P-015	Create contact with Address containing () (Suite (North))
API-ADD-ADR-P-016	Create contact with Address containing : (Dock 4: back entrance)
API-ADD-ADR-P-017	Create contact with Address containing ; (Dock 4; back entrance)
API-ADD-ADR-P-018	Create contact with Address containing emoji
API-TS25	Create Contact with invalid Address - Negative
API-ADD-ADR-N-001	Create contact with null Address field
API-ADD-ADR-N-002	Create contact with empty Address
API-ADD-ADR-N-003	Create contact with blank Address
API-ADD-ADR-N-004	Create contact with Address containing <>\/`@=	"Should Likely Be Rejected or Escaped (Security-sensitive)
These are rarely used in real addresses and often signal malicious input:
Potential for HTML/XSS injection"
API-ADD-ADR-N-005	Create contact with Address containing new line character	"Should Likely Be Rejected or Escaped (Security-sensitive)
These are rarely used in real addresses and often signal malicious input
layout breaking"
API-ADD-ADR-N-006	Create contact with Address containing tabulation	"Should Likely Be Rejected or Escaped (Security-sensitive)
These are rarely used in real addresses and often signal malicious input
layout breaking"
API-ADD-ADR-N-007	Create contact with Address of max length	"255 characters	Traditional SQL VARCHAR(255) limit (very common)"
API-TS26	Create Contact with valid Description - Positive	
API-ADD-DSC-P-001	Create contact with existing Description	
API-ADD-DSC-P-002	Create contact with blank Description	
API-ADD-DSC-P-003	Create contact with Description in Russian	
API-ADD-DSC-P-004	Create contact with Description containing special characters ()	
API-ADD-DSC-P-005	Create contact with Description containing risky special characters <>;=`@	"Edge or risky characters (still allow but escape properly)
<> HTML tags (XSS risk)
; Statement separator (in code)
= may trigger parsers
`
@ Might confuse with email"
API-ADD-DSC-P-006	Create contact with Description containing line break
API-ADD-DSC-P-007	Create contact with Description containing indentation
API-ADD-DSC-P-008	Create contact with Description containing numbers
API-TS27	Create Contact with invalid Description - Negative
API-ADD-DSC-N-001	Create contact with empty Description
API-ADD-DSC-N-002	Create contact with null Description field
API-ADD-DSC-N-003	Create contact with Description of max length	