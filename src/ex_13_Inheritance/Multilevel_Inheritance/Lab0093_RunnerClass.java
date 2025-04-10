package ex_13_Inheritance.Multilevel_Inheritance;

public class Lab0093_RunnerClass {

    public static void main(String[] args) {

        Son s1 = new Son();

        s1.son();
        s1.f();
        s1.gf();

        System.out.println("-------");
        Father f1 = new Father();
        f1.gf();
        f1.f();

        System.out.println("-------");

        Grandfather g1 = new Grandfather();
        g1.gf();


    }
}
