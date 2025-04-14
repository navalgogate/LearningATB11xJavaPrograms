package ex_14_Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Lab00100Real_ex {
    public static void main(String[] args) {

        CommonToAll c1 = new CommonToAll();
        c1.openBrowser();


        TestCase1 c2 = new TestCase1();
        c2.openBrowser();

        TestCase2 c3 = new TestCase2();
        c3.openBrowser();

        System.out.println("-----------------");

        //dynamic dispatch

        CommonToAll t1 = new TestCase1();
        t1.openBrowser();

        CommonToAll t2 = new TestCase2();
        t2.openBrowser();


        //TestCase2 t3 = new TestCase1();     no relation



    }

}

class CommonToAll{
    void openBrowser ()
    {
        System.out.println("IE will open");
    }
}

class TestCase1 extends CommonToAll{

    @Override
    void openBrowser()
    {
        System.out.println("Chrome will open");
    }
}

class TestCase2 extends CommonToAll{

    @Override
    void openBrowser()
    {
        System.out.println("Firefox will open");
    }
}

