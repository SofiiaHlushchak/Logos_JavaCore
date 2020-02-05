package car;

public class app {
    public static void main(String[] args) {
        Car c = new Car("BMW", 10, new Helm(20),new Wheel(30), new Body("while"));

        c.setAge(30);
        System.out.println(c.getAge());

        c.setBody(new Body("red"));
        System.out.println(c.getBody().getColor());

        c.setHelm(new Helm(40));
        System.out.println(c.getHelm().getRadius());

        System.out.println(c.getModel());
        System.out.println(c.getAge());
        System.out.println(c.getHelm());

        System.out.println(c.getWheel().increaseSize(9));
        System.out.println(c.getHelm().diameter(5));
    }
}
