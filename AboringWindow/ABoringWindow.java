//30 GUIs A Boring Window 10 Jocelyn Ho
//a type of Graphical User Interface [GUI]
import javax.swing.*;

//calls out the JFrame function
public class ABoringWindow extends JFrame
{
    public static void main(String[]args)
    {
        // create f as the object of ABoringWindow
        JFrame f = new ABoringWindow();
        // set the default close operation as JFrame.EXIT_OO_CLOSE, which calls System.exit()[exit the application] when the JFrame is closed.
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the size for the dialog box as 300 and 200
        f.setSize(300, 200);
        // make the components added visible
        f.setVisible(true);
    }
}
