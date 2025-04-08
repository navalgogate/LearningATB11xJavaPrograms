package ex_11_OOPs;

public class Lab0082_JavaClassObject {
    public static void main(String[] args) {

        Student p2 = new Student();
        p2.name = "Lucky";

        Person p3 = new Person();
        p3.name = "Naval";
        System.out.println(p3.name);


    }

}



class Student {
    String name;
    int roll;

    void sleep (){}
}