//58 Do-While Loops Shorter Double Dice 40 Jocelyn Ho
import java.util.Random;
public class SDiceDoub
{
    public static void main (String[]args)
    {
        Random r = new Random();
        
        int d1, d2;
        
        System.out.println("HERE COMES THE DICE!");
        
        do{
            d1 = 1 + r.nextInt(6);
            System.out.println("Role #1: "+ d1);
            d2 = 1 + r.nextInt(6);
            System.out.println("Role #2: "+ d2);
            System.out.println("The total is "+ (d1+d2));
        }while (d1 != d2 || d2 != d1);
        System.exit(0);
    }
}

