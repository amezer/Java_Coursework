//179	ArrayLists	Basic ArrayLists 2	40 Jocelyn Ho

import java.util.ArrayList;
import java.util.Random;

public class ArrayList2
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            num.add(ran.nextInt(100)+1);
        }

        System.out.println("ArrayList: " + num);
    }
}
