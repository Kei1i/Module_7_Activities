/**
 * @(#)Kimmakim_CammodityCode.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Graded_Activities;
import java.util.Scanner;
public class Kimmakim_CammodityCode {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter cammodity code: ");
        char cc=input.nextLine().charAt(0);
        System.out.print("Enter quantity of cammodity: ");
        double qc=input.nextDouble();
        System.out.print("Enter unit price: ");
        double p=input.nextDouble();
        

        if (cc=='J' || cc=='j') 
            System.out.println("Amount to be paid is "+((p*qc)-((p*qc)*0.08)));
        else if (cc=='K' || cc=='k')
            System.out.println("Amount to be paid is "+((p*qc)+((p*qc)*0.11)));
        else if (cc=='L' || cc=='l')
            System.out.println("Amount to be paid is "+(p*qc));
        else 
            System.out.println("Invalid Code");

    }
}
