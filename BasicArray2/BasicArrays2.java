//140    Arrays    Basic Arrays 2    40  Jocelyn Ho

import java.util.Random;

public class BasicArrays2
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for (int i = 0; i < 10; i++){
            array[i] = ran.nextInt(100)+1;
        }
        
        for (int i = 0; i < array.length; i++){
            System.out.println("Slot " + i + " contains a " + array[i]);
        }
    }
}

