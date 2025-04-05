package ex_10_MultiArray_NestedForLoop;

import java.util.Scanner;

public class Lab0079_MatrixMultiplication {
    public static void main(String[] args) {

        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size of table: ");
        int number = size.nextInt();

        for (int i=0; i < number ; i++)
        {
            for(int j=0; j< number ; j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+" | ");
            }
            System.out.println();
        }


    }
}
