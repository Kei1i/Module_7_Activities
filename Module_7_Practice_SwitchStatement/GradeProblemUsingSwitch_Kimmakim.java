/**
 * @(#)GradeProblemUsingSwitch.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_7_Practice_SwitchStatement;
import java.util.Scanner;
public class GradeProblemUsingSwitch_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a grade: ");
        int x=input.nextInt();

        switch(x) {
            case 99:
            case 98:
            case 97:
            case 96:
            case 95:
            case 94:
            case 93:
                System.out.println("Letter Grade: A");
            break;
            case 92:
            case 91:
            case 90:
            case 89:
            case 87:
                System.out.println("Letter Grade: B");
            break;
            case 86:
            case 85:
            case 84:
            case 83:
            case 82:
            case 81:
            case 80:
                System.out.println("Letter Grade: C");
            break;
            case 79:
            case 78:
            case 77:
            case 76:
            case 75:
            case 74:
            case 73:
            case 72:
            case 71:
            case 70:
                System.out.println("Letter Grade: D");
            break;
            case 69:
            case 68:
            case 67:
            case 66:
            case 65:
                System.out.println("Letter Grade: E");
            break;
            default: 
                System.out.println("Invalid Input");
        }

    }
}