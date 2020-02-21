package ua.lviv.lgs.max.Task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Taras",21));
        personSet.add(new Person("Sonia",21));
        personSet.add(new Person("Maria",18));
        personSet.add(new Person("Oksana",18));

        personSet.forEach(System.out::println);
        System.out.println();

        TreeSet<Person> humonTreeSet = new TreeSet<>(new PersonComporator());

        humonTreeSet.add(new Person("Oksana",18));
        humonTreeSet.add(new Person("Sonia",21));
        humonTreeSet.add(new Person("Taras",21));
        humonTreeSet.add(new Person("Maria",18));


        personSet.forEach(System.out::println);
    }
}
