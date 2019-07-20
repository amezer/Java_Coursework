//16 Keyboard input Name, Age, and Salary 15 Jocelyn Ho
import java.util.Scanner;
public class NameAgeAndSalary
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        String name, age;
       
        int sal, catsal;
        catsal = (50);
       
        System.out.println("What is your name?");
        name = kb.next();
       
        System.out.println("Hello "+ name+ ", how old are you?");
        age = kb.next();
      
        System.out.println(age+"? That's older than my cat! Let's see if you earn more than my cat.");
        System.out.println("How much do you make?");
        sal = kb.nextInt();
        if (sal > catsal){
            System.out.println("$"+sal+"! Wow! You earn more than my cat!");
        }
        else{
            System.out.println("$"+sal+"? You loser.");
        }
    }
}
