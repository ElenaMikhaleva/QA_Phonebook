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
}
