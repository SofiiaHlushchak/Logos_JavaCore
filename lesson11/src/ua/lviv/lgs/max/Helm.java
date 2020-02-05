package ua.lviv.lgs.max;

public class Helm {
    private int diameter;
    private String material;

    public Helm(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
