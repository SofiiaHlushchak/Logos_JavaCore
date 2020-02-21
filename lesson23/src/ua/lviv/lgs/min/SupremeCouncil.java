package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SupremeCouncil {
    private static  SupremeCouncil supremeCouncil;



    public static void setSupremeCouncil(SupremeCouncil supremeCouncil) {
        SupremeCouncil.supremeCouncil = supremeCouncil;
    }
    private SupremeCouncil() {
    }

    public static SupremeCouncil getSupremeCouncil() {
        if (supremeCouncil == null) {
            supremeCouncil = new SupremeCouncil();
        }
        return supremeCouncil;
    }

    List<Faction> factionSupreme = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addFaction(){
        System.out.println("Enter name of the faction");
        String nameFaction = scanner.next();
        factionSupreme.add(new Faction(nameFaction));
    }
    public void removeFaction(){
        System.out.println("Enter name of the faction");
        String nameFaction = scanner.next();
        Optional<Faction> findFirst = factionSupreme.stream().filter(n -> n.getNameFaction().equalsIgnoreCase(nameFaction)).findFirst();
        if (findFirst.isPresent()){
            factionSupreme.remove(findFirst.get());
        }
    }

    public void showAllFaction(){
        System.out.println("Show all faction");
        factionSupreme.forEach(System.out::println);
    }


    public void getFaction(){
        System.out.println("Enter name of the Faction");
        String nameFaction = scanner.next();
        Optional<Faction> findFirst = factionSupreme.stream().filter(n -> n.getNameFaction().equalsIgnoreCase(nameFaction)).findFirst();
        if (findFirst.isPresent()){
            System.out.println(findFirst.get().getNameFaction());
        }
    }

    public void addDeputyToFaction(){
        System.out.println("Enter name of the deputy");
        String nameFaction = scanner.next();
        Optional<Faction> findFirst = factionSupreme.stream().filter(n -> n.getNameFaction().equalsIgnoreCase(nameFaction)).findFirst();
        if (findFirst.isPresent()){
           findFirst.get().addDeputy();
        }
    }

    public void removeDeputyOfTheFaction(){
        System.out.println("Enter name of the deputy");
        String nameFaction = scanner.next();
        Optional<Faction> findFirst = factionSupreme.stream().filter(n -> n.getNameFaction().equalsIgnoreCase(nameFaction)).findFirst();
        if (findFirst.isPresent()){
           findFirst.get().deleteDeputy();
        }
    }

    public void showAllGrafterOfTheFaction(){
        System.out.println("Enter name of the deputy");
        String nameFaction = scanner.next();
        Optional<Faction> findFirst = factionSupreme.stream().filter(n -> n.getNameFaction().equalsIgnoreCase(nameFaction)).findFirst();
        if (findFirst.isPresent()){
            findFirst.get().showGrafters();
        }
    }

    public void MaxGrafterOfTheFaction(){
        System.out.println("Enter name of the deputy");
        String nameFaction = scanner.next();
        Optional<Faction> findFirst = factionSupreme.stream().filter(n -> n.getNameFaction().equalsIgnoreCase(nameFaction)).findFirst();
        if (findFirst.isPresent()){
            findFirst.get().maxGrafter();
            System.out.println("This is the max grafter of all deputies of this faction ");
        }
    }

    public void showAllDeputy(){
        System.out.println("Enter name of the deputy");
        String nameFaction = scanner.next();
        Optional<Faction> findFirst = factionSupreme.stream().filter(n -> n.getNameFaction().equalsIgnoreCase(nameFaction)).findFirst();
        if (findFirst.isPresent()){
            findFirst.get().addDeputy();
            showAllGrafterOfTheFaction();
            System.out.println("This is the all deputies of this faction ");
        }
    }
}
