// 128 File Input and Output Letter Revisited 40 Jocelyn Ho
import java.io.PrintWriter;
public class LetterRevisited
{
    public static void main(String[] args) throws Exception
    {
        PrintWriter fileout = new PrintWriter("letter.txt");
        
        fileout.println("+------------------------+");
        fileout.println("|                    ####|");
        fileout.println("|                    ####|");
        fileout.println("|                    ####|");
        fileout.println("|                        |");
        fileout.println("|                        |");
        fileout.println("|       Jocelyn Ho       |");
        fileout.println("|       MeowMeow Way     |");
        fileout.println("|       Bluemond, ES 123 |");
        fileout.println("|                        |");
        fileout.println("+------------------------+");
        
        fileout.close();
    }
}
