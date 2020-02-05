package ua.lviv.lgs.min.task1;

import java.util.*;

import static java.lang.System.exit;

public class App {
    public static void main(String[] args) {

        List<Auto> list1 = new ArrayList<>();

        list1.add(new Auto(getRandomValueFromRange(1, 5), getRandomValueFromRange(3, 6),
                new Helm(getRandomValueFromRange(3, 6), "Alcantara"),
                new Engine(getRandomValueFromRange(2, 6))));

        menu();
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        switch (s){
            case "1":
                System.out.println(Arrays.deepToString(new List[]{list1}));
                break;
            case "2":
                list1.add(new Auto(562,2346,new Helm(324,"alcantara"),new Engine(5346)));
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
