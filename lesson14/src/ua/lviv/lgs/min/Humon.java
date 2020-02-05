package ua.lviv.lgs.min;

public class Humon {
    private String name;
    private int age;

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

    public Humon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Humon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int compateTo(Humon o){
        return this.name.compareTo(o.getName());
    }

}
