package ua.lviv.lgs;

import java.util.Objects;

public class Person {
    private String PersomName;
    private int age;

    public String getPersomName() {
        return PersomName;
    }

    public void setPersomName(String PersomName) {
        this.PersomName = PersomName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String PersomName, int age) {
        this.PersomName = PersomName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getPersomName().equals(person.getPersomName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersomName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + PersomName + '\'' +
                ", age=" + age +
                '}';
    }
}
