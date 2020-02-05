package ua.lviv.lgs.plane;

public class App {
    public static void main(String[] args) {
        airplaneСontrol a = new airplaneСontrol();
        Su27 s= new Su27(80,90,60.8);

        System.out.println(a.motionLeft() +  "км/год");
        System.out.println(a.motionDown() +  "км/год");
        System.out.println(a.motionRight() +  "км/год");
        System.out.println(a.motionUp() +  "км/год");
        s.StelsTechnology();
        s.NuclearBoom();
        s.TurboSpeed();// Тікаємо!!!
        s.landing();
    }
}
