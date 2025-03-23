package ex_03_Switch;

public class Lab0027_Switch4 {

    public static void main(String[] args) {
                //used in JDK>13 [without breck]
        int a=001;

        switch (a){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");

        }
    }
}
