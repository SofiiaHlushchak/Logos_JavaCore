package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Deputy> deputy = new ArrayList<Deputy>();

        List<Faction> factions = new ArrayList<Faction>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Enter 1, for add faction");
            System.out.println("Enter 2, for remove faction");
            System.out.println("Enter 3, for show all factions of Supreme Council");
            System.out.println("Enter 4, for clear inputed fraction");
            System.out.println("Enter 5, for show info about inputed faction");
            System.out.println("Enter 6, for add a deputy to faction");
            System.out.println("Enter 7, for remove input deputy from fraction");
            System.out.println("Enter 8, for show list of grafters");
            System.out.println("Enter 9, for show mas important Grafter");

            switch (scanner.nextInt()) {

                case 1: {
                    SupremeCouncil.getSupremeCouncil().addFaction();
                    break;
                }

                case 2: {
                    SupremeCouncil.getSupremeCouncil().removeFaction();
                    break;
                }

                case 3: {
                    SupremeCouncil.getSupremeCouncil().showAllFaction();
                    break;
                }

                case 4: {
                    SupremeCouncil.getSupremeCouncil().getFaction();
                    break;
                }

                case 5: {
                    SupremeCouncil.getSupremeCouncil().addDeputyToFaction();
                    break;
                }

                case 6: {
                    SupremeCouncil.getSupremeCouncil().removeDeputyOfTheFaction();
                    break;
                }

                case 7: {
                    SupremeCouncil.getSupremeCouncil().showAllGrafterOfTheFaction();
                    break;
                }

                case 8: {
                    SupremeCouncil.getSupremeCouncil().MaxGrafterOfTheFaction();
                    break;
                }

                case 9: {
                    SupremeCouncil.getSupremeCouncil().showAllDeputy();
                    break;
                }

            }

        }

    }

}
