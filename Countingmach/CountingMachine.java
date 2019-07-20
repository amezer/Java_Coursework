//66 For Loops Counting Machine 20 Jocelyn Ho
import java.util.Scanner;
public class CountingMachine
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
        int num;

        System.out.print("Count to:");
        num = kb.nextInt();

        for (int i = 0; i <= num; i++){
            System.out.print(i+ " ");
        }
        System.out.println(" ");
    }
}
