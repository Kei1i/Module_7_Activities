/**
 * @(#)ParkingFeeProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_7_Practice_IfStatement;
import java.util.Scanner;
public class ParkingFeeProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter number of hours: ");
        int x=input.nextInt();
        int y;

            if(x<=4)
            System.out.print("Parking Fee: P 35");
            else if(x>4 && x<23)
            System.out.print("Parking Fee: P "+(35+((x-4)*15)));
            else
            System.out.print("Parking Fee: P 250");
    }
}
