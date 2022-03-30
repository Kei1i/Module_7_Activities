/**
 * @(#)Kimmakim_Figure.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Graded_Activities;
import java.util.Scanner;
public class Kimmakim_Figure {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Menu: Compute Area of");
        System.out.println("1.Trapezoid");
        System.out.println("2.Ellipse");
        System.out.println("3.Equilateral Triangle");

        System.out.print("Choice: ");
            int x=input.nextInt();
            switch (x) {
                case 1:System.out.println("Trapezoid"); 
                System.out.print("Enter h: ");
                double h=input.nextDouble();
                System.out.print("Enter b1: ");
                double b1=input.nextDouble();
                System.out.print("Enter b2: ");
                double b2=input.nextDouble();
                System.out.print("Area of Trapezoid: "+Math.round(((h/2)*(b1+b2))*100.0)/100.0);
                break;

                case 2:System.out.println("Ellipse"); 
                System.out.print("Enter r1: ");
                int r1=input.nextInt();
                System.out.print("Enter r2: ");
                int r2=input.nextInt();
                System.out.print("Area of Ellipse is: "+Math.round(((Math.PI)*(r1*r2))*100.0)/100.0);
                break;

                case 3:System.out.println("Equilateral Trianle");
                System.out.print("Enter a: ");
                int a=input.nextInt();
                System.out.print("Triangle is: "+Math.round((((Math.sqrt(3)*(a*a))/4))*100.0)/100.0);
                break;
            }
    }
}
