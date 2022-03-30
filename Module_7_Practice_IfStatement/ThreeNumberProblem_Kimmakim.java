/**
 * @(#)ThreeNumberProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_7_Practice_IfStatement;
import java.util.Scanner;
public class ThreeNumberProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Input
        System.out.print("Enter x: ");
        int x=input.nextInt();
        System.out.print("Enter y: ");
        int y=input.nextInt();
        System.out.print("Enter z: ");
        int z=input.nextInt();

        //Output 
            //Highest Number
            if (x>=y && x>=z)
                System.out.println("The Highest Number is "+x);
            else if(y>=x && y>=z)
                System.out.println("The Highest Number is "+y);
            else
                System.out.println("The Highest Number is "+z);
            //Median Number
            if (x>=y && x<=z)
                System.out.println("The Median Number is "+x);
            else if(x<=y && x>=z)
                System.out.println("The Median Number is "+x);
            else if(y>=x && y<=z)
                System.out.println("The Median Number is "+y);
            else if(y<=x && y>=z)
                System.out.println("The Median Number is "+y);
            else if(z>=x && z<=y)
                System.out.println("The Median Number is "+z);
            else
                System.out.println("The Median Number is "+z);
            //Smallest Number
            if (x<=y && x<=z)
                System.out.println("The Smallest Number is "+x);
            else if(y<=x && y<=z)
                System.out.println("The Smallest Number is "+y);
            else
                System.out.println("The Smallest Number is "+z);
            //Order
            if (x>=y && y>=z)
                System.out.println("Ascending Order: "+z+" "+y+" "+x);
            else if(y>=x && x>=z)
                System.out.println("Ascending Order: "+z+" "+x+" "+y);
            else if(z>=x && x>=y)
                System.out.println("Ascending Order: "+y+" "+x+" "+z);
            else if(z>=x && y>=x)
                System.out.println("Ascending Order: "+x+" "+y+" "+z);
            else if(x>=z && x>=y)
                System.out.println("Ascending Order: "+y+" "+z+" "+x);
            else
                System.out.println("Ascending Order: "+x+" "+z+" "+y);        
    }
}