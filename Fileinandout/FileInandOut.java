/***********************basic file output **************************/
import java.io.PrintWriter;

public class ReceiptRevisited {
    public static void main( String[] args ) throws Exception {
        PrintWriter fileout = new PrintWriter("receipt.txt");
        
        fileout.println( "+------------------------+" );
        fileout.println( "|                        |" );
        fileout.println( "|      CORNER STORE      |" );
        fileout.println( "|                        |" );
        fileout.println( "|    014-06-25 04:38PM   |" );
        fileout.println( "|                        |" );
        fileout.println( "|     Gallons: 12.464    |" );
        fileout.println( "|  Price/gallon: $ 3.459 |" );
        fileout.println( "|                        |" );
        fileout.println( "|   Fuel total: $ 43.11  |" );
        fileout.println( "|                        |" );
        fileout.println( "+------------------------+" );
        fileout.close();
    }
}

/****************************Check Exception*********************************/

import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptRevisitedException {
    public static void main( String[] args ) {
        PrintWriter fileout;
        
        try {
            fileout = new PrintWriter("receipt.txt");
        }
        catch ( IOException err ) {
            System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
            System.out.println("Maybe the file exists and is read-only?");
            fileout = null;
            System.exit(1);
        }
        
        fileout.println( "+------------------------+" );
        fileout.println( "|                        |" );
        fileout.println( "|      CORNER STORE      |" );
        fileout.println( "|                        |" );
        fileout.println( "|    014-06-25 04:38PM   |" );
        fileout.println( "|                        |" );
        fileout.println( "|     Gallons: 12.464    |" );
        fileout.println( "|  Price/gallon: $ 3.459 |" );
        fileout.println( "|                        |" );
        fileout.println( "|   Fuel total: $ 43.11  |" );
        fileout.println( "|                        |" );
        fileout.println( "+------------------------+" );
        fileout.close();
    }
}


/***************************OPEN and EDIT files********************************
 Create a textfile called name-and-numbers.txt
 in it put your name and 3 numbers like so:
 Johnson Ting
 3 4
 10
 *****************************************************************************/


import java.io.File;
import java.util.Scanner;

public class GettingFromFile {
    public static void main( String[] args ) throws Exception {
        String name;
        int a, b, c, sum;
        
        System.out.print("Getting name and three numbers from file...");
        Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));//look for and open name-and-numbers.txt
        name = fileIn.nextLine();
        a = fileIn.nextInt();
        b = fileIn.nextInt();
        c = fileIn.nextInt();
        fileIn.close();
        
        System.out.println("done.");
        System.out.println("Your name is " + name);
        sum = a + b + c;
        System.out.println( a + "+" + b + "+" + c + " = " + sum );
    }
}


/************************READING FILES *******************************
 Create  textfile called some-words.txt
 put go copy a short article online and put it in the text file.
 
 *********************************************************************/

import java.io.File;
import java.util.Scanner;

public class GettingWholeFile {
    public static void main( String[] args ) throws Exception {
        int fourLetter = 0;
        int caps = 0;
        String fn1 = "some-words.txt";
        String fn2 = "GettingWholeFile.java";
        
        Scanner wordReadr = new Scanner(new File(fn1));
        
        while ( wordReadr.hasNext() ) {
            String w = wordReadr.next();
            if ( w.length() == 4 ) {
                fourLetter++;
            }
        }
        wordReadr.close();
        
        Scanner selfInput = new Scanner(new File(fn2));
        while ( selfInput.hasNext() ) {
            String token = selfInput.next();
            if ( Character.isUpperCase( token.charAt(0) ) ) {
                caps++;
            }
        }
        selfInput.close();
        
        System.out.println( fourLetter + " four-letter words in " + fn1 );
        System.out.println( caps + " words start with capitals in " + fn2 );
    }
}
