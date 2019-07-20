//89 Graphics Sierpinski Triangle 150 Jocelyn Ho

import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class SierpinskiTriangle extends Canvas
{
    
    public static void main(String[]args)
    {
        JFrame win = new JFrame("Sierpinski Triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SierpinskiTriangle canvas = new SierpinskiTriangle();
        win.add(canvas);
        win.setVisible(true);
    }
    
    
    public void paint(Graphics g)
    {
        int x, y, x1, x2, x3, y1, y2, y3, dx, dy;
        
        x1 = 512;
        y1 = 109;
        x2 = 146;
        y2 = 654;
        x3 = 876;
        y3 = 654;
        x = 512;
        y = 382;
        dx = 0;
        dy = 0;
        
        g.setColor(Color.black);
        
        Random ran = new Random();
        
        for (int i = 0; i <= 50000; i++){
            g.drawLine(x, y, x, y);
            int num = ran.nextInt(3)+1;
            switch (num){
                case 1:
                    dx = x - x1;
                    dy = y - y1;
                    break;
                case 2:
                    dx = x - x2;
                    dy = y - y2;
                    break;
                case 3:
                    dx = x - x3;
                    dy = y - y3;
                    break;
            }
            x = x - dx/2;
            y = y - dy/2;
        }
    }
}
