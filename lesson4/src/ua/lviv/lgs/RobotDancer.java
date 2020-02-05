package ua.lviv.lgs;

public class RobotDancer extends Robot {
    private int speed;
    private int dance;

    RobotDancer(String name, int age, int speed, int dance) {
        super(name, age);
        this.speed=speed;
        this.dance=dance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDance() {
        return dance;
    }

    public void setDance(int dance) {
        this.dance = dance;
    }

    public void work() {
        System.out.println("Я RobotDancer - я просто танцюю");
    }

    @Override
    public String toString() {
        return "RobotDancer[speed = "+speed+", dance = "+dance+", name=" + super.getName() +", age=" + super.getAge() + "]";
    }
}
