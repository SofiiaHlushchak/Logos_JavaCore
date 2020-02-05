package car;

public class Body {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Body(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Body[color=+color+]";

    }
}
