package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addString(list, "6"); // викликаємо функцію яка переводить стрінги в потрібним нам тип (int)
        String b = "9";
        addString(list, b);
        System.out.println(list);
    }
    static void addString(List<Integer> someList, String a){
        someList.add(Integer.parseInt(a)); // ми парсимо стрінги в число і добавляємо його в ліст який містить тільки int
    }
}
