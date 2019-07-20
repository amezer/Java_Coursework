//181	ArrayLists	Copying ArrayLists	55  Jocelyn Ho

import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayList
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            num.add(ran.nextInt(100)+1);
        }

        for (int i = 0; i < 10; i++) num2.add(num.get(i));

        num.set(num.size()-1, 7);

        System.out.println(num);
        System.out.println(num2);

    }
}
