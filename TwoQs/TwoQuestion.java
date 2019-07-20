//32 If Statements Two Questions 35 Jocelyn Ho
import java.util.Scanner;
public class TwoQuestion
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        String q11, q12, q13, a1, q21, q22, a2;
        
        q11 = "animal";
        q12 = "vegetable";
        q13 = "mineral";
        q21 = "bigger";
        q22 = "smaller";
        
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object and I will try to guess it.");
        System.out.println("Q1) Is it animal, vegetable, or mineral?");
        a1 = kb.next();
        
        System.out.println("Q2) Is it bigger than a breadbox?");
        a2 = kb.next();
        
        if (a1.equals(q11))
        if (a2.equals(q21)){
            System.out.println("My guess is that you were thining of a lion.");
            System.exit(0);
        }
        if (a1.equals(q12))
        if (a2.equals(q21)){
                System.out.println("My guess is that you were thining of a watermelon.");
                System.exit(0);
        }
        if (a1.equals(q13))
        if (a2.equals(q21)){
                System.out.println("My guess is that you were thining of a Camaro.");
                System.exit(0);
        }
        if (a1.equals(q11))
        if (a2.equals(q22)){
                System.out.println("My guess is that you were thining of a squirrel.");
                System.exit(0);
        }
        if (a1.equals(q12))
        if (a2.equals(q22)){
                System.out.println("My guess is that you were thining of a carrot.");
                System.exit(0);
        }
        if (a1.equals(q13))
        if (a2.equals(q22)){
                System.out.println("My guess is that you were thining of a paper clip.");
                System.exit(0);
        }
    }
}
