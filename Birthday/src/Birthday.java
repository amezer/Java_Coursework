
import java.util.Scanner;

public class Birthday
{
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);

        int year , month, date = 0;


        do{
            System.out.println("Enter the year: ");
            year = kb.nextInt();
        }while((year < 1919)||(year > 2019)||(year == 2019));

        do{
            System.out.println("Enter the month: ");
            month = kb.nextInt();
        }while(month > 12);

        if ((month ==2) ||(month ==4) ||(month ==6) ||(month ==9) ||(month ==11)){
            do{
                System.out.println("Enter the date: ");
                date = kb.nextInt();
            }while(date > 30);
        }


        if ((month ==1) ||(month ==3) ||(month ==5) ||(month ==7) ||(month ==8)||(month ==10)||(month ==12)){
            do{
                System.out.println("Enter the date: ");
                date = kb.nextInt();
            }while(date > 31);
        }


        if ((month < 10)&&(date < 10)){
            System.out.println("Your Birthday is " + year + "/0" + month + "/0" + date);
        }else if ((month < 10)&&(date > 10)){
            System.out.println("Your Birthday is " + year + "/0" + month + "/" + date);
        }else if ((month > 10)&&(date < 10)){
            System.out.println("Your Birthday is " + year + "/" + month + "/0" + date);
        }else{
            System.out.println("Your Birthday is " + year + "/" + month + "/" + date);
        }


    }
}
