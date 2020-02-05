package Animal;

public class Animal {
    private String name;
    private int age;
    private int spide;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpide() {
        return spide;
    }

    public void setSpide(int spide) {
        this.spide = spide;
    }

    public Animal(String name, int age, int spide) {
        this.name = name;
        this.age = age;
        this.spide = spide;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", spide=" + spide +
                '}';
    }
}
