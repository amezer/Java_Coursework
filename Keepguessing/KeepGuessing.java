//49 While Loops Keep Guessing 50 Jocelyn Ho
import java.util.Random;
import java.util.Scanner;
public class KeepGuessing
{
    public static void main (String[]args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        
        int a, ran;
        
        System.out.println("I have choosen a number between 1 to 10. Try to guess it.");
        ran = 1 + r.nextInt(10);
        System.out.print("Your guess: ");
        a = kb.nextInt();
        
        while (a != ran){
            System.out.println("Incorrect. Try again.");
            System.out.print("Your guess: ");
            a = kb.nextInt();
        }
        System.out.println("Correct!");
    }
}
