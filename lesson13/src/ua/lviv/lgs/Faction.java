package ua.lviv.lgs;

import java.util.*;

public class Faction {
    private String nameFaction;

    public String getNameFaction() {
        return nameFaction;
    }

    public void setNameFaction(String nameFaction) {
        this.nameFaction = nameFaction;
    }

    public Faction(String nameFaction) {
        this.nameFaction = nameFaction;
    }

    List<Deputy> faction = new ArrayList<Deputy>();
    public void addDeputy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName:");
        String firstName = scanner.next();
        System.out.println("Enter lastname:");
        String lastname = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Is Grafter? ");
        boolean isGrafter = scanner.nextBoolean();
        faction.add(new Deputy(weight, height, firstName, lastname, age, isGrafter));
    }
    public void deleteDeputy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter last name:");
        String inputFirsName = scanner.next();

        Iterator<Deputy> deputyIterator = faction.iterator();
        while (deputyIterator.hasNext()) {
            if (inputFirsName.equals(deputyIterator.next().getLastName())) {
                deputyIterator.remove();
            }
        }
    }
    public void showGrafters(){
        Iterator<Deputy> deputyIterator = faction.iterator();
        while (deputyIterator.hasNext()){
            Deputy tempDeputy = deputyIterator.next();
            if (tempDeputy.isGrafter()) {
                System.out.println(tempDeputy);
            }
        }
    }
    public void maxGrafter() {
        Iterator<Deputy> iterator = faction.iterator();
        int maxGraft = 0;
        while (iterator.hasNext()) {
            Deputy deputat = iterator.next();
            if (deputat.getSizeOfBribe() > maxGraft) {
                maxGraft = deputat.getSizeOfBribe();
            }
            System.out.println("The mayor grafter is - " + deputat.getSizeOfBribe());
        }
    }
    public void showAllDeputys() {
        ListIterator<Deputy> deputyIterator = faction .listIterator();

        while (deputyIterator.hasNext()) {
            System.out.println(deputyIterator.next());
        }
    }

    public void clearFaction() {
        faction.clear();
    }

    @Override
    public String toString() {
        return "Faction{" +
                "nameFaction='" + nameFaction + '\'' +
                ", faction=" + faction +
                '}';
    }


}

