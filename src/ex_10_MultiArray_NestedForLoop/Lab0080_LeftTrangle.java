package ex_10_MultiArray_NestedForLoop;

import java.util.Scanner;

public class Lab0080_LeftTrangle {
    public static void main(String[] args) {

        //How pattern want
        //n=3
        //*
        //**
        //***

        int n = 3;

        for (int i=n; i >= 1;i--)
        {
            for (int j=1; j <= i ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
