package ua.lviv.lgs.plane;

public class airplaneСontrol {
    public airplaneСontrol() {

    }

    public int motionUp() {

        int Speed = (int) (Math.random() * 10);
        return Speed;
    }

    public int motionDown() {
        int Speed = (int) (Math.random() * 10);
        return Speed;
    }

    public int motionLeft() {
        int Speed = (int) (Math.random() * 10);
        return Speed;
    }

    public int motionRight() {
        int Speed = (int) (Math.random() * 10);
        return Speed;
    }


}
