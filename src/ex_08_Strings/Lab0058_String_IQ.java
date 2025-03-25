package ex_08_Strings;

public class Lab0058_String_IQ {
    public static void main(String[] args) {

        String s1 = "Hello"; // SCP String constant pool
        String s2 = "Hello";
        String s3 = "Hello";


        String s4 = new String("Hello");  //OA object ARea
        String s5 = new String("Hello");
        String s6 = new String("hello");
//How many Hello will be SCP for 'S1 to S3' & 's4 to s6'

        System.out.println(s1 == s4);
        System.out.println(s1 == s3);
        System.out.println(s4 == s5);
        System.out.println(s3 == s6);

        //validatae content

        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equalsIgnoreCase(s6));

    }



}
