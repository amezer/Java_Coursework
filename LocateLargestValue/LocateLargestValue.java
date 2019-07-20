//149    Arrays    Locating the Largest Value in an Array    110 Jocelyn Ho

import java.util.Random;

public class LocateLargestValue
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        
        int[] array = {0,0,0,0,0,0,0,0,0,0};
        
        for (int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(100)+1;
        }
        
        System.out.print("Array: ");
        
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "   ");
        }
        
        int max = array[0];
        int maxidx = 0;
        
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                maxidx = i;
            }
        }
        
        System.out.println();
        
        System.out.println("The largest value is " + max);
        System.out.println("It is in slot " + maxidx);
    }
}

