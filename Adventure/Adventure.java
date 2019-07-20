//33 If Statements Choose Your Own Short Adventure 60 Jocelyn Ho
import java.util.Scanner;
public class Adventure
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
    
        String a11, a12, c1, a21, a22, c2, a31, a32, c3, d31, d32, d3, b21, b22, b2, b31, b32, b3, d21, d22, d2;
    
        a11 = "on land";
        a12 = "into the water";
        a21 = "jungle";
        a22 = "cave";
        a31 = "water/food";
        a32 = "shelter";
        d31 = "write SOS";
        d32 = "create smoke";
        b21 = "diving mask";
        b22 = "boat";
        b31 = "fight";
        b32 = "escape";
        d21 = "stay on the boat";
        d22 = "jump and swim";
        
        System.out.println("You are on a desert island. Would you like to stay at 'on land' or go 'into the water' and explore?");
        c1 = kb.nextLine();
        if (c1.equals(a11)){
            System.out.println("There is a 'jungle' and a 'cave' behind you. Where would you like to go?");
            c2 = kb.nextLine();
            if (!(c2 == a21)){
                System.out.println("You realized that you need 'water/food' and 'shelter' to pass the night. Which one will you choose to look for first?");
                c3 = kb.nextLine();
                if (!(c3 == a31)){
                    System.out.println("You did not survive through the first night as your body lost temperature during the cold night.");
                    System.exit(0);
                }
                if (!(c3 == a32)){
                    System.out.println("Congratulation! You died because the wild animals surrounded and attacked your shelter.");
                    System.exit(0);
                }
            }
            if (!(c2 == a22)){
                System.out.println("You decided to wait for the others to rescue you from the desert island. Which plan would you choose? 'write SOS' or 'create smoke'?");
                d3 = kb.nextLine();
                if (!(d3 == d31)){
                    System.out.println("You died on the island because no one saw the SOS.");
                    System.exit(0);
                }
                if (!(d3 == d32)){
                    System.out.println("You died on the island because the smoke attracted the wild animals, and the animals ate you up.");
                    System.exit(0);
                }
            }
        }
        if (c1.equals(a12)){
            System.out.println("Before going into the water, you found a 'diving mask' and a 'boat'. Which one will you use?");
            b2 = kb.nextLine();
            if (!(b2 == b21)){
                System.out.println("You dived into the water. However, you encountered a hungry shark. You found a dagger in between the carols. Would you choose to 'fight' with the shark or 'escape'?");
                b3 = kb.nextLine();
                if (!(b3 == b31)){
                    System.out.println("Congratulation! You died because the shark's skin is harder than the rotten dagger.");
                    System.exit(0);
                }
                if (!(b3 == b32)){
                    System.out.println("Congratulation! You died because the shark swim faster than you.");
                    System.exit(0);
                }
            }
            if (!(b2 == b22)){
                System.out.println("You grabbed the wooden paddle beside you. You went on your journey. However, the paddle broke into two when you are in the middle. Which option will you choose? 'stay on the boat' or 'jump and swim'?");
                d2 = kb.nextLine();
                if (!(d2 == d21)){
                    System.out.println("Congratulation! You died because there was a crack on the bottom of the boat.");
                    System.exit(0);
                }
                if (!(d2 == d22)){
                    System.out.println("Congratulation! You died because you had a cramp after you jumped into the water.");
                    System.exit(0);
                }
            }
        }
    }
}
