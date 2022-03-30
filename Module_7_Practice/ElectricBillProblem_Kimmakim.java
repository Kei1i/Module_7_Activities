/**
 * @(#)ElectricBillProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_7_Practice;
import java.util.Scanner;
public class ElectricBillProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

    System.out.print("Enter electric consumption: ");
        double x=input.nextDouble();

    if (x<=400)
    System.out.println("Electric Bill is P"+(Math.round((x*30.12)*100.0)/100.));
    else
    System.out.println("Electric Bill is P"+(Math.round(((400*30.12)+((x-400)*25.23))*100.0)/100.));
    }
}