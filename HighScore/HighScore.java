// 129 File Input and Output High Score 50 Jocelyn Ho

import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore
{
    public static void main (String[]args) throws Exception
    {
        PrintWriter fileout = new PrintWriter("score.txt");
        Scanner kb = new Scanner(System.in);
        
        System.out.println("You got a high score!");
        System.out.println();
        System.out.println("Please enter your score: ");
        int score = kb.nextInt();
        System.out.print("Please enter your name: ");
        String name = kb.next();
        System.out.println("Data stored in a file called 'score.txt'.");
        
        fileout.println(name + " scores " + score + ".");
        fileout.close();
    }
}
