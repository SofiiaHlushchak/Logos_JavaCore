package ua.lviv.lgs.plane;

public abstract class Plane {
    int length;
    int width;
    double weight;

    public Plane(int length, int width, double weight) {
        super();
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    void engineStart() {

        System.out.println("Time to takeoff " + (int) (20 + Math.random() * 68) + " sec");
    }

    void takeOff() {

        System.out.println("You have fuel for " + (int) (Math.random() * 1000) + " km");
    }

    void landing() {

        System.out.println("The plane goes to landing");
    }
}

