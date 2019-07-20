import java.util.Scanner;

public class factorial
{
    public static int fac(int n)
    {
        if (n == 0)
            return 1;
        else
            return n*fac(n-1);
    }
    public static int ask(int n)
    {
        Scanner kb = new Scanner(System.in);
        if (n == 0){
            return 0;
        }
        else {
            System.out.println("Enter your number below or type in 0 to exit the program: ");
            int num = kb.nextInt();
            if (num == 0){
                return 0;
            }
            System.out.println("Factorial of " + num + " is " + fac(num));
            n = num;
            return ask(n);
        }
    }

    public static void main (String[]args)
    {
        System.out.println("Welcome to the Factorial Calculator");
        ask(1);
    }
}
