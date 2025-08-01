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
    public Object[][] API_REG_N_05_data() {
        return new Object[][] {
                { "samePassword" },
                { "newPassword"}
        };
    }
}
