package ua.lviv.lgs;

public class RobotCoocker extends Robot {
    private int speed;
    private int dish;

    RobotCoocker(String name, int age, int speed, int dish) {
        super(name, age);
        this.speed=speed;
        this.dish=dish;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDish() {
        return dish;
    }

    public void setDish(int dish) {
        this.dish = dish;
    }

    public void work() {
        System.out.println("Я RobotCooker - я просто готую");
    }


    public String toString() {
        return "RobotDancer[speed = "+speed+", dish = "+dish+", name=" + super.getName() +", age=" + super.getAge() + "]";
    }
}
