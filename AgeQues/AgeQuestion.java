//34 If Statements Age Message 3 25 Jocelyn Ho
import java.util.Scanner;
public class AgeQuestion
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.print("Your name: ");
        name = kb.next();
        
        System.out.print("Your age: ");
        age = kb.nextInt();
        
        if (age < 16){
            System.out.println("You can't drive, "+ name+ ".");
            System.exit(0);
        }
        if (age == 16 || age == 17){
            System.out.println("You can drive but not vote, "+ name+ ".");
            System.exit(0);
        }
        if ((age >= 18)&&(age <= 24)){
            System.out.println("You can vote but not rent a car, "+ name+ ".");
            System.exit(0);
        }
        if (age >= 25){
            System.out.println("You can do pretty much anything, "+ name+ ".");
            System.exit(0);
        }
    }
}
