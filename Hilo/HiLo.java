//54 While Loop Hi-Lo with limited tries 55 Jocelyn Ho
import java.util.Random;
import java.util.Scanner;
public class HiLo
{
    public static void main (String[]args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        int a1, d1, g;

        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("First guess: ");
        a1 = kb.nextInt();
        d1 = 1 + r.nextInt(100);
        g = 1;

        while ((a1 != d1)&&(g <= 6)){
            if (a1 > d1){
                System.out.println("Sorry you were too high.");
                g++;
                System.out.println("Guess#"+ g+ ": ");
                a1 = kb.nextInt();
            }
            if (a1 < d1){
                System.out.println("Sorry you were too low.");
                g++;
                System.out.println("Guess#"+ g+ ": ");
                a1 = kb.nextInt();
            }
            if (a1 == d1){
                System.out.println("Congratulation! You guessed it!");
                System.exit(0);
            }
        }
    System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
    }
}

