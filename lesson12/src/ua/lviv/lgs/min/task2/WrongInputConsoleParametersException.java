package ua.lviv.lgs.min.task2;

public class WrongInputConsoleParametersException extends Throwable {

    String month;

    public WrongInputConsoleParametersException(String month) {
        super();
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}
