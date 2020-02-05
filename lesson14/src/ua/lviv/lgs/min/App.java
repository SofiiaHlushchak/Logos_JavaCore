package ua.lviv.lgs.min;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Humon> humonSet = new HashSet<>();

        humonSet.add(new Humon("Taras",21));
        humonSet.add(new Humon("Sonia",21));
        humonSet.add(new Humon("Maria",18));
        humonSet.add(new Humon("Oksana",18));

        for (Humon humon : humonSet){
            System.out.println(humon);
        }

        TreeSet<Humon> humonTreeSet = new TreeSet<>(new HumonComporator());

        humonTreeSet.add(new Humon("Oksana",18));
        humonTreeSet.add(new Humon("Sonia",21));
        humonTreeSet.add(new Humon("Taras",21));
        humonTreeSet.add(new Humon("Maria",18));


        for (Humon humon1: humonTreeSet){
            System.out.println(humon1);
        }
    }
}
