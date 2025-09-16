package data_providers;

import org.testng.annotations.DataProvider;

import static utils.RandomUtils.*;

public class UserDP {

    @DataProvider(name = "validCredentials")
    public Object[][] API_REG_P_01_data() {
        return new Object[][] {
                { genEmail(15), genPassword(12), "[1] valid credentials" },
                { genEmail(15), genPassword(8), "[2] min password" },
                { genEmail(15), genPassword(15), "[3] max password" },
                { genEmail(15), genPassword(5)+"@$#^&*!", "[4] special characters" },
                { genEmail(15), genUpperCase(3)+ genLowerCase(3)+ genDigits(3)+ genSpecials(1), "[5] one special character" }
        };
    }

    @DataProvider(name = "invalidPassword")
    public Object[][] API_REG_N_04_data() {
        return new Object[][] {
                { genEmail(15), genLowerCase(4)+ genDigits(4)+ genSpecials(4), "[1] no uppercase letters" },
                { genEmail(15), genUpperCase(4)+ genDigits(4)+ genSpecials(4), "[2] no lowercase letters" },
                { genEmail(15), genUpperCase(4)+ genLowerCase(4)+ genSpecials(4), "[3] no numbers" },
                { genEmail(15), genUpperCase(4)+ genLowerCase(4)+ genDigits(4), "[4] no special characters" },
                { genEmail(15), genRussianString(3)+ genUpperCase(2)+ genLowerCase(2)+ genDigits(2)+ genSpecials(2), "[5] non-English letters" },
                { genEmail(15), genPassword(7), "[6] too short (7 symbols)" },
                { genEmail(15), genPassword(16), "[7] too long (16 symbols)" }
        };
    }

    @DataProvider(name = "duplicateEmail")
    public Object[][] duplicate_email_data() {
        return new Object[][] {
                { "samePassword" },
                { "newPassword"}
        };
    }

    @DataProvider(name = "invalidEmail")
    public Object[][] UI_REG_N_04_data() {
        return new Object[][] {
                { genLowerCase(10) + ".com", genPassword(12), "[1] without @" },
                { genRussianString(10) + "@example.com", genPassword(12), "[2] Cyrillic characters" },
                { genDiacriticString(7) + "@example.com", genPassword(12), "[3] diacritic characters" }
        };
    }

    @DataProvider(name = "longEmail")
    public Object[][] EXP_AUTH_02_data() {
        return new Object[][] {
                { genLettersDigits(64) + "@" + genLowerCase(185) + ".com", genPassword(12), "[1] email 254 characters length " },
                { genLettersDigits(65) + "@" + genLowerCase(185) + ".com", genPassword(12), "[2] email 255 characters length " },
                { genEmail(75), genPassword(12), "[add] email 75 characters length " },
                { genEmail(74), genPassword(12), "[add] email 74 characters length " }
        };
    }

    @DataProvider(name = "differentEmails")
    public Object[][] EXP_AUTH_03_data() {
        return new Object[][] {
                { genLowerCase(5) + "@test-example.com", genPassword(12), "[1] hyphen in domain" },
                { genLowerCase(5) + "@test.example.com", genPassword(12), "[2] email with subdomains" },
                { genLowerCase(5) + "@examplecom", genPassword(12), "[3] no dot in domain" },
                { genLowerCase(5) + "@.com", genPassword(12), "[4] no char before dot in domain" },
                { genLowerCase(5) + "@example.", genPassword(12), "[5] no char after dot in domain" },
                { genLowerCase(2) + ".." + genLowerCase(2) + "@example.com", genPassword(12), "[6] multiple dots" },
                { " " + genLowerCase(5) + "@example.com", genPassword(12), "[7] leading whitespace" },
                { genLowerCase(2) + " " + genLowerCase(2) + "@example.com", genPassword(12), "[8] internal whitespace" },
                { genLowerCase(5) + "@example.com ", genPassword(12), "[9] trailing whitespace" },
                { genLowerCase(5) + "\uD83D\uDE08" + "@example.com", genPassword(12), "[10] emoji unicode" },
                { genLowerCase(2) + "\n" + genLowerCase(2) + "@example.com", genPassword(12), "[11] new line character" },
                { genLowerCase(2) + "\t" + genLowerCase(2) + "@example.com", genPassword(12), "[12] tabulation" }
        };
    }

