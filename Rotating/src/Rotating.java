import java.util.Scanner;

public class Rotating
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int ans = kb.nextInt();
        int[][] array = new int[ans][ans];

        int k = 1, i, j;
        for (i = 0; i < ans; i++){
            for (j = 0; j < ans; j++){
                array[i][j] = k++;
            }
        }
        for (i = 0; i < ans; i++){
            for (j = 0; j < ans; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (j = 0; j < ans; j++){
            for (i = ans-1; i >= 0; i--){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }



    }
}
