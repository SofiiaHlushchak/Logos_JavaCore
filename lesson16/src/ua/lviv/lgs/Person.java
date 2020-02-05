package ua.lviv.lgs;

import java.util.Objects;

public class Person {
    public String name;
    private String lastname;
    private int age;

    Person(){
        super();
    }

    Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    public void myMethod(String args) {
        System.out.println("I can call this method via reflection " + args);
    }

    public void myMethod(String a, int args) {
        System.out.println("I can call this method via reflection " + a + " " + args);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getName().equals(person.getName()) &&
                getLastname().equals(person.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastname(), getAge());
    }
}
