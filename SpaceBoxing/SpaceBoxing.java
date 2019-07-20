//26 If Statements Space Boxing 30 Jocelyn Ho
import java.util.Scanner;
public class SpaceBoxing
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        int c;
        double w;
        
        System.out.println("Please enter your current weight on earth:");
        w = kb.nextDouble();
        
        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus  2. Mars   3. Jupiter");
        System.out.println("4. Saturn 5. Uranus 6. Neptune");
        System.out.println("Which planet would you like to visit?");
        c = kb.nextInt();
        
        if (c == 1){
            System.out.println("Your weight would be "+ (w*0.78)+ " on Venus.");
        }
        if (c == 2){
            System.out.println("Your weight would be "+ (w*0.39)+ " on Mars.");
        }
        if (c == 3){
            System.out.println("Your weight would be "+ (w*2.65)+ " on Jupiter.");
        }
        if (c == 4){
            System.out.println("Your weight would be "+ (w*1.17)+ " on Saturn.");
        }
        if (c == 5){
            System.out.println("Your weight would be "+ (w*1.05)+ " on Uranus.");
        }
        if (c == 6){
            System.out.println("Your weight would be "+ (w*1.23)+ " on Neptune.");
        }
    }
}
