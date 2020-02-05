package ua.lviv.lgs.min;

import java.util.Comparator;

public class HumonComporator implements Comparator<Humon> {
    @Override
    public int compare(Humon o1, Humon o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            return (o1.getAge() > o2.getAge()) ? 1 : -1;
        }
    }
}
