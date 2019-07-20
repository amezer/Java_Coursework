// 166	Records	Basic Records	80    Jocelyn Ho

import java.util.Scanner;
// a class named Student should be defined for this problem.
// However, java only allows one class in a file, so we need to create another file for the class Student.
// To link class Student with class BasicRecords, we put the two classes into the same project.

public class BasicRecords
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

            System.out.print("Enter the first student's name: ");
            s1.name = kb.next();

            System.out.print("Enter the first student's grade: ");
            s1.grade = kb.nextInt();

            System.out.print("Enter the first student's average: ");
            s1.average = kb.nextDouble();

            System.out.print("Enter the second student's name: ");
            s2.name = kb.next();

            System.out.print("Enter the second student's grade: ");
            s2.grade = kb.nextInt();

            System.out.print("Enter the second student's average: ");
            s2.average = kb.nextDouble();

            System.out.print("Enter the third student's name: ");
            s3.name = kb.next();

            System.out.print("Enter the third student's grade: ");
            s3.grade = kb.nextInt();

            System.out.print("Enter the third student's average: ");
            s3.average = kb.nextDouble();

        System.out.println("The names are: " + s1.name + " " + s2.name + " " + s3.name);
        System.out.println("The names are: " + s1.grade + " " + s2.grade + " " + s3.grade);
        System.out.println("The names are: " + s1.average + " " + s2.average + " " + s3.average);
        System.out.println("The average for the three students is: " + (s1.average + s2.average + s3.average)/3);

    }
}
