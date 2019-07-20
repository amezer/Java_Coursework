//77 Graphics Graphics Demo 1: Basics 20 Jocelyn Ho

//The size of the window that appears: 800 pixels wide and 600 pixels tall
//g.drawRect(set x, set y, set width, set height)
//g.fillOval(set x, set y, set width, set height)
//The two numbers in g.drawString sets the location (x,y) for the string
//The ones who's lines were at the back will be drawn on top of the other object (when overlap)
import java.awt.*;
import javax.swing.JFrame;

public class GraphicDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);  // draw a rectangle
        g.fillOval(200,20,400,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(700,500,40,200);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }
    
    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicDemo1 canvas = new GraphicDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}
