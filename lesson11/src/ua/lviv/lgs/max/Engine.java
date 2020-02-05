package ua.lviv.lgs.max;

public class Engine {
    private int cylinder;

    public int getCylinder() {
        return cylinder;
    }

    public Engine(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinder=" + cylinder +
                '}';
    }
}
