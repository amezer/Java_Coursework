// 19 Keyboard Input A Dumb Calculator 20 Jocelyn Ho
import java.util.Scanner;
public class DumbCalc
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double n1, n2, n3;
        
        System.out.println("What is your first number?");
        n1 = kb.nextDouble();
        
        System.out.println("What is your second number?");
        n2 = kb.nextDouble();
        
        System.out.println("What is your third number?");
        n3 = kb.nextDouble();
        
        System.out.println("("+ n1+ " +"+ n2+ " +"+ n3+ ") is... "+(n1+n2+n3)/2);
    }
}
