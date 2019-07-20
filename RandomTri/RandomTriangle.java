//87    Graphics    Drawing Random Triangles    60 Jocelyn Ho

import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class RandomTriangle extends Canvas
{
    public void paint(Graphics g)
    {
        Random ran = new Random();
        
        int x1, x2, x3, y1, y2, y3, R, G, B;
        for (int i = 0; i <= 500; i++){
            try {
            x1 = ran.nextInt(1000)+1;
            x2 = ran.nextInt(1000)+1;
            x3 = ran.nextInt(1000)+1;
            y1 = ran.nextInt(770)+1;
            y2 = ran.nextInt(770)+1;
            y3 = ran.nextInt(770)+1;
            R = ran.nextInt(255)+1;
            G = ran.nextInt(255)+1;
            B = ran.nextInt(255)+1;
            
            Polygon tri = new Polygon();
            tri.addPoint(x1, y1);
            tri.addPoint(x2, y2);
            tri.addPoint(x3, y3);
            
            Color meow = new Color (R,G,B);
            g.setColor(meow);
            
            g.fillPolygon(tri);
            
            Thread.sleep(10);
            }
             catch (Exception err)
            {
                System.out.println(err);
            }
        }
    }
    
    public static void main (String[]args) throws InterruptedException
    {
        JFrame win = new JFrame("Random Triangle");
        win.setSize(1000,770);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomTriangle canvas = new RandomTriangle();
        win.add(canvas);
        win.setVisible(true);
    }
}
