//57 Do-While Loops Flip Again? 20 Jocelyn Ho
import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        
        String again;
        
        do{
            int flip = rng.nextInt(2);
            
            String coin;
            
            if ( flip == 1 )
                coin = "HEADS";
            else
                coin = "TAILS";
            
            System.out.println( "You flip a coin and it is... " + coin );
            
            System.out.print( "Would you like to flip again (y/n)? " );
            //Looking at "do" and "while" as a group, if there is no value for again, then the line again.equals("y"); will not be complete, which will not form the "while" part in the loop. Therefore, looking as a whole, if the "while" part contains an error, then the whole loop will not occur.
            again = keyboard.next();
        } while ( again.equals("y") );
    }
}
