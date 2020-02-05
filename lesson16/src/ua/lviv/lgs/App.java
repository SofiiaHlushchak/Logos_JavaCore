package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class class1 = Person.class;

        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        System.out.println(class1.getModifiers());
        System.out.println(class1.getPackage());
        System.out.println(class1.toString());
        System.out.println(Modifier.isPublic(class1.getModifiers()));


        Constructor[] constructors1 = class1.getConstructors();

        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }

        Constructor constructor2;
        constructor2 = class1.getDeclaredConstructor(String.class, String.class);
        System.out.println("Single Constructor = " + constructor2);

        Constructor<Person> constructor1 = class1.getConstructor(String.class, String.class, int.class);
        Person newInstancePerson = constructor1.newInstance("Sonia", "Hlushchak", 18);

        class1.getDeclaredField("name").trySetAccessible();
        class1.getDeclaredField("name").setAccessible(true);
        class1.getField("name").set(newInstancePerson, "NewSonia");
        System.out.println(newInstancePerson.getName() + " Name Of Person");

        Field[] fields = class1.getDeclaredFields();

        fields = class1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Method[] methods = class1.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        Person newInstancePerson1 = constructor1.newInstance("Sonia", "Hlushchak", 18);

        Method method = newInstancePerson1.getClass().getDeclaredMethod("myMethod", String.class);
        Method method1 = newInstancePerson1.getClass().getDeclaredMethod("myMethod", String.class, int.class);

        method.invoke(newInstancePerson1, "Args");
        method1.invoke(newInstancePerson1, "Args", 1);

    }
}
