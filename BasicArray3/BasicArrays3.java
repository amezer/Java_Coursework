//141    Arrays    Basic Arrays 3    25 Jocelyn Ho

import java.util.Arrays;
import java.util.Random;

public class BasicArrays3
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        
        int[] array = {};
        
        array = Arrays.copyOf(array, array.length + 1000);
        
        for (int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(90)+10;
        }
        
        for(int i = 0; i < array.length; i++){
            if (i%20 == 0){
                System.out.println();
            }
            System.out.print(array[i]);
            System.out.print("  ");
        }
    }
}
