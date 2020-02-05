package ua.lviv.lgs.max;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CommodityMethods {
    ArrayList<Commodity> Clist = new ArrayList<Commodity>();
    Scanner scanner = new Scanner(System.in);

    public void addCommodity(){
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

    public void removeCommodity(){
        System.out.println("Enter name of commodity:");
        String name = scanner.next();
        System.out.println("Please enter length of commodity ");
        int length = scanner.nextInt();
        System.out.println("Please enter width of commodity ");
        int width = scanner.nextInt();
        System.out.println("Please enter weight of commodity ");
        int weight = scanner.nextInt();

        Iterator<Commodity> commodityIterator = Clist.iterator();
        while (commodityIterator.hasNext()) {

            Commodity commodity = commodityIterator.next();

            if ((commodity.getName().equals(name)) & (commodity.getLength() == length) & (commodity.getWidth() == width)
                    & (commodity.getWeight() == weight)) {

                commodityIterator.remove();
                System.out.println(name.toString() + "Was successfully removed");
            } else {
                System.out.println("doesn't remove");
            }
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

        for (Commodity commodity : Clist) {

            if ((commodity.getName().equals(name)) & (commodity.getLength() == length) & (commodity.getWidth() == width)
                    & (commodity.getWeight() == weight)) {
                System.out.println("You have change commodity data. Here you have new commodity: ");
                commodity.setName(newname);
                commodity.setLength(newlength);
                commodity.setWidth(newwidth);
                commodity.setWeight(newweight);
            }
        }
    }

    public void sortByName() {
        System.out.println("All commodities are sorted by name");
        Clist.sort(new NameCommodityComparator());
    }

    public void sortByLength() {
        System.out.println("All commodities are sorted by length");
        Clist.sort(new LenghtCommodityComparator());
    }

    public void sortByWidth() {
        System.out.println("All commodities are sorted by width");
        Clist.sort(new WidthCommodityComporator());
    }

    public void sortByWeight() {
        System.out.println("All commodities are sorted by weight");
        Clist.sort(new WeightCommodityComparator());
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
