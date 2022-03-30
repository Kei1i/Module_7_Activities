/**
 * @(#)GradeProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_7_Practice;
import java.util.Scanner;
public class GradeProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

    System.out.print("Enter a grade: ");
        int x=input.nextInt();

    if(x>=93 && x<=99)
    System.out.print("Excellent");
    else if(x>=87 && x<=92)
    System.out.print("Very Good");
    else if(x>=80 && x<=86)
    System.out.print("Good");
    else if(x>=70 && x<=79)
    System.out.print("Fair");
    else if(x>=65 && x<=69)
    System.out.print("Poor");
    else
    System.out.print("Invalid Input.");

    }
}