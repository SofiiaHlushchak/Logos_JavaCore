package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            new App().menu();

            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    VerkhovnaRada.getVerkhovnaRada().addFaction();
                    break;

                case 2:
                    VerkhovnaRada.getVerkhovnaRada().clearFaction();
                    break;

                case 3:
                    VerkhovnaRada.getVerkhovnaRada().allFaction();
                    break;

                case 4:
                    System.out.println("Enter name of faction !");
                    String inputFactionName = scanner.next();

                    ListIterator<Faction> factionIterator = VerkhovnaRada.getFactionArray().listIterator();

                    while (factionIterator.hasNext()) {
                        Faction tempFaction = factionIterator.next();
                        if (tempFaction.getNameFaction().equals(inputFactionName)) {
                            tempFaction.clearFaction();
                        }
                    }
                    break;

                case 5:
                    VerkhovnaRada.getVerkhovnaRada().showFactionByName();
                    break;

                case 6:
                    VerkhovnaRada.getVerkhovnaRada().addDeputyToFaction();
                    break;

                case 7:
                    VerkhovnaRada.getVerkhovnaRada().deleteDeputyFromFraction();
                    break;

                case 8:
                    VerkhovnaRada.getVerkhovnaRada().showAllGraftersFromFaction();
                    break;

                case 9: {
                    VerkhovnaRada.getVerkhovnaRada().findTheBestGrafterFromFraction();
                    break;
                }


            }
        }
    }

    public void menu() {
        System.out.println("Enter 1: TO ADD NEW FACTION !");
        System.out.println("Enter 2: TO DELETE SELECTED FACTION !");
        System.out.println("Enter 3: TO SHOW ALL FACTIONS !");
        System.out.println("Enter 4: TO CLEAR SELECTED FACTION !");
        System.out.println("Enter 5: TO SHOW SELECTED FACTION !");
        System.out.println("Enter 6: TO ADD DEPUTY TO FACTION !");
        System.out.println("Enter 7: TO DELETE DEPUTY FROM FACTION !");
        System.out.println("Enter 8: TO SHOW ALL GRAFTERS !");
        System.out.println("Enter 9: TO SHOW THE BEST GRAFTER !");

    }
}
