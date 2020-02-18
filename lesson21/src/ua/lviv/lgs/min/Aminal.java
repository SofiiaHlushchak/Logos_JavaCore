package ua.lviv.lgs.min;

public class Aminal {
    @Annotation(params = "name annotation")
    private String name;
    @Annotation(params = "age annotation")
    private int age;
    @Annotation(params = "kind annotation")
    private String kind;

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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Aminal(String name, int age, String kind) {
        super();
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Aminal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                '}';
    }
}
