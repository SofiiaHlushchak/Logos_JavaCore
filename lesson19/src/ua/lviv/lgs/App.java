package ua.lviv.lgs;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // task1
        File file = new File("text.txt");
        Employee emp = new Employee("Taras", 15, 5000);
        Methods.serialize(file, emp);
        System.out.println(Methods.deserialize(file));

        //task3
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sonia", 10, 1000));
        employees.add(new Employee("Ivan", 11, 71200));
        employees.add(new Employee("Valya", 31, 8000));
        File file1 = new File("text.txt");
        Methods.serialize(file1, (Serializable) employees);
        System.out.println(Methods.deserialize(file1));
    }
}