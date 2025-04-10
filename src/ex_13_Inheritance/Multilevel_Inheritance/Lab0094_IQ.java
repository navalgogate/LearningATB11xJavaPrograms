package ex_13_Inheritance.Multilevel_Inheritance;


public class Lab0094_IQ {

    public static void main(String[] args) {

//        Son s1 = new Grandfather();
//        Son s2 = new Father();
        Son s3 = new Son();

//        Father f1 = new Grandfather();
        Father f2 = new Father();
        Father f3 = new Son();

        Grandfather g1 = new Son();  //this is called Dynamic Dispatch . Here we can call only same function created , here its home
        Grandfather g2 = new Father();
        Grandfather g3 = new Grandfather();

        g1.gf();
        g1.home();
        g2.home();
        g3.home();

        System.out.println("-----");


        f2.f();
        f3.home();



    }


}