    @DataProvider(name = "differentPasswords")
    public Object[][] EXP_AUTH_04_data() {
        return new Object[][] {
                { genEmail(14), genPassword(10), "[1] allowed special characters" },
                { genEmail(14), genUpperCase(3)+genLowerCase(3)+genDigits(3)+genAnything(2, "%_?~"), "[2] not listed special characters" },
                { genEmail(14), genUpperCase(2)+genLowerCase(2)+genDigits(2)+genSpecials(2)+genAnything(2, "%_?~"), "[3] not listed special chars + listed special chars" },
                { genEmail(14), genUpperCase(2)+genLowerCase(2)+genDigits(2)+genAnything(2, "'\"\\/<>`;"), "[4] potentially dangerous chars" },
                { genEmail(14), genUpperCase(2)+genLowerCase(2)+genDigits(2)+genSpecials(2)+genAnything(2, "'\"\\/<>`;"), "[5] potentially dangerous chars + listed special chars" },
                { genEmail(14), " "+genPassword(10), "[6] leading whitespace" },
                { genEmail(14), genPassword(5)+" "+genPassword(5), "[7] internal whitespace" },
                { genEmail(14), genPassword(10)+" ", "[8] trailing whitespace" },
                { genEmail(14), genPassword(10)+"\n", "[9] new line character" },
                { genEmail(14), genPassword(10)+"\t", "[10] tabulation character" },
                { genEmail(14), genPassword(10)+"\uD83D\uDE08", "[11] emoji" }
        };
    }

    @DataProvider(name = "validNames")
    public Object[][] API_ADD_P_03_data() {
        return new Object[][] {
            { genLowerCase(5), "[1] lower case" },
            { genUpperCase(5), "[2] upper case" },
            { genUpperCase(5)+genLowerCase(2), "[3] upper and lower case" },
            { genLetters(5)+genDigits(2), "[4] with numbers" },
            { "<b>"+genLetters(5)+"</b>", "[5] with <>" },
            { "\""+genLetters(5)+"\"", "[6] with \"\"" },
            { "'"+genLetters(5)+"'", "[7] with ''" },
            { genLetters(3)+"+"+genLetters(3), "[8] with +" },
            { genLetters(3)+"&"+genLetters(3), "[9] with ampersand" },
            { genLetters(3)+","+genLetters(3), "[10] with comma" },
            { genLetters(3)+"-"+genLetters(3), "[11] with hyphen" },
            { genLetters(1)+"`"+genLetters(5), "[12] with apostrophe" },
            { genLetters(3)+"."+genLetters(4), "[13] with dot" },
            { genLetters(3)+" "+genLetters(3), "[14] with internal whitespace" },
            { genAnything(5, "אבבּגדהוזחטיכךכּךּלמםנןסעפףפּצץקרששׁשׂת"), "[15] with non-English letters" },
            { genLetters(1), "[16] 1 character length" }
        };
    }

    @DataProvider(name = "validAddresses")
    public Object[][] API_ADD_P_08_data() {
        return new Object[][] {
                { genLowerCase(5), "[1] lower case" },
                { genUpperCase(5), "[2] upper case" },
                { genUpperCase(3)+genLowerCase(3), "[3] lower and upper case" },
                { genLetters(5)+genDigits(3), "[4] digits" },
                { genLetters(3)+ "." +genLetters(3), "[5] dot" },
                { genLetters(3)+ "," +genLetters(3), "[6] comma" },
                { genLetters(3) + "-" + genLetters(3), "[7] hyphens" },
                { genLetters(3) + "`" + genLetters(3), "[8] apostrophe" },
                { genLetters(3) + "#" + genLetters(3), "[9] hash" },
                { genLetters(3) + "/" + genLetters(3), "[10] slash" },
                { genLetters(3) + "&" + genLetters(3), "[11] ampersand" },
                { "\"" + genLetters(5) + "\"", "[12] quotes \"\"" },
                { "'" + genLetters(5) + "'", "[13] quotes ''" },
                { "(" + genLetters(5) + ")", "[14] brackets" },
                { genLetters(3) + ":" + genLetters(3), "[15] colon" },
                { genLetters(3) + ";" + genLetters(3), "[16] semicolon" },
                { genDiacriticString(5), "[17] diacritic letters" },
                { genAnything(5, "ابتثجحخدذرزسشصضطظعغفقكلمنهويء"), "[18] none-English letters " },
                { genLetters(3) + " " + genLetters(3), "[19] internal whitespace" },
                { genLetters(1), "[20] one symbol" }
        };
    }

    @DataProvider(name = "emptyDescription")
    public Object[][] API_ADD_P_11_data() {
        return new Object[][] {
                { "", "[1] blank" },
                { " ", "[2] whitespace" }
        };
    }

    @DataProvider(name = "invalidPhone")
    public Object[][] API_ADD_N_13_data() {
        return new Object[][] {
                { genDigits(11) + genLetters(1), "[1] letters" },
                { "+" + genDigits(10), "[2] plus " },
                { "(" + genDigits(3) + ")" + genDigits(6), "[3] brackets" },
                { genDigits(9), "[4] 9 symbol length" },
                { genDigits(16), "[5] 16 symbol length" },
                { " " + genDigits(10), "[6] leading whitespace" },
                { genDigits(10) + " ", "[7] trailing whitespace" },
                { genDigits(3) + " " + genDigits(8), "[8] internal whitespace" }
        };
    }
}
