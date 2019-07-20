import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Stuff
{
    public static void main(String[]args)
    {
        double n = 111;
        ArrayList <Double> num = new ArrayList<Double>();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        while (n!=0){
            n = kb.nextInt();
            if (n == 0)
                break;
            num.add(n);
        }

        //sort
        Collections.sort(num);
        System.out.println(num);
        //sort_end

        //mean
        double sum = 0;
        for(int i = 0; i < num.size(); i++){
            sum += num.get(i);
        }
         System.out.println ("Mean: " + sum/num.size());
        //mean_end

        //sum
        System.out.println("Sum: " + sum);
        //sum_end

        //median
        if (num.size()%2 == 1){
            System.out.println("Median: " + num.get((num.size()/2)));
        }else{
            double num1 = num.get((((num.size()/2)+1))-1);
            double num2 = num.get(((num.size()/2))-1);
            double med = ((num1 + num2)/2);
            System.out.println("Median: " + med);
        }
        //median_end

        /*
        int m = 0;
        ArrayList<Integer> mode = new ArrayList<Integer>();
        for (int i = 0; i < num.size(); i++){
            for (int j = i+1; j < num.size(); j++){
                if(num.get(i).equals(num.get(j))){
                    m++;
                    mode.add(m);
                }
            }
        }
        Collections.sort(mode);
        System.out.println(mode);
        System.out.print("Mode: ");
        for (int i = 0; i < num.size(); i++){
            if (mode.get(i).equals(mode.get(mode.size()-1))){
                System.out.print(num.get(i));
            }
        }
        System.out.println();*/

        //count
        System.out.println("Count: " + num.size());
        //count_end

        //max & min
        System.out.println("Min: " + num.get(0));
        System.out.println("Max: " + num.get(num.size()-1));
        //max & min _ end

        //range
        System.out.println("Range: " + (num.get(num.size()-1)-num.get(0)));
        //range_end

        //variance
        double sumv = 0;
        for (int i = 0; i < num.size(); i++){
            System.out.print(num.get(i) + " ");
            System.out.println(Math.pow(num.get(i)-sum/num.size(), 2));
            sumv += Math.pow((num.get(i)-sum/num.size()), 2);
        }
        System.out.println("Variance: " + sumv/num.size());
        //variance_end

        //standard deviation
        System.out.println("Standard Deviation: " + Math.sqrt(sumv/num.size()));
        //standard deviation_end
    }
}
