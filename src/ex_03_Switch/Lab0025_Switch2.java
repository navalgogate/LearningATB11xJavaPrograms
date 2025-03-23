package ex_03_Switch;

import java.util.Scanner;

public class Lab0025_Switch2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser)
        {
            case "chrome":
                System.out.println("Open Chrome");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "edge":
                System.out.println("Open edge");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            default:
                System.out.println("I have no idea");
            break;
        }


    }

}
