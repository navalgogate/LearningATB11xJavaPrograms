package ex_13_Inheritance.Hierarchical_Inheritance;

public class Lab0096_Heirarchical {


    public static void main(String[] args) {

        Father f1 = new Father();
        f1.home();

        Nathan N1 = new Nathan();
        N1.nath2();
        N1.home();


        Vishesh V1 = new Vishesh();
        V1.vish1();
        V1.home();



    }

}
     class Father {

        void home() {
            System.out.println("3bhk");
        }
    }


    class Naval extends Father {
        void nvl1() {
            System.out.println("Naval...");
        }
    }

    class Vishesh extends Father {
        void vish1() {
            System.out.println("Vishesh...");
        }
    }

     class Nathan extends Father {
        void nath2() {
            System.out.println("Nathan...");
        }
    }


