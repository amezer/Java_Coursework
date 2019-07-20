//29 GUIs Using Swing For Input 25 Jocelyn Ho
//a type of Graphical User Interface [GUI]
import javax.swing.*;

public class UsingSwingForInput
{
    public static void main(String[]args)
    {
        // provokes an option panel and sets the input for the following dialog as "name" [string]
        String name = JOptionPane.showInputDialog("What is your name?");
        //provokes an optional panel and sets the input for the following dialog as "input" [string]
        String input = JOptionPane.showInputDialog("How old are you?");
        //converts the viariable [in string] into an integer object "age"
        int age = Integer.parseInt(input);
        
        //prints out the message "Hellow, name."
        System.out.print("Hello, "+ name+ ".");
        //can now add 1 to "age" as its under [integer]
        System.out.println(" Next year, you'll be "+ (age+1));
        
        //exits the Swing application
        System.exit(0);
    }
}
