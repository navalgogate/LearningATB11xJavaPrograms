package ex_12_OOPs_Cunstuctor;

public class Lab0088_DC {

    public static void main(String[] args) {

        carr c1 = new carr();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
    }
}

class carr {

    String name;
    int year;
    String model;

}