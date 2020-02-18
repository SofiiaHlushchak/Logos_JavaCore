package ua.lviv.lgs.MaxMin;

public class App {
    public static void main(String[] args) {
        MaxMin dMax = () -> Double.MAX_VALUE;
        System.out.println(dMax.number());
        MaxMin dMin = () -> Double.MIN_VALUE;
        System.out.println(dMin.number());
        MaxMin fMax = () -> Float.MAX_VALUE;
        System.out.println(fMax.number());
        MaxMin fMin = () -> Float.MIN_VALUE;
        System.out.println(fMin.number());
    }
}

