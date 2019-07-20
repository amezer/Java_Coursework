//31 CUIs A Frame With A Panel With Writing On It 20 Jocelyn Ho
//a type of Graphical User Interface [GUI]
import javax.swing.*;
//a type of API to develope GUI
import java.awt.*;

public class AFrameWithAPanelWithWritingOnIt
{
    public static void main (String[]args)
    {
        //set f as the object for Frame631
        Frame631 f = new Frame631();
        //exit the application when JFrame is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
//"inherit" the functions from JFrame and built up a class called "Frame631"
class Frame631 extends JFrame
{
    public Frame631()
    {
        //classify the detail for Frame631 "f"
        setTitle("613 rocks!");
        setSize(300, 200);
        setLocation(100, 200);
        
        //set panel as the object of Panel613
        Panel613 panel = new Panel613();
        //set the content of the panel
        Container cp = getContentPane();
        cp.add(panel);
    }
}
//"inherit" the functions from JPanel and built up a class called "Panel613"
class Panel613 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        //to use the paintComponent(g) function from JPanel
        super.paintComponent(g);
        //set the message and the location of the message
        g.drawString("Hi", 75, 100);
    }
}
