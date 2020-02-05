package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Human {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isGrafter;
    private int sizeOfBribe;

    public Deputy(double growwth, double weight, String firstName, String lastName, int age, boolean isGrafter) {
        super((int) growwth, weight);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isGrafter = isGrafter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {

        return isGrafter;
    }

    public void setGrafter(boolean grafter) {
        isGrafter = grafter;
    }

    public int getSizeOfBribe() {

        return sizeOfBribe;
    }

    public void setSizeOfBribe(int sizeOfBribe) {
        this.sizeOfBribe = sizeOfBribe;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isGrafter=" + isGrafter +
                ", sizeOfBribe=" + sizeOfBribe +
                '}';
    }
    public void giveBribe(boolean isGrafter){
        if (!isGrafter){
            System.out.println("This deputy doesn't take a bribe !");

        }System.out.println("Enter size of bribe !");
        Scanner scanner = new Scanner(System.in);
        int inputSizeOfBribe = scanner.nextInt();
        System.out.println("Size of bribe: " + inputSizeOfBribe);
        if (inputSizeOfBribe > 5000) {
            System.out.println("The police imprison the deputy !");
        } else {
            setSizeOfBribe(inputSizeOfBribe);
        }
    }


}

