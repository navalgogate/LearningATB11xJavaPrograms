package ex_08_Strings;

public class Lab0063_StringBuffer {
    public static void main(String[] args) {
        StringBuffer SB = new StringBuffer("Naval");
        SB.append("Gogate");

        System.out.println(SB);
        System.out.println(SB.reverse() );
        //In STP only one latest string created instead of two for above

        //In STP there are three strings are created for below

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(s1);
    }
}
