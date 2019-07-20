import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class encryption
{
    public static void main(String[]args) throws IOException
    {
        String ans = "a";
        Scanner kb = new Scanner(System.in);
        int r1, r2, r3;
        char ch;
        Random ran = new Random();
        r1 = ran.nextInt(10);
        r2 = ran.nextInt(10);
        r3 = ran.nextInt(10);

        do{
            System.out.println("Welcome to the Encryption/Decryption system.");
            System.out.println("Do you want to Encrypt(e), Decrypt(d), or Exit(x)?");
            ans = kb.next();

            System.out.println("Please enter the file you want to encode: ");
            String filename = kb.next();

            //encrypt
            if(ans.equalsIgnoreCase("e")){
                try{
                    FileInputStream fin = new FileInputStream(filename);
                    FileOutputStream fout = new FileOutputStream("saved.txt");
                    System.out.println("Here is the current text in the file: ");
                    while (fin.available() > 0){
                        char read = (char)fin.read();
                        System.out.print(read);//prints the original text
                    }
                    System.out.println();
                    fin = new FileInputStream(filename);
                    System.out.println("Here is the encoded text: ");
                    while (fin.available() > 0){
                        ch = (char) fin.read();
                        ch += r1;
                        fout.write(ch);
                        System.out.print(ch);

                        ch = (char) fin.read();
                        ch += r2;
                        fout.write(ch);
                        System.out.print(ch);

                        ch = (char) fin.read();
                        ch += r3;
                        fout.write(ch);
                        System.out.print(ch);
                    }
                    fout.write('\n');
                    fin.close();
                    fout.close();
                    FileInputStream fin2 = new FileInputStream("saved.txt");
                    FileOutputStream fout2 = new FileOutputStream(filename);
                    while (fin2.available() > 0){
                        fout2.write((char)fin2.read());//saves the encrypted file into the original file that the user input
                    }
                    System.out.println();
                    System.out.print("The encrypted key is: " + r1);
                    System.out.print(r2);
                    System.out.println(r3);
                }
                catch(IOException err){
                    System.out.println("error");
                    System.exit(0);
                }
            }
            //decrypt
            if (ans.equalsIgnoreCase("d")){
                try{
                    FileInputStream fin = new FileInputStream("saved.txt");
                    FileOutputStream fout = new FileOutputStream(filename);
                    System.out.println("Please enter the encryption key: ");
                    int e,e1, e2, e3;
                    e = kb.nextInt();
                    e1 = e/100;//get the first key
                    e2 = (e%100)/10;//second key
                    e3 = (e%100)%10;//third key
                    System.out.println("Here is the current text: ");
                    while (fin.available() > 0)
                        System.out.print((char)fin.read());// prints the encrypted text
                    fin = new FileInputStream("saved.txt");
                    System.out.println("Here is the decoded text: ");
                    while (fin.available() > 0){
                        ch = (char) fin.read();//get the encrypted text
                        ch -= e1;//minus the original key
                        fout.write(ch);//write in the decrypted text
                        System.out.print(ch); //prints the decrypted text

                        ch = (char) fin.read();//get the encrypted text
                        ch -= e2;//minus the original key
                        fout.write(ch);//write in the decrypted text
                        System.out.print(ch);//prints the decrypted text

                        ch = (char) fin.read();//get the encrypted text
                        ch -= e3;//minus the original key
                        fout.write(ch);//write in the decrypted text
                        System.out.print(ch);//prints the decrypted text
                    }
                }catch (IOException err){
                    System.out.println("error");
                    System.exit(0);
                }
            }
            if(ans.equalsIgnoreCase("x")){
                System.exit(0);
            }
        }while (true);

    }
}


