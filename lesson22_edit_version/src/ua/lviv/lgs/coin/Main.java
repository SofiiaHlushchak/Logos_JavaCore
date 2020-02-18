package ua.lviv.lgs.coin;



public class Main {
    public static void main(String[] args) {
        Coin coin = ()->{
            if (((int)(Math.random()*2)==0)) {
                System.out.println("Орел");
            } else
                System.out.println("Решка");

        };
        coin.coin();
    }

}
