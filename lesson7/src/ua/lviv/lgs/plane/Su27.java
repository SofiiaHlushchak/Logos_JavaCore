package ua.lviv.lgs.plane;

import java.util.Random;

public class Su27 extends Plane implements Special {
    private int maxSpeed;
    private String Color;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Su27(int length, int width, double weight, int maxSpeed, String color) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        Color = color;
    }

    public Su27(int length, int width, double weight) {
        super(length, width, weight);
    }
    public int speed() {
        Random random = new Random();
        int randomInt = random.nextInt();
        if (randomInt > maxSpeed)
            return randomInt;
        else {
            return 0;
        }
    }

    @Override
    void engineStart() {
        super.engineStart();
    }

    @Override
    void takeOff() {
        super.takeOff();
    }

    @Override
    void landing() {
        super.landing();
    }


    @Override
    public void TurboSpeed() {
        System.out.println("Now your speed is " + speed() + " km");

    }

    @Override
    public void StelsTechnology() {

    }


    //@Override
   // public void StelsTechnology() {
   //     System.out.println();
   // }

    @Override
    public void NuclearBoom() {
     System.out.println(Math.random()*10);
    }

    @Override
    public String toString() {
        return "Su27{" +
                "maxSpeed=" + maxSpeed +
                ", Color='" + Color + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
