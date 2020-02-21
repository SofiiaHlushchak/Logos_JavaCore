package ua.lviv.lgs.max.Task2;

import java.util.Scanner;

public class App {
    static void menu() {
        System.out.println("Enter 1, for add Commodity");
        System.out.println("Enter 2, for remove Commodity");
        System.out.println("Enter 3, for change Commodity");
        System.out.println("Enter 4, for sort Commodity by name");
        System.out.println("Enter 5, for sort Commodity by length");
        System.out.println("Enter 6, for sort Commodity by width");
        System.out.println("Enter 7, for sort Commodity by weight");
        System.out.println("Enter 8, for get Commodity by index");
        System.out.println("Enter 9, for exit");
    }
    public static void main(String[] args) {
        CommodityMethods coM = new CommodityMethods();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    coM.addCommodity();
                    break;
                }
                case 2: {
                    coM.removeCommodity();
                    break;
                }
                case 3: {
                    coM.changeCommodity();
                    break;
                }
                case 4: {
                    coM.sortByName();
                    break;
                }
                case 5: {
                    coM.sortByLength();
                    break;
                }
                case 6: {
                    coM.sortByWidth();
                    break;
                }
                case 7: {
                    coM.sortByWeight();
                    break;
                }
                case 8: {
                    coM.getCommodity();
                    break;
                }
                case 9: {
                    System.exit(0);
                    break;
                }

            }

        }
    }
}
