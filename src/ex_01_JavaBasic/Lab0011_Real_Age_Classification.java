package ex_01_JavaBasic;

import java.sql.SQLOutput;

public class Lab0011_Real_Age_Classification {

    public static void main(String[] args) {

        //age = 23 -> Adult (age > 18), Minor (age <18), Senior (age > 65)

        String age1 = args [0];
        System.out.println(age1);


        int  age = Integer.parseInt(age1);
        String result = (age < 18) ? "Minor"  :  (age > 65) ? "Senior" : "Adult";
        System.out.println(result);

    }
}
