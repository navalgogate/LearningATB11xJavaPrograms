package ex_12_OOPs_Cunstuctor;

public class Lab0088_DC2 {

    public static void main(String[] args) {

        car c1 = new car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("----------");

        car c2 = new car();
        c2.name = "Tesla";
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
    }
}

class car {

    String name;
    int year;
    String model;


    car(){
        name = "Unknown Car";
        year = 1992;
        model = "XXX";

    }
}