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
        };
    }

    @DataProvider(name = "differentEmails")
    public Iterator<Object[]> EXP_API_REG_03_data() {
        List<Object[]> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/data_provider/EXP_API_REG_03_data.csv"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] splitArray = line.split(",");
                User user = User.builder()
                        .username(splitArray[0])
                        .password(splitArray[1])
                        .build();
                list.add(new Object[]{user, splitArray[2]});
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list.listIterator();
    }
}
