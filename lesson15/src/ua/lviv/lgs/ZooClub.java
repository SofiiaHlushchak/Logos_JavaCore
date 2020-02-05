package ua.lviv.lgs;

import javax.swing.text.html.parser.Entity;
import java.lang.reflect.Array;
import java.util.*;

public class ZooClub {
    Map<Person, ArrayList<Animal>> map = new HashMap<Person, ArrayList<Animal>>();

    public ZooClub() {
        this.map = map;
    }

    Scanner scanner = new Scanner(System.in);

    public void addPerson(){
        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        Person person = new Person(name,age);

        map.put(person, new ArrayList<Animal>());
        System.out.println(person);
    }

    public void addPet(){
        System.out.println("Enter kind:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();


        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){

            Map.Entry<Person, ArrayList<Animal>> entry = iterator.next();

            if (entry.getKey().getPersomName().equalsIgnoreCase(name)) {
                System.out.println(name + " Please enter your pet");
                String pet = scanner.next();
                System.out.println("Please enter the name of your pet ");
                String petName = scanner.next();

                ArrayList<Animal> animalList = entry.getValue();
                animalList.add(new Animal());
                entry.setValue(animalList);
            }
        }

    }

    public void removePet(){
        System.out.println("Enter name:");
        String name = scanner.next();

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person, ArrayList<Animal>> entry = iterator.next();

            if (entry.getKey().getPersomName().equalsIgnoreCase(name)){
                System.out.println(name + "Enter your pet:");
                String Pet = scanner.next();

                ArrayList<Animal> animals = new ArrayList<>();
                Iterator<Animal> iterator1 = animals.iterator();

                while (iterator1.hasNext()){
                    if(iterator1.next().getKind().equalsIgnoreCase(Pet)){
                        iterator1.remove();
                        System.out.println(iterator.toString()+ "Successfully deleted");
                    }
                }
            }

        }
    }

    public void removePerson(){
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person, ArrayList<Animal>> entry = iterator.next();
            if (entry.getKey().getPersomName().equalsIgnoreCase(name) && entry.getKey().getAge()==age){
                iterator.remove();
                System.out.println(entry.getKey().toString()+"Successfully deleted");
            }
        }
    }
    public void deleteOneAnimal(){
        System.out.println("Enter name your pet:");
        String name = scanner.next();

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person,ArrayList<Animal>> entry = iterator.next();
            ArrayList<Animal> animals = entry.getValue();

            Iterator<Animal> iterator2 = animals.iterator();

            while (iterator2.hasNext()){
                Animal animal = iterator2.next();

                if(animal.getKind().equalsIgnoreCase(name)) {

                        iterator.remove();
                    System.out.println(animal.toString()+ entry.getKey());
                }
            }
        }
    }
    public void ShowZooClub(){
        System.out.println("Here you can see of our Club");

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Person, ArrayList<Animal>> nextEntry = iterator.next();
            nextEntry.getKey().getPersomName();

            ArrayList<Animal> animals = nextEntry.getValue();

            for (Animal animal : animals) {
                System.out.println("Our ZooClub consists of " + nextEntry.getKey().getPersomName() + animal.getKind());
            }
        }
    }
}



