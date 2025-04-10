package ex_13_Inheritance;

public class Lab0091_Inheritance {

    public static void main(String[] args) {
            father f1 = new father();
            f1.bhk_2();

        System.out.println("---------");

            son s1 = new son();
            s1.bhk_2();
            s1.bhk_3();
        System.out.println(s1.gold_f);
    }
}


class father {

        int gold_f = 1000;
        void bhk_2(){
            System.out.println("Father- 2BHK");
        }

}

class son extends father {

     void bhk_3() {
        System.out.println("Son- 3BHK");
    }

}


class brother extends father{

}