package Tasks;

import java.util.Scanner;

public class Lab004AA_Scanner_Input {
    public static void main(String[] args) {
        System.out.println("Enter Name, Age & Salary");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Enter Salary: ");
        double Salary = scanner.nextDouble();

        scanner.close();

    }
}
