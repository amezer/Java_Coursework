//182	ArrayLists	Finding a Value in an ArrayList	80  Jocelyn Ho
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindValueinArrayList
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            num.add(ran.nextInt(50)+1);
        }

        System.out.println(num);
        System.out.print("Value to find: ");
        int ans = kb.nextInt();

        for (int i = 0; i < 10; i++){
            if (ans == num.get(i)){
                System.out.println(ans + " is in the ArrayList.");
            }
            else{
                System.out.println("Value not found.");
                break;
            }
        }
    }
}
