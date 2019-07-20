//46 Random Numbers One Shot Hi-Lo 35 Jocelyn Ho
import java.util.Random;
import java.util.Scanner;
public class OneShot
{
    public static void main (String[]args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        
        int a1, d1;
        
        System.out.println("I'm thinking of a number between 1-100. Try to guess it!");
        System.out.print(">");
        a1 = kb.nextInt();
        d1 = 1 + r.nextInt(100);
        
        if (a1 > d1){
            System.out.println("Sorry you were too high. I was thinking of "+ d1+ ".");
            System.exit(0);
        }
        if (a1 < d1){
            System.out.println("Sorry you were too low. I was thinking of "+ d1+ ".");
            System.exit(0);
        }
        if (a1 == d1){
            System.out.println("Congratulation! You guessed it!");
            System.exit(0);
        }
    }
}
