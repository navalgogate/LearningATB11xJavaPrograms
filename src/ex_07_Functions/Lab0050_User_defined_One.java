package ex_07_Functions;

public class Lab0050_User_defined_One {
    public static void main(String[] args) {

        int a = sum_of_two_number(5,7);
        int b = sum_of_two_number(15,7);
        int c = sum_of_two_number(15,17);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

static int sum_of_two_number(int a, int b)
{
    return a+b;
}

}
