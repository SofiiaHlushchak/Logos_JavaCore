package ua.lviv.lgs.enum1;

public class App {
    public static void main(String[] args) {
        TrafficSignal st = TrafficSignal.red;

        for(TrafficSignal signal : TrafficSignal.values() ){
            System.out.println(signal.ordinal()+"signal");
            System.out.println(signal.name());
            System.out.println(signal.equals(TrafficSignal.yellow));
            System.out.println(signal.toString());
            System.out.println(signal.hashCode());
            System.out.println(signal.values());
        }
    }
}
