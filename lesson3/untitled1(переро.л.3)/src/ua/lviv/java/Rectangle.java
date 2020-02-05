package ua.lviv.java;

public class Rectangle {
    private int width;
    private int height;
    private int area;
    private int perimeter;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    Rectangle(){
        this.height=8;
        this.width=10;
    }

    Rectangle(int height, int weight){
    this.width=weight;
    this.height=height;
    }

    public int getArea() {
        return (width * height);

    }

    public int getPerimeter(){
        return (2*width+2*height);
    }



    public String toString() {
        return "Rectangle [length=" + height + ", width=" + width +"]";
    }

}


