//Write a program that prompts the user to enter values for a, b, and c and displays
//the result based on the discriminant. If the discriminant is positive, display two
//roots. If the discriminant is 0, display one root. Otherwise, display “The equation
//has no real roots”.

package cis3270.assignment1.chapter3;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4*a*c);

        double root1 = (-b + Math.sqrt(discriminant))/(2*a);
        double root2 = (-b - Math.sqrt(discriminant))/(2*a);

        if (discriminant == 0) {
            System.out.println("The equation has one root " + root1);
        }

        if (discriminant > 0) {
            System.out.println("The equation has roots " + root1 + " and " + root2);
        }

        if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        }

    }
}
