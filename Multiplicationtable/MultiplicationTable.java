// 122 Nested Loops Multiplication Table 65 Jocelyn Ho

import java.util.Scanner;
public class MultiplicationTable
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Gimme a number (2-15): ");
        int inputnum = kb.nextInt();
        System.out.println();
        System.out.print(" x |");
        for (int numC = 1; numC <= inputnum; numC++)
        {
            System.out.print("\t");
            System.out.print(numC);
        }
        System.out.println();
        System.out.println();
        System.out.print("===+");
        for (int numC = 1; numC <= inputnum; numC++)
            System.out.print("========");
        System.out.println();
        System.out.println();
        for (int numA = 1; numA <= inputnum; numA++)
        {
            System.out.printf("%02d |", numA);
            for (int numB = 1; numB <= inputnum; numB++)
            {
                System.out.print("\t");
                System.out.print(numB*numA);
            }
            System.out.println();
            System.out.println();
        }
        
        
    }
}
