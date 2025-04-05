package ex_10_MultiArray_NestedForLoop;

import java.util.Scanner;

public class Lab0078_RightTrangle {
    public static void main(String[] args) {

        //How pattern want
        //n=3
        //*
        //**
        //***

        Scanner TriangleNo = new Scanner(System.in);
        System.out.println("Enter the triangle no: ");
        int n = TriangleNo.nextInt();

        int [] [] matrix = {{1},
                {1,2},
                {1,2,3}};

        for (int i=0; i < n;i++)
        {
            for (int j=0; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
