package ex_14_Polymorphism;

public class Lab0098_PolyMOverLoading {
    public static void main(String[] args) {

        Home h1 = new Home();

        h1.task(3);
        h1.task(3,7);
        h1.task(3,7,1);



    }
}

class Home {


    void task (int a)
    {
        System.out.println(a);
    }

    void task (int a, int b)
    {
        System.out.println(a+b);
    }

    void task (int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
}
