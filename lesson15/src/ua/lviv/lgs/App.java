package ua.lviv.lgs;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();


             while (true){
                 Scanner scanner = new Scanner(System.in);
                 int n;
                 try {
                     n = scanner.nextInt();
                }
                 catch(Exception e) {
                     System.out.println("Error");
                     continue;
                 }
                 switch (n){
                     case 1:
                         zooClub.addPerson();
                         break;
                     case 2:
                         zooClub.addPet();
                         break;
                     case 3:
                         zooClub.removePet();
                         break;
                     case 4:
                         zooClub.removePerson();
                         break;
                     case 5:
                         zooClub.deleteOneAnimal();
                         break;
                     case 6:
                         zooClub.ShowZooClub();
                         break;
                     case 7:
                         System.exit(0);
                         break;
            }
        }
    }
}
