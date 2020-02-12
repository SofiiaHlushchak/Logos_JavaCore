package ua.lviv.lgs.max;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();

        map.addNewObject("Ivan", 1);
        map.addNewObject("Sonia19", 19);
        map.addNewObject("Sonia11", 11);
        map.addNewObject("Sonia15", 15);
        map.addNewObject("Sonia14", 14);
        map.addNewObject("Sonia12", 12);
        map.addNewObject("Sonia1", 6);

        map.removeByKey("Ivan");

        map.removeByValue(6);
        System.out.println();
        map.showSetKey();
        map.showMap();
        System.out.println(map.showListValue());
    }
}
