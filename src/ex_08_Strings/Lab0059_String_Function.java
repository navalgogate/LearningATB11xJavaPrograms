package ex_08_Strings;

import java.sql.SQLOutput;

public class Lab0059_String_Function {
    public static void main(String[] args) {

        String name = "Sonal";

        System.out.println(name.length());

        System.out.println(name.charAt(3)); // start with 0 to count in case of charAt

        System.out.println(name.concat(" Patel"));

        System.out.println(name.contains("om"));

        System.out.println(name.equals("Sonal"));

        System.out.println(name.equalsIgnoreCase("sONal"));

        System.out.println(name.indexOf("o"));

        System.out.println(name.replace('n','N'));

        String s1 = "pramod@live.com@123";

        String [] split = s1.split("@");

        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println("NAVAL".toLowerCase());
        System.out.println("nAval".toUpperCase());


        System.out.println(name.startsWith("S"));
        System.out.println(name.startsWith("o"));

        System.out.println(name.endsWith("l"));
        System.out.println(name.startsWith("a"));


        String s2= "            Naval Gogate   ";
        System.out.println(s2.trim());

        System.out.println(name.compareTo("Sonal"));
        System.out.println(name.compareTo("SOnAl"));


    }

}
