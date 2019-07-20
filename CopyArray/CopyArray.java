//142    Arrays    Copying Arrays    55 points

import java.util.Arrays;
import java.util.Random;

public class CopyArray
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        
        int[] array = {};
        
        array = Arrays.copyOf(array, array.length + 10);
        
        for (int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(100)+1;
        }
        
        int[] array2 = Arrays.copyOf(array, array.length);
        array[9] = -7;
        
        System.out.print("Array 1: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        
        System.out.print("Array 2: ");
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + "\t");
        }
        System.out.println();
    }
}
