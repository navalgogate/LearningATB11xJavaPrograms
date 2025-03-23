package ex_07_Functions;

import java.util.Scanner;

public class Lab0052_Function_Arth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter Num 1: ");
        int a = 0;
        if (scanner.hasNextInt()) {
             a = scanner.nextInt();
        }
        else {
            System.out.println("Enter Integer");
            System.exit(0);
        }

        System.out.println("Enter Num 2: ");
        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }
        else{
            System.out.println("Enter Integer");
            System.exit(0);
        }


        int m = sum(a,b);
        int n = sub(a,b);
        int o = div(a,b);
        int p = mul(a,b);
        int q = mod(a,b);

        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);



    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int div(int a, int b){
        return a/b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int mod(int a, int b){
        return a%b;
    }





}
