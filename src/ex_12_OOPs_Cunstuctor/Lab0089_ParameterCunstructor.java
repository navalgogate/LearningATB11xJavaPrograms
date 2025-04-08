package ex_12_OOPs_Cunstuctor;

import javax.xml.namespace.QName;

public class Lab0089_ParameterCunstructor {

    public static void main(String[] args) {
        car10 a = new car10();
        car10 b = new car10();

        car10 c = new car10("i20",2025);
        System.out.println(c.name);


        car10 d = new car10("TATA",2000);
        System.out.println(d.year);

        car10 e = new car10("Honda",1992);
        System.out.println(e.name + "|" + e.year);

    }

}

class car10{
String name;
int year;

    car10() {//default C

    }


    car10(String name, int year){ //Parametorised cunstructor
        this.name= name;
        this.year= year;

    }

}
