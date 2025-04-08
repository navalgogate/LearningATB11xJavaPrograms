package ex_12_OOPs_Cunstuctor;

public class Lab0090_ParaC {
    public static void main(String[] args) {

        Person p1 = new Person("Naval",30,"ABC");
        System.out.println(p1.name);

        Person p2 = new Person("Nathan",3,"XYZ");
        System.out.println(p1.age);

        Person p3 = new Person("nath",6);
        System.out.println(p3.adress);

        Person p4 = new Person();

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();

    }
}

class Person {

    String name;
    int age;
    String adress;

    Person(){}

    Person(String name, int age, String adress){
        this.name= name;
        this.age= age;
        this.adress = adress;

    }

    Person(String name, int age){//cunstuctor overloading
        this.name= name;
        this.age= age;

    }

    void eat()
    {
        System.out.println(this.name  + " is eating");
    }
}
