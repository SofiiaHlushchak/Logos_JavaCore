package ua.lviv.lgs;

public class CoffeRobot extends Robot {

    private int id;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    CoffeRobot(String name, int age, int id, int price) {
        super(name, age);
        this.id = id;
        this.price = price;
    }

    public void work() {
        System.out.println("Я CoffeRobot - я варю каву");
    }

    @Override
    public String toString() {
        return "CoffeRobot[id=" + id + ", price=" + price + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
    }
}
