package ua.lviv.lgs.task1;

public class MyException extends Exception {
    private String result;

    public MyException(String result) {
        super(result);
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}

