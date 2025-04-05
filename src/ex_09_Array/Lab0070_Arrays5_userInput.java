package ex_09_Array;

import java.util.Scanner;

public class Lab0070_Arrays5_userInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays in Integer: ");
                int size = sc.nextInt();

        int [] number_Marks = new int[size];

        //int [] number_Marks = new int[size];
        //float [] number_Marks = new float[size];
        //String [] number_Marks = new string[size];


        for (int i=0;i< number_Marks.length;i++){
            System.out.println("Enter the number: ");
            number_Marks[i] = sc.nextInt();
        }

        System.out.println("----------");

        for (int i=0; i< number_Marks.length;i++)
        {
            System.out.println(number_Marks[i]);
        }


    }
}
