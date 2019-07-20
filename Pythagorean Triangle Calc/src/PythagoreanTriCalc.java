import java.util.Scanner;
import java.lang.Math;

public class PythagoreanTriCalc
{
    public static void main (String[]args)
    {
        double a, b, c;

        Scanner kb = new Scanner(System.in);
        System.out.println("Pythagorean Theorem Calculator");
        System.out.println("a^2 + b^2 = c^2");
        System.out.println("Solving for Hypotenuse (H) or Leg (L)? ");
        String ans, ans2;
        ans = kb.next();
        do{
            if (ans.equalsIgnoreCase("h")){
                System.out.println("Enter side A");
                a = kb.nextDouble();
                System.out.println("Enter side B");
                b = kb.nextDouble();
                System.out.println("Side C is: " + Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
            }
            if (ans.equalsIgnoreCase("l")){
                System.out.println("Enter side C");
                c = kb.nextDouble();
                System.out.println("Enter one leg");
                a = kb.nextDouble();

                System.out.println("The Leg is: " + Math.sqrt(Math.pow(c,2)-Math.pow(a,2)));
            }
            System.out.println("Solve another triangle? (y/n)");
            ans2 = kb.next();
            if (ans2.equalsIgnoreCase("n")){
                break;
            }
            System.out.println("Solving for Hypotenuse (H) or Leg (L)? ");
            ans = kb.next();
        }while(ans2.equalsIgnoreCase("y"));
        System.out.println("Thank you for using this program!");
    }
}
