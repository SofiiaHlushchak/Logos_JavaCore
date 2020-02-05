package car;

public class Helm {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Helm(int radius){
        this.radius=radius;
    }

    public int diameter(int gg){
        return (gg+2*radius);
    }

    @Override
    public String toString() {
        return "Helm[radius="+radius+"]";
    }
}
