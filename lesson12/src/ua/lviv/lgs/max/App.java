package ua.lviv.lgs.max;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List list1 = new ArrayList();

        list1.add("Sonia");
        list1.add(18);
        list1.add("white");
        list1.add('w');
        list1.add(1241235);

        System.out.println(list1);

        list1.remove(2);
        list1.remove(5);

        System.out.println(list1);

    }
}
