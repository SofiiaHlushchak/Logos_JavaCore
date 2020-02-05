package ua.lviv.lgs;

public class app {
    public static void main(String[] args) {

        Robot r = new Robot("Like", 12);

        CoffeRobot c = new CoffeRobot("like", 12, 1212,300);

        RobotDancer d = new RobotDancer("like", 13,15,20);

        RobotCoocker e  = new RobotCoocker("like", 12,14,13);

        System.out.println();
        r.work();
        c.work();
        d.work();
        e.work();

        c.setAge(13);
        System.out.println(c.getAge());

//
//        Robot [] arrayRobot = new Robot[5];
//
//        for (int i=0; i<arrayRobot.length; i++)
//        {
//            arrayRobot[i] = new Robot("like"+i,12);
//        }
//
//        for (int i=0; i<arrayRobot.length; i++)
//        {
//            arrayRobot[i].work();
//
//
//        }


    }
}
