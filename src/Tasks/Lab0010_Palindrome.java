package Tasks;

import java.util.Scanner;

public class Lab0010_Palindrome {

    public static void main(String[] args) {


        System.out.println("Enter a input, I will check Palindrome");
        Scanner sc = new Scanner(System.in);
        String UserInput = sc.next();

        String newString = reverseString(UserInput);
        if (newString.equalsIgnoreCase(UserInput))
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }

    }

    private static String reverseString(String UserInput) {
        String reversed = "";
       
        for (int i = UserInput.length() - 1; i >= 0; i--)
        {
            reversed = reversed + UserInput.charAt(i);


        }
        return reversed;
    }
}
