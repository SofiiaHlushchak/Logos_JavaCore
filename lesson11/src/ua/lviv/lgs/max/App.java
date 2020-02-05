package ua.lviv.lgs.max;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class App {
    public static void main(String[] args) {

        int m = getRandomValueFromRange(2, 4);

        int n = getRandomValueFromRange(2, 5);

        Auto[][] mas = new Auto[m][n];

        for (int i = 0; i<m; i++){
            for (int j = 0 ; j<n; j++){
                mas[i][j]= new Auto(getRandomValueFromRange(1,5),getRandomValueFromRange(3,6),
                new Helm(getRandomValueFromRange(3,6),"Alcantara"),
                new Engine(getRandomValueFromRange(2,6)));
            }
        }
        menu();
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        switch (s){
            case "1":
                System.out.println(Arrays.deepToString(mas));
                break;
            case "2":
                Auto auto = new Auto(100, 1987, new Helm(100, "Alcantara"), new Engine(100));
                for (Auto[] row : mas){
                    Arrays.fill(row, auto);
                    System.out.println(Arrays.deepToString(row));
                }
                break;
            default:
                exit(0);
        }
    }

    private static void menu() {
        System.out.println("1. Display values from array: ");
        System.out.println("2. Set the same object to each element of array: ");
    }

    private static int getRandomValueFromRange(int min, int max) {
        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);
        Random random = new Random();

        return random.nextInt(max - min + 1) + min;
    }
}
