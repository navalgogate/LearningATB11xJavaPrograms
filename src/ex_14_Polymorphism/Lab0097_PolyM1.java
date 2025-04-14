package ex_14_Polymorphism;

public class Lab0097_PolyM1 {

    public static void main(String[] args) {

        Mathematics M1 = new Mathematics();

        int a1=M1.add(44,55);
        int a2=M1.add(44,55,22);
        double a3 =M1.add(44.2222222,55.1111111);

        System.out.println("a1=" + a1);
        System.out.println("a2=" + a2);
        System.out.println("a3=" + a3);

    }
}

class Mathematics {

    int add (int a, int b)
    {
        return a+b;
    }

    int add (int a, int b, int c)
    {
        return a+b+c;
    }

    double add (double a, double b)
    {
        return a+b;
    }



}