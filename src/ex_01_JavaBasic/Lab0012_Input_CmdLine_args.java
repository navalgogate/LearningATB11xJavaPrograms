package ex_01_JavaBasic;

public class Lab0012_Input_CmdLine_args {
    public static void main(String[] args) {

        String age_String = args [0];
        String a1 = args [1];
        String a2 = args [2];
        String a3 = args [3];

//        int age =  Integer.parseInt(age_String);
//        int a1 =  Integer.parseInt(a1);
//        int a2 =  Integer.parseInt(a2);
//        int a3 =  Integer.parseInt(a3);

        System.out.println(age_String);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
