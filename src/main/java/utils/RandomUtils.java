package utils;

import java.util.Random;

public class RandomUtils {

    static Random random = new Random();

    public static String generateLettersDigits(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String generateEmail(int length) {
        String[] domains = {"@mail.com", "@yahoo.com", "@gmail.com", "@yandex.ru"};
        String domain = domains[random.nextInt(domains.length)];
        return generateLettersDigits(length-domain.length()) + domain;
    }

    public static String generatePassword(int length) {
        String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChar = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChar = "@$#^&*!";
        String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@$#^&*!";
        char[] randomString = new char[length];
        randomString[0] = upperChar.charAt(random.nextInt(upperChar.length()));
        randomString[1] = lowerChar.charAt(random.nextInt(lowerChar.length()));
        randomString[2] = digits.charAt(random.nextInt(digits.length()));
        randomString[3] = specialChar.charAt(random.nextInt(specialChar.length()));
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(allChar.length());
            randomString[i] = allChar.charAt(index);
        }
        return new String(randomString);
    }
}
