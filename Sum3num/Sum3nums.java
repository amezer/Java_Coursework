// 131 File Input and Output Summing Three Numbers from a File 50 Jocelyn Ho

import java.io.File;
import java.util.Scanner;

public class Sum3nums
{
    public static void main (String[]args) throws Exception
    {
        Scanner filein = new Scanner (new File ("3num.txt"));
        
        System.out.println("Reading numbers from file '3num.txt'... done.");
        
        int a, b, c;
        
        a = filein.nextInt();
        b = filein.nextInt();
        c = filein.nextInt();
        filein.close();
        
        System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
        
    }
}
