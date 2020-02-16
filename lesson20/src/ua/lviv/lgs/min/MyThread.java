package ua.lviv.lgs.min;

import java.util.Scanner;

public class MyThread extends Thread {
    public synchronized void run(){
        Scanner scanner = new Scanner(System.in);
        int to = scanner.nextInt();

        System.out.print("Потік Thread: ");
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= to; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
