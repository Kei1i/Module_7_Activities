/**
 * @(#)CammodityProblemUsingSwitch.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_7_Practice_SwitchStatement;
import java.util.Scanner;
public class CammodityProblemUsingSwitch_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter cammodity code: ");
        char cc=input.nextLine().charAt(0);
        System.out.print("Enter quantity of cammodity: ");
        double qc=input.nextDouble();
        System.out.print("Enter unit price: ");
        double p=input.nextDouble();
        
        switch(cc) {
        case '1':
            System.out.println("Amount to be paid is "+Math.round((((p*qc)-((p*qc)*0.15)))*100.0)/100.0);
        break;
        case '2':
            System.out.println("Amount to be paid is "+Math.round((((p*qc)+((p*qc)*0.12)))*100.0)/100.0);
        break;
        case '3':
            System.out.println("Amount to be paid is "+Math.round((p*qc)*100.0)/100.0);
        break;
        default:
            System.out.println("Invalid Code");
        break;
        }

    }
}
