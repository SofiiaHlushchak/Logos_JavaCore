package ua.lviv.lgs.min;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Collector;

public class Faction {
    private String nameFaction;
    private ArrayList<Deputy> deputateArray = new ArrayList<>();


    public String getNameFaction() {

        return nameFaction;
    }

    public void setNameFaction(String nameFaction) {

        this.nameFaction = nameFaction;
    }

    public Faction(String nameFaction) {

        this.nameFaction = nameFaction;
    }

    List<Deputy> deputatList = new ArrayList<Deputy>();

    List<Faction> faction = new ArrayList<Faction>();

    public void addDeputy() {
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
        deputatList.add(new Deputy(weight, height, firstName, lastname, age, isGrafter));
    }

    public void deleteDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter last name:");
        String inputFirsName = scanner.next();
        Optional<Deputy> findFirst = deputatList.stream().filter(n -> n.getLastName().equalsIgnoreCase(inputFirsName)).findFirst();
        if (findFirst.isPresent()){
            faction.remove(findFirst.get());
        }
    }
    public void showGrafters(){
        System.out.println("Show all grafters");
        List<Deputy> grafter = deputatList.stream().filter(Deputy::isGrafter).collect(Collectors.toList());
        grafter.forEach(System.out::println);
    }

    public void maxGrafter(){

        List<Deputy> maxgrafter = (List<Deputy>) deputateArray.stream().filter(Deputy::isGrafter).max(Comparator.comparing(Deputy::getSizeOfBribe))
                .orElseThrow(NoSuchElementException::new);

    }

    public void allDeputate() {

        deputateArray.forEach(System.out::println);

    }

    public void cleanFraction() {
        deputateArray.removeAll(deputateArray);
    }


}
