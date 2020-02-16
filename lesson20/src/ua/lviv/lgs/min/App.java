package ua.lviv.lgs.min;

public class App {
    public static void main(String[] args) {
        MyThread myThread = (MyThread) new MyThread();

        myThread.run();

        RunnableThread runnableThread = new RunnableThread();
        runnableThread.run();
    }
}
