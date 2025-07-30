package utils;

import java.util.Random;

public class RandomUtils {

    static Random random = new Random();

    public static String generateUpperLetters(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String generateLowerLetters(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String generateDigits(int length) {
        String characters = "0123456789";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String generateSpecials(int length) {
        String characters = "@$#^&*!";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

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
        String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@$#^&*!";
        char[] randomString = new char[length];
        randomString[0] = generateUpperLetters(1).charAt(0);
        randomString[1] = generateLowerLetters(1).charAt(0);
        randomString[2] = generateDigits(1).charAt(0);
        randomString[3] = generateSpecials(1).charAt(0);
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(allChar.length());
            randomString[i] = allChar.charAt(index);
        }
        return new String(randomString);
    }
}
