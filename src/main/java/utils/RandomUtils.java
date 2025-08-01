package utils;

import java.util.Random;

public class RandomUtils {

    static Random random = new Random();

    public static String genRussianString(int length) {
        String characters = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЮЯабвгдеёжзиклмнопрстуфхцчшщъыьюя";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String genUpperCase(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String genLowerCase(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String genDigits(int length) {
        String characters = "0123456789";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String genSpecials(int length) {
        String characters = "@$#^&*!";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String genLettersDigits(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] randomString = new char[length];
        int index;
        for (int i = 0; i<length; i++) {
            index = random.nextInt(characters.length());
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

    public static String genEmail(int length) {
        String[] domains = {"@mail.com", "@yahoo.com", "@gmail.com", "@yandex.ru"};
        String domain = domains[random.nextInt(domains.length)];
        return genLettersDigits(length-domain.length()) + domain;
    }

    public static String genPassword(int length) {
        String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@$#^&*!";
        char[] randomString = new char[length];
        randomString[0] = genUpperCase(1).charAt(0);
        randomString[1] = genLowerCase(1).charAt(0);
        randomString[2] = genDigits(1).charAt(0);
        randomString[3] = genSpecials(1).charAt(0);
        int index;
        for (int i = 4; i<length; i++) {
            index = random.nextInt(allChar.length());
            randomString[i] = allChar.charAt(index);
        }
        return new String(randomString);
    }
}
