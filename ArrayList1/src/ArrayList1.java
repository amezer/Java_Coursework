//178	ArrayLists	Basic ArrayLists 1	30  Jocelyn Ho

import java.util.ArrayList;

public class ArrayList1
{
    public static void main (String[]args)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();

        while (num.size() < 10){
            num.add(113);
            System.out.println("Slot " + (num.size()-1) + "contains a -" + num.get(num.size()-1));
        }
    }
}
