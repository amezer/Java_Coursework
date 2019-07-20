// 120 Nested Loops Odometer Loops 25 Jocelyn Ho

// if the open and close braces were deleted, the code will still work because there is only one statement in each outer loop
import java.util.Scanner;

public class OdometerLoops
{
    public static void main( String[] args ) throws Exception
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Which base (2-10): ");
        int base = kb.nextInt();
        for ( int thous=0; thous<base; thous++ )
        {
            for ( int hund=0; hund<base; hund++ )
            {
                for ( int tens=0; tens<base; tens++ )
                {
                    for ( int ones=0; ones<base; ones++ )
                    {
                        System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
                        Thread.sleep(500);
                    }
                }
            }
        }
        
        System.out.println();
    }
}
