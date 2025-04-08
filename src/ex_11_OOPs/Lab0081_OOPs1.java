package ex_11_OOPs;

public class Lab0081_OOPs1 {

    public static void main(String[] args) {

        //Person amit ;
        Person p2 = new Person();
        p2.name = "Lucky";
        System.out.println(p2.name);


        Person p3 = new Person();
        p3.name = "Naval";
        System.out.println(p3.name);

        new Person(); //Object

    }

}
            class Person {

            //Attribute //Properties // Data Members

                String name ;
                String phone;
                String Color_eyes;
                int legs;
                double salary;
                byte age;
                double weight;
                boolean isMale;


            //Behaviour //Function //Method

                void sleep()
                {
                    System.out.println("I am sleeping");
                }

                String greet (String name)
                {
                    return "Hello";
                }

                void talk()
                {
                    System.out.println("I am talking");
                }

                int tax_given (int salary, int tax)
                {
                    return salary-tax;
                }


            }


