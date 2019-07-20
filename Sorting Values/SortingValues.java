//159    Sorting    Sorting an Array  - code provided    100 Jocelyn Ho

public class SortingValues
{
    public static void main( String[] args )
    {
        int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
        
        // Display the original (unsorted values)
        System.out.print("before: ");
        for ( int i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
        
        
        int swap = 0;
        // Swap the values around to put them ascending order.
        for (int i = 0; i < arr.length; i++){
            System.out.print(i + "th : ");
            for (int k = 0; k < arr.length; k++)
                System.out.print( arr[k] + " " );
            System.out.println();
            
            for (int j = 0; j < i-1; j++){
                if (arr[j] > arr[i]){
                    System.out.print("\tSwap " + arr[j] + " and " + arr[i]);
                    System.out.println();
                    swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }

        }
        // Display the values again, now (hopefully) sorted.
        System.out.print("after : ");
        for ( int i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
}
