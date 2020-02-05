package ua.lviv.lgs.enumeration;

import java.util.Scanner;

import java.util.Scanner;
/**
 * @since java 1.8
 * @author Sonia Glushchak
 * @version 1.1
 */

public class App {
    /**
     * @throws WrongInputConsoleParametersException
     * @author Sonia Glushchak
     * @return null
     * @see java code convention
     */
    static void menu() {
        System.out.println("Натисніть 1, щоб перевірити чи є такий місяць");
        System.out.println("Натисніть 2, щоб вивести всі місяці з такою ж порою року");
        System.out.println("Натисніть 3, щоб вивести всі місяці які мають таку саму кількість днів");
        System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("Натисніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("Натисніть 6, щоб вивести на екран наступну пору року");
        System.out.println("Натисніть 7, щоб вивести на екран попередню пору року");
        System.out.println("Натисніть 8, щоб вивести на екран всі міcяці які мають парну кількість днів");
        System.out.println("Натисніть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("Натисніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
    }

    public static void main(String[] args) throws WrongInputConsoleParametersException {
        Month[] arr = Month.values();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            switch (sc.next()) {
                case "1": {
                    System.out.println("Enter month");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();

                    boolean flag = false;

                    for (Month m : arr) {
                        try {
                            if (m.name().equals(month)) {
                                System.out.println("Month exist");
                                flag = true;
                            }
                        } finally {
                            if (!flag) {
                                String message = (" You have put wrong name of month");
                                throw new WrongInputConsoleParametersException(message);
                            }
                        }
                        break;
                    }


                }
                case "2": {
                    System.out.println("Enter season");
                    sc = new Scanner(System.in);
                    String seasonSc = sc.next().toUpperCase();

                    boolean flag = false;

                    for (Month m : arr) {
                        if (m.getSeasons().name().equals(seasonSc)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        for (Month mon : arr) {
                            if (mon.getSeasons().toString().equalsIgnoreCase(seasonSc)) {
                                System.out.println(mon);
                            }
                        }
                    }
                    if (!flag) {
                        String message = (" You have put wrong name of season");
                        throw new WrongInputConsoleParametersException(message);
                    }
                    break;
                }
                case "3": {
                    System.out.println("Enter month");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();

                    Month month2;
                    month2 = Month.valueOf(month);

                    for (Month m : Month.values()) {
                        if (m.getDays() == month2.getDays()) {
                            System.out.println(m);
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("Enter month");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();

                    Month month2;
                    month2 = Month.valueOf(month);

                    for (Month m : Month.values()) {
                        if (m.getDays() < month2.getDays()) {
                            System.out.println(m);
                        }
                    }
                    break;
                }

                case "5": {

                    System.out.println("Enter month");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();

                    Month month2;
                    month2 = Month.valueOf(month);

                    for (Month m : Month.values()) {
                        if (m.getDays() > month2.getDays()) {
                            System.out.println(m);
                        }
                    }
                    break;
                }
                case "6": {

                    System.out.println("Enter Season");
                    sc = new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    Seasons season2 = Seasons.valueOf(season);

                    int ordinal = season2.ordinal();
                    int nextIndex = ordinal + 1;

                    Seasons[] arr2 = Seasons.values();
                    nextIndex %= arr2.length;

                    System.out.println(arr2[nextIndex]);
                }
                break;

                case "7": {

                    System.out.println("Enter Season");
                    sc = new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    Seasons season2 = Seasons.valueOf(season);

                    int ordinal = season2.ordinal();
                    int prev = ordinal - 1;

                    Seasons[] arr2 = Seasons.values();
                    prev %= arr2.length;
                    if (ordinal == 0) {
                        int prev1 = arr2.length - 1;
                        System.out.println(arr2[prev1]);
                    } else {
                        System.out.println(arr2[prev]);
                    }
                }
                break;

                case "8": {

                    for (Month month : Month.values()) {
                        if (month.getDays() % 2 == 0) {
                            System.out.println(month.name());
                        }
                    }
                    break;
                }
                case "9": {

                    for (Month month : Month.values()) {
                        if (month.getDays() % 2 == 1) {
                            System.out.println(month.name());
                        }
                    }
                    break;
                }
                case "10": {
                    System.out.println("Enter month ");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();

                    Month month2 = Month.valueOf(month);
                    if (month2.getDays() % 2 == 0) {
                        System.out.println("Введено місяць з парною кількістю днів");
                    } else {
                        System.out.println("Введено місяць з непарною кількістю днів");
                    }
                    break;
                }

            }

        }
    }

}
