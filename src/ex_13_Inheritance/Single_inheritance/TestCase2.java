package ex_13_Inheritance.Single_inheritance;

public class TestCase2 extends CommonToAll{

    void runningTC2() {
        StartBrowser();
        System.out.println("Running TC1");
        ReadExcel();
        ReadDB();
        CloseBrowser();
    }
}
