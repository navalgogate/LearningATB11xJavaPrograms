package ex_05_While_Loop;

import java.util.Scanner;

public class Lab0043_while_Loop5_Factorial {
    public static void main(String[] args) {

        //Factorial Programm

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome\nEnter the number for Factorial Program: ");
        int number = scanner.nextInt();

        int factorial= 1;
        if (number <=0)
        {
            System.out.println(factorial);
        }
        else
        {
            for (int i=1; number >=i ; i++)
            {
                factorial = factorial *i;
            }
            System.out.println("Factorial is : " +factorial);
        }



    }
}
