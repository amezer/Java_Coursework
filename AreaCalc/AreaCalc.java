//104 Functions Area Calculator 110 Jocelyn Ho
import java.lang.Math;
import java.util.Scanner;
public class AreaCalc
{
    public static int area_square(int side)
    {
        return side*side;
    }
    
    public static int area_rectangle(int length, int width)
    {
        return length*width;
    }
    
    public static double area_triangle(int base, int height)
    {
        return (base*height)/2;
    }
    
    public static double area_circle(int radius)
    {
        return Math.PI*radius*radius;
    }
    
    public static int f_question(Scanner kb)
    {
        System.out.println("===========================");
        System.out.println("1) Square");
        System.out.println("2) Rectangle");
        System.out.println("3) Triangle");
        System.out.println("4) Circle");
        System.out.println("5) Quit");
        System.out.print("Which shape:");
        return kb.nextInt();
    }
    
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);

        while (true) {
            int type = f_question(kb);
            int length, width, base, height;
            
            switch (type) {
                case 1:
                    System.out.print("Side: ");
                    System.out.println("The area is: " + area_square(kb.nextInt()));
                    break;
                case 2:
                    System.out.println("Length: ");
                    length = kb.nextInt();
                    System.out.println("Width: ");
                    width = kb.nextInt();
                    System.out.println("The area is: " + area_rectangle(length, width));
                    break;
                case 3:
                    System.out.print("Base: ");
                    base = kb.nextInt();
                    System.out.print("Height: ");
                    height = kb.nextInt();
                    System.out.println("The area is: " + area_triangle(base, height));
                    break;
                case 4:
                    System.out.print("Radius: ");
                    System.out.println("The area is: " + area_circle(kb.nextInt()));
                    break;
                case 5:
                    System.out.println("Bye.");
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
