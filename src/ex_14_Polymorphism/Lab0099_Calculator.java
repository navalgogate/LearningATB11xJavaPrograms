package ex_14_Polymorphism;

public class Lab0099_Calculator {

    public int add (int a, int b){
        return a + b;
    }

    public double  add (double a, double b, double c){
        return a + b + c;
    }

    public static void main(String[] args) {

        Lab0099_Calculator c1 = new Lab0099_Calculator();
        c1.add(3,6);
        c1.add(3.44,6.4,7.3);

    }


}
