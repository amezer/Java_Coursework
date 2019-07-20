//37 If Statements Gender Game 50 Jocelyn Ho
import java.util.Scanner;
public class GenderGame
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
    
        String fname, lname;
        char gen, mar;
        int age;
    
        System.out.print("What is your gender?(M or F)");
        gen = kb.next().charAt(0);
    
        System.out.print("First Name:");
        fname = kb.next();
    
        System.out.print("Last Name:");
        lname = kb.next();
    
        System.out.print("Age:");
        age = kb.nextInt();
    
        if (age >= 20){
            System.out.print("Are you married?(Y or N)");
            mar = kb.next().charAt(0);
        
            if ((mar == 'Y' || mar == 'y')&&(gen == 'M' || gen == 'm')){
                System.out.println("Then I should call you Mr. "+ lname+ ".");
                System.exit(0);
            }
            if ((mar == 'Y' || mar == 'y')&&(gen == 'F' || gen == 'f')){
                System.out.println("Then I should call you Mrs. "+ lname+ ".");
                System.exit(0);
            }
            if ((mar == 'N' || mar == 'n')&&(gen == 'M' || gen == 'm')){
                System.out.println("Then I should call you Ms. "+ lname+ ".");
                System.exit(0);
            }
            if ((mar == 'Y' || mar == 'y')&&(gen == 'F' || gen == 'f')){
                System.out.println("Then I should call you Miss "+ lname+ ".");
                System.exit(0);
            }
        }
        else{
            System.out.println("Then I should call you "+ fname+ " "+ lname+ ".");
            System.exit(0);
        }
    }
}
