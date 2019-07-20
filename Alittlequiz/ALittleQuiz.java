// 27 If Statements A Little Quiz 40 Jocelyn Ho
import java.util.Scanner;
public class ALittleQuiz
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        int s, a1, a2, a3;
        
        s = 0;
        
        System.out.print("Are you ready for a pop quiz?");
        kb.next();
        System.out.println("No matter what, let's start the quiz!");
        
        System.out.println("Q1) Which is better?");
        System.out.println("1) Milk Chocolate");
        System.out.println("2) Dark Chocolate");
        System.out.println("3) White Chocolate");
        a1 = kb.nextInt();
        if (a1 == 1){
            System.out.println("Correct!");
            s++;
        }
        else{
            System.out.println("Incorrect!");
        }
        
        System.out.println("Q2) Which is better?");
        System.out.println("1) Drama");
        System.out.println("2) Movie");
        System.out.println("3) Animation");
        a2 = kb.nextInt();
        if (a2 == 3){
            System.out.println("Correct!");
            s++;
        }
        else{
            System.out.println("Incorrect!");
        }
        
        System.out.println("Q3) Which is better?");
        System.out.println("1) Cherry");
        System.out.println("2) Apple");
        System.out.println("3) Grape");
        a3 = kb.nextInt();
        if (a3 == 1){
            System.out.println("Correct!");
            s++;
        }
        else{
            System.out.println("Incorrect!");
        }
        
        System.out.println("Congratulation! You scored "+ s+ " out of 3! Which is "+ ((s/3)*100)+ "%.");
    }
}
