package ua.lviv.lgs.min;

public class Human {
    private int growwth;
    private double weight;

    public int getGrowwth() {

        return growwth;
    }

    public void setGrowwth(int growwth) {

        this.growwth = growwth;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public Human(int growwth, double weight) {
        this.growwth = growwth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "growwth=" + growwth +
                ", weight=" + weight +
                '}';
    }
}
