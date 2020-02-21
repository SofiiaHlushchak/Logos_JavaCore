package ua.lviv.lgs.max.Task2;

import java.util.*;


public class CommodityMethods {
    ArrayList<Commodity> Clist = new ArrayList<Commodity>();
    Scanner scanner = new Scanner(System.in);

    public void addCommodity() {
        System.out.println("Enter name of commodity:");
        String name = scanner.next();
        System.out.println("Please enter length of commodity ");
        int length = scanner.nextInt();
        System.out.println("Please enter width of commodity ");
        int width = scanner.nextInt();
        System.out.println("Please enter weight of commodity ");
        int weight = scanner.nextInt();

        Clist.add(new Commodity());
        System.out.println(Clist);
    }

    public void removeCommodity() {
        System.out.println("Enter name of commodity:");
        String name = scanner.next();
        System.out.println("Please enter length of commodity ");
        int length = scanner.nextInt();
        System.out.println("Please enter width of commodity ");
        int width = scanner.nextInt();
        System.out.println("Please enter weight of commodity ");
        int weight = scanner.nextInt();

        Optional<Commodity> commodityOptional = Clist.stream().filter(s->s.getName().equalsIgnoreCase(name)).filter(n -> n.getLength() == length).filter(n -> n.getWidth() == width)
                .filter(n -> n.getWeight() == weight).findFirst();
        if(commodityOptional.isPresent()){
            Clist.remove(commodityOptional.get());
            System.out.println(name + "Was successfully removed");
        }
    }

    public void changeCommodity() {
        System.out.println("Please enter name of commodity ");
        String name = scanner.next();
        System.out.println("Please enter new name of commodity ");
        String newname = scanner.next();
        System.out.println("Please enter length of commodity ");
        int length = scanner.nextInt();
        System.out.println("Please enter new length of commodity ");
        int newlength = scanner.nextInt();
        System.out.println("Please enter width of commodity ");
        int width = scanner.nextInt();
        System.out.println("Please enter new width of commodity ");
        int newwidth = scanner.nextInt();
        System.out.println("Please enter weight of commodity ");
        int weight = scanner.nextInt();
        System.out.println("Please enter new weight of commodity ");
        int newweight = scanner.nextInt();

        Optional<Commodity> findFirst = Clist.stream().filter(n -> n.getName().equals(name))
                .filter(n -> n.getLength() == length).filter(n -> n.getWidth() == width)
                .filter(n -> n.getWeight() == weight).findFirst();
        if (findFirst.isPresent()) {

            Commodity commodity = new Commodity();
            commodity = findFirst.get();
            commodity.setName(newname);
            commodity.setLength(newlength);
            commodity.setWidth(newwidth);
            commodity.setWeight(newweight);
        }
        System.out.println(Clist);
    }


    public void sortByName() {
        System.out.println("All commodities are sorted by name");
        Comparator<Commodity> comparator = Comparator.comparing( Commodity::getName);
        Clist.stream().sorted(comparator).forEach(System.out::println);
    }

    public void sortByLength() {
        System.out.println("All commodities are sorted by length");
        Comparator<Commodity> comparator = Comparator.comparing( Commodity::getLength);
        Clist.stream().sorted(comparator).forEach(System.out::println);
    }

    public void sortByWidth() {
        System.out.println("All commodities are sorted by width");
        Comparator<Commodity> comparator = Comparator.comparing( Commodity::getWidth);
        Clist.stream().sorted(comparator).forEach(System.out::println);
    }

    public void sortByWeight() {
        System.out.println("All commodities are sorted by weight");
        Comparator<Commodity> comparator = Comparator.comparing( Commodity::getWeight);
        Clist.stream().sorted(comparator).forEach(System.out::println);
    }

    public void getCommodity() {
        System.out.println("Please enter the number of commodity");
        int i = scanner.nextInt();

        if (i < (Clist.size() - 1)) {
            System.out.println("Number " + i + " corresponds to " + Clist.get(i));
        } else {

        }

    }
}


