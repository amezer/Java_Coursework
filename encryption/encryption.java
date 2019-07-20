import java.util.Random;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class encryption
{
    public static void main(String[]args) throws IOException
    {
        try{
            FileInputStream fin = new FileInputStream("original.txt");
            Random ran = new Random();
            FileOutputStream fout = new FileOutputStream("encrypted.txt");
            int r1, r2, r3;
            char ch;
            r1 = ran.nextInt(4)+1;
            r2 = ran.nextInt(4)+1;
            r3 = ran.nextInt(4)+1;
            /*
            r1 = 1;
            r2 = 2;
            r3 = 3;
             */
            while (fin.available() > 0){
                ch = (char) fin.read();
                ch += r1;
                fout.write(ch);
                
                ch = (char) fin.read();
                ch += r2;
                fout.write(ch);
                
                ch = (char) fin.read();
                ch += r3;
                fout.write(ch);
            }
            fout.write('\n');
            fin.close();
            fout.close();
        }
        catch(IOException err){
            System.out.println("error");
            System.exit(0);
        }
        
    }
}


