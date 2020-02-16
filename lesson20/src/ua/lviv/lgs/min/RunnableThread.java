package ua.lviv.lgs.min;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    @Override
    public synchronized void run() {
        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        int to = scanner.nextInt();
        Integer[] reverseFobinachi = new Integer[to];

        System.out.print("Потік Runnable: ");
        int n0 = 1;
        int n1 = 1;
        int n2;
        reverseFobinachi[0]= n0;
        reverseFobinachi[1]= n1;
        for (int i = 3; i <= to; i++) {
            n2 = n0 + n1;

            reverseFobinachi[i-1] = n2;
            n0 = n1;
            n1 = n2;
        }

        for (int i = reverseFobinachi.length-1; i >= 0; i--) {
            System.out.print(reverseFobinachi[i] + " ");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
