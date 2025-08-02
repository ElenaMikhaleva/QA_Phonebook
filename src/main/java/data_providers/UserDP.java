package data_providers;

import dto.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public Object[][] API_REG_N_05_data() {
        return new Object[][] {
                { "samePassword" },
                { "newPassword"}
        };
    }

    @DataProvider(name = "longEmail")
    public Object[][] EXP_API_REG_02_data() {
        return new Object[][] {
                { genLettersDigits(64) + "@" + genLowerCase(185) + ".com", genPassword(12), "[1] email 254 characters length " },
                { genLettersDigits(65) + "@" + genLowerCase(185) + ".com", genPassword(12), "[2] email 255 characters length " },
                { genEmail(75), genPassword(12), "[add] email 75 characters length " },
                { genEmail(74), genPassword(12), "[add] email 74 characters length " }
        };
    }

    @DataProvider(name = "differentEmails")
    public Object[][] EXP_API_REG_03_data() {
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
}
