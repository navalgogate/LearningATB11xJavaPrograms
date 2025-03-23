package ex_07_Functions;

public class Lab0051_UD_Part1 {
    public static void main(String[] args) {

    //    1. Without parameter without return type
            f1();

    //    2. Without parameter with return type
            String a= return_without_p();
        System.out.println(a);

    //    3. With parameter without return type (90% use)
        with_para_without_return("Naval",25,120.222);
        with_para_without_return("Amol",26,100);
        with_para_without_return("Raj",27,12.222);
        with_para_without_return("Jay",28,10.2);

    //    4. With parameter with return type
        int x = sum(5,9,88);
        int y = sum(15,19,8);
        System.out.println(x);
        System.out.println(y);


    }


    static void f1(){
        System.out.println("Without Para without return type");
    }

    static String return_without_p(){
        System.out.println("HI");
        return "How are you";

    }

    static void with_para_without_return( String name, int age, double Salary)
    {
        System.out.println("Your name is " + name + "\n Age is " + age + "\nSalary is " + Salary);
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }


}
