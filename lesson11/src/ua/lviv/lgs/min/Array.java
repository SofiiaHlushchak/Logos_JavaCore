package ua.lviv.lgs.min;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Integer [] array = new Integer [15];
        Random random = new Random();


        for (int i = 0 ; i<array.length; i++){
            array[i]= random.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }


}