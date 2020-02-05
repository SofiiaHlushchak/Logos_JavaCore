package ua.lviv.lgs.Task1;

import javax.swing.*;
import java.util.Scanner;

public class Word {

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public void isPalindrome(String s) {

        if (s.length() != 5) {
            System.out.println("Error!!! Please give me only 5 symbols");
        } else if (s.equals(reverse(s))) {
            s.toLowerCase();
            System.out.println("Yes!! This is palindrom");
        } else {
            System.out.println("No!! This is not a palindrom");
        }
    }

}