package ua.lviv.lgs.consolNumber;

import java.util.Scanner;

public class Consol {
    public static void main(String[] args) {
        runScanner();
    }

    public static void runScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");

        int number = scanner.nextInt();
        if (number % 1 == 0) {
            if (number % 2 == 0) {
                System.out.println("Число Парне");
            } else {
                System.out.println("Число не варне");
            }
        } else {
            System.out.println("Error");
        }
    }
}