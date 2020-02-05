package ua.lviv.lgs.arraysS;

import java.util.Arrays;

public class ArraysS {

//    int [][] Array = {{1,2,3,4},{1,4,5,6}};
    static int[] r = {0,2,3,3,5,6,7,0,7,5,4,8,9,6,5,4,6,9,6};
    public static void main(String[] args) {
        for(int i = 0;i< r.length; i++){

            if(r[i]%2==0 && r[i] == (int)r[0]) {
                System.out.println("Something");
            }

    }
    }
}
//1234567897 - element
//0123456789 - index
