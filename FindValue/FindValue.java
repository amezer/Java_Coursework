//144    Arrays    Finding a Value in an Array    80 Jocelyn Ho

import java.util.Random;
import java.util.Scanner;

public class FindValue
{
    public static void main (String[]args)
    {
        Random ran = new Random();
        Scanner kb = new Scanner(System.in);
        
        int[] array = {0,0,0,0,0,0,0,0,0,0};
        
        for (int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(50)+1;
        }
        
        System.out.print("Array: ");
        
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "   ");
        }
        
        System.out.println();
        System.out.print("Value to find: ");
        int value = kb.nextInt();
        System.out.println();
        
        for (int i = 0; i < array.length; i++){
            if (value == array[i]){
                System.out.println(value + " is in the array.");
            }
        }
        
    }
}
