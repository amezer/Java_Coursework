//125 Nested Loops More Number Puzzles 100 Jocelyn Ho

import java.util.Scanner;
import java.lang.Math;
public class NumberPuzzles
{
    public static void f_1()
    {
        for (int numA = 10; numA <= 56; numA++){
            int digit1 = numA/10;
            int digit2 = numA%10;
            if (digit1 + digit2 > 10){
                System.out.println(numA);
            }
        }
    }
    
    public static void f_2()
    {
        for(int numB = 10; numB <= 99; numB++){
            int digit1 = numB/10;
            int digit2 = numB%10;
            int numC = (digit2*10) + digit1;
            if (Math.abs(numC-numB) == (digit1 + digit2)){
                System.out.println(numB + ", " + numC);
            }
        }
    }
    
    public static void main (String[]args)
    {
        int ans;
        Scanner kb = new Scanner(System.in);
        do{
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit");
            System.out.print("> ");
            ans = kb.nextInt();
            switch (ans){
                case 1:
                    System.out.println();
                    f_1();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    f_2();
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (ans != 3);
    }
}
