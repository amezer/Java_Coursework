// 8 Basics and Printing Numbers and Math 7 Jocelyn Ho
//if one uses 57/3 then java will use "interger division" [which will not show the decimal place], but if one uses 57.0/3.0, then it will use "decimal point division" [which will show the decimal place]
public class NumbersAndMath
{
    public static void main (String[] args)
    {
        //states the question
        System.out.println("I will count how many bags of potato chips I own");
        //calculating the bags of Pringles by using floating point division
        System.out.println("Pringles "+ (57.0/3.0));
        //calculating the bags of Lays by using floating point division
        System.out.println("Lays "+ (35.0/7.0));
        //states the question
        System.out.println("Do I have more Pringles than Lays");
        //comparing the bags of potato chips and print out the result as true/false
        System.out.println((57.0/3.0) > (35.0/7.0));
    }
}
