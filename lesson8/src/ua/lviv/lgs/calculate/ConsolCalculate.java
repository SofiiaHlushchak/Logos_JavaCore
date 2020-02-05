package ua.lviv.lgs.calculate;

import java.util.Scanner;

public class ConsolCalculate {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scanner.nextInt();

        System.out.println("Enter second number:");
        int second = scanner.nextInt();

        System.out.println("Sum is equal: " + (first+second));
    }
}
