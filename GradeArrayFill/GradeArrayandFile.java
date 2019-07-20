//143    Arrays    Grades in an Array and a File    90 Jocelyn Ho

import java.io.FileOutputStream;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class GradeArrayandFile
{
    public static void main (String[]args) throws IOException
    {
        Random ran = new Random();
        Scanner kb = new Scanner(System.in);
        
        int[] array = {0,0,0,0,0};
        
        for (int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(100)+1;
        }
        
        System.out.print("First name and last name: ");
        String name = kb.nextLine();
        System.out.println();
        
        System.out.print("File name: ");
        String filename = kb.nextLine();
        FileOutputStream fout = new FileOutputStream(filename);
        
        System.out.println("Here are your randomly-selected grades (hope you pass):");
        System.out.println();
        
        for (int i = 0; i < array.length; i++){
            System.out.println("Grade " + (i+1) + ": " + array[i]);
        }
        
        String t = name + "\n";
        byte n[] = t.getBytes();
        fout.write(n);
        
        for (int i = 0; i < array.length; i++){
            String s = "Grade " + (i+1) + ": " + array[i] + "\n";
            byte b[]=s.getBytes();
            fout.write(b);
        }
        fout.close();
        
        System.out.println("Data saved in " + filename + " .");
    }
}
