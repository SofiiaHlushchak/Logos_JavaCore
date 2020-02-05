package ua.lviv.lgs.Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Word w = new Word();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your word: ");
        scan = new Scanner(System.in);
        String s = scan.next().toLowerCase();

        w.isPalindrome(s);

    }
}
