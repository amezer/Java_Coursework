//59 Do-While Loops Again with the Number-Guessing 35 Jocelyn Ho
import java.util.Random;
import java.util.Scanner;
public class NumberGuess
{
    public static void main (String[]args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        
        int g, ran, a1;
        
        System.out.println("I have choosen a number between 1 to 10. Try to guess it.");
        ran = 1 + r.nextInt(10);
        g = 1;
        
        do{
            System.out.print("Your Guess:");
            a1 = kb.nextInt();
            if (a1 == ran){
                System.out.println("Congratulation! You guessed it in "+ g+ " tries.");
                System.exit(0);
            }
            System.out.println("Incorrect. Try again.");
            g++;
        }while (a1 != ran);
        System.out.println("Congratulation! You guessed it in "+ g+ " tries.");
    }
}
