package ex_05_While_Loop;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lab0044_Random_number {

    public static void main(String[] args) {

        Random random = new Random();
        int NumberToGuess = random.nextInt(10)+1;//if want 10 then use +1 else no need it will take till 9
        System.out.println(NumberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to guess: ");
        
        
        int guess;
        int attempts= 0;

        while (true)
        {
            guess= scanner.nextInt();
            attempts++;
        
            if (guess < NumberToGuess)
            {
                System.out.println("Too Low, try again!");
            }
            else if (guess > NumberToGuess)
            {
                System.out.println("Too high, try again");
            }
            else
            {
                System.out.println("Matched ! You have taken " + attempts + " attempts");
                break;
            }
            
        }
        
        


    }
}
