package ua.lviv.lgs.task1;

public class App {
    public static void main(String[] args) throws MyException, NumberFormatException, ArithmeticException, IllegalAccessException  {
        Methods m = new Methods(30,50);
        m.Summ();
        m.Divis();
        m.Multi();
        m.Rests();
    }
}
