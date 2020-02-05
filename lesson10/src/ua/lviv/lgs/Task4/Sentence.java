package ua.lviv.lgs.Task4;

import java.util.Arrays;

public class Sentence {
    public static void main(String[] args) {
        String[] m = "abc abcde abcdef words abc abc g".split(" ");
        Arrays.sort(m);

        String maxWord = "";
        String   word = "";
        int maxCount = 0;
        int count = 1;

        for (String s : m) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }

        System.out.println("слово: " + maxWord +  " повторяється " + maxCount + " раз)");
    }
}
