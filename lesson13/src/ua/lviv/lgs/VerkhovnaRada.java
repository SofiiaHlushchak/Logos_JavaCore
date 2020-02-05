package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {
    private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();


    private VerkhovnaRada() {
    }

    public static VerkhovnaRada getVerkhovnaRada() {
        return verkhovnaRada;
    }
    private static ArrayList<Faction> factionArray = new ArrayList<>();
    public static ArrayList<Faction> getFactionArray() {
        return factionArray;
    }

    public void addFaction() {
        System.out.println("Enter name of faction !");
        Scanner scanner = new Scanner(System.in);
        String inputFactionName = scanner.next();
        getFactionArray().add(new Faction(inputFactionName));
    }

    public void clearFaction() {
        System.out.println("Please enter name of faction ");
        Scanner scanner = new Scanner(System.in);
        String factionName = scanner.next();
        Iterator<Faction> iterator3 = getFactionArray().iterator();

        while (iterator3.hasNext()) {
            Faction faction = iterator3.next();
            if (faction.getNameFaction().equalsIgnoreCase(factionName)) {
                faction.clearFaction();
            }
        }
    }

    public void allFaction() {
        System.out.println("Here we have list of all faction of SupremeCouncil: ");

        Iterator<Faction> iterator2 = getFactionArray().iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next().getNameFaction());
        }
    }

    public void showFactionByName() {
        System.out.println("Enter name of faction !");
        Scanner scanner = new Scanner(System.in);
        String inputFactionName = scanner.next();

        Iterator<Faction> factionIterator = getFactionArray().iterator();

        while (factionIterator.hasNext()) {
            Faction tempFaction = factionIterator.next();
            if (tempFaction.getNameFaction().equals(inputFactionName)) {
                System.out.println(tempFaction);
            }
        }
    }
    public void addDeputyToFaction() {
        System.out.println("Enter name of faction !");
        Scanner scanner = new Scanner(System.in);
        String inputFactionName = scanner.next();

        Iterator<Faction> factionIterator = getFactionArray().iterator();

        while (factionIterator.hasNext()) {
            Faction tempFaction = factionIterator.next();
            if (tempFaction.getNameFaction().equals(inputFactionName)) {
                tempFaction.addDeputy();
            }
        }
    }

    public void deleteDeputyFromFraction(){
        System.out.println("Enter name of deputy:");
        Scanner scanner = new Scanner(System.in);
        String inputFactionName = scanner.next();

        Iterator<Faction> factionIterator = getFactionArray().iterator();

        while (factionIterator.hasNext()){
            Faction tempFaction = factionIterator.next();
            if (tempFaction.getNameFaction().equals(inputFactionName)){
                tempFaction.deleteDeputy();
            }
        }
    }

    public void showAllGraftersFromFaction(){
        System.out.println("Enter name of deputy:");
        Scanner scanner = new Scanner(System.in);
        String inputFactionName= scanner.next();

        Iterator<Faction> factionIterator = getFactionArray().iterator();

        while (factionIterator.hasNext()) {
            Faction tempFaction = factionIterator.next();
            if (tempFaction.getNameFaction().equals(inputFactionName)) {
                tempFaction.showGrafters();
            }
        }
    }

    public void findTheBestGrafterFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of deputy !");
        String inputFactionName = scanner.next();

        Iterator<Faction> factionIterator = getFactionArray().iterator();

        while (factionIterator.hasNext()) {
            Faction tempFaction = factionIterator.next();
            if (tempFaction.getNameFaction().equals(inputFactionName)) {
                tempFaction.maxGrafter();
            }
        }
    }

    public void showAllDeputysFromFaction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name f deputy");
        String inputFactionName = scanner.next();

        Iterator<Faction> factionIterator = getFactionArray().iterator();

        while (factionIterator.hasNext()) {
            Faction tempFaction = factionIterator.next();
            if (tempFaction.getNameFaction().equals(inputFactionName)) {
                tempFaction.showAllDeputys();
            }
        }
    }

}
