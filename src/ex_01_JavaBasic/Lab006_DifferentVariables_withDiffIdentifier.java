package ex_01_JavaBasic;

public class Lab006_DifferentVariables_withDiffIdentifier {
    public static void main(String[] args) {
        int a = 12;
        int _a = a +1;
        //int enum = 10;
        int Enum = 10;
        System.out.println(_a);
        System.out.println(Enum);


        boolean Tajmahal_in_Agra  = true;
        byte b = 127;
        System.out.println(Tajmahal_in_Agra);
        System.out.println(b);

        long $ = 8007123423l;
        System.out.println($+1);

        //output is
//        13
//        10
//        true
//        127
//        8007123424

    }
}
