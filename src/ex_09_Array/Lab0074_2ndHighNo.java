package ex_09_Array;

import java.util.Arrays;

public class Lab0074_2ndHighNo {

    public static void main(String[] args) {
        int [] number = {11,2,5,9,15};

        Arrays.sort(number);
        System.out.println(number[number.length-2]);


    }
}
