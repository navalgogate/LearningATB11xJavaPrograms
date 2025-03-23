package ex_07_Functions;

public class Lab0049_Simple_Method {

    public static void main(String[] args) {

        f1();

        int a = return_int();
        System.out.println(a);

        boolean b = return_boolean();
        System.out.println(b);

    }

    static void f1(){
        System.out.println("No Return");
    }

    static int return_int(){
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value() {
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

}
