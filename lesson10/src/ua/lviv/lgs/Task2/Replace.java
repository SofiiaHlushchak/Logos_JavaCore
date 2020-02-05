package ua.lviv.lgs.Task2;

public class Replace {

    public static void main(String[] args) {
        String oldS = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        String newS = oldS.replaceAll("[aeiou]", "-");
        System.out.println(newS);
    }
}
