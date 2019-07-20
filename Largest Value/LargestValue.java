//148    Arrays    Finding the Largest Value in an Array    100  Jocelyn Ho

import java.util.Random;

public class LargestValue
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
        
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        
        System.out.println();
        
        System.out.println("The largest value is " + max);
    }
}
