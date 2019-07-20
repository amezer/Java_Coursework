//180	ArrayLists	Basic ArrayLists 3	25  Jocelyn Ho

import java.util.ArrayList;
import java.util.Random;

public class ArrayList3
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++){
            num.add(ran.nextInt(90) + 10);
        }

        System.out.println(num);
    }
}
