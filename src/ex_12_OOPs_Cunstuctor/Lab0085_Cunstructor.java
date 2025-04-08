package ex_12_OOPs_Cunstuctor;

public class Lab0085_Cunstructor {

    public static void main(String[] args) {

         Baby b1 = new Baby();
         new Baby();

         Baby b2;
    }
}


class Baby {

    String name;  //attribute


    void cry() {
        System.out.println("I am crying");
    }

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }

    Baby() {
        System.out.println("I am defalut cunstructor");
        //Fetch data from DB
        //Read files

    }

}