/**
 * @(#)YearProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_7_Practice_IfStatement;
import java.util.Scanner;
public class YearProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Input
        System.out.print("Enter a Year: ");
        int year=input.nextInt();

        if(year%4==0)
            if(year%100==0)
            System.out.println("It is a century year.");
            else
            System.out.println("It is a leap year.");
        else
        System.out.println("It is an ordinary year.");

    }
}