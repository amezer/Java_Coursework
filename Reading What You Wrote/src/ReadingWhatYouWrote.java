//172	Records	Reading What You Wrote	160 Jocelyn Ho

import java.io.*;
import java.util.Scanner;

public class ReadingWhatYouWrote
{
    public static  void main (String[]args) throws Exception
    {

        BufferedReader fin;

        try {
            Car[] arrCars = new Car[5];
            Scanner kb = new Scanner(System.in);
            System.out.print("From which file do you want to load this information? ");
            String filename = kb.nextLine();

            fin = new BufferedReader(new FileReader(filename));

            for (int i=0; i < 5; i++) {
                arrCars[i] = new Car();
                arrCars[i].strModel = fin.readLine();
                arrCars[i].strMake = fin.readLine();
                arrCars[i].intYear = Integer.parseInt(fin.readLine());
                arrCars[i].strLicense = fin.readLine();
                fin.readLine();

                System.out.println("Car " + (i+1));
                System.out.println("\t"+ "Model: " + arrCars[i].strModel);
                System.out.println("\t"+ "Make: " + arrCars[i].strMake);
                System.out.println("\t"+ "Year: " + arrCars[i].intYear);
                System.out.println("\t"+ "License: " + arrCars[i].strLicense);
                System.out.println();

            }
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

/*

        Car[] a_car = new Car[5];
        a_car[0].Make = fin.readLine();
        System.out.println(a_car[0].Make);

*/
    }
}
