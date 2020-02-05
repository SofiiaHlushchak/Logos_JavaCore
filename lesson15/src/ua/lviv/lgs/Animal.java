package ua.lviv.lgs;

import java.util.Objects;

public class Animal {
    private String kind;
    private String name;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        this.kind = kind;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return kind.equals(animal.kind) &&
                name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, name);
    }
}
