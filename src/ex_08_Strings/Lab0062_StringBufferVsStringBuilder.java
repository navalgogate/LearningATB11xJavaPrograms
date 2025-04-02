package ex_08_Strings;

public class Lab0062_StringBufferVsStringBuilder {

    public static void main(String[] args) {

        String s0 = "Naval";
        String s1 = new String ("Naval");

         StringBuilder Sbuilder = new StringBuilder("Naval");
         StringBuffer Sbuffer = new StringBuffer("Naval");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(Sbuilder);
        System.out.println(Sbuffer);

        // there are four strings created in STP (String Constant pool)

    }
}
