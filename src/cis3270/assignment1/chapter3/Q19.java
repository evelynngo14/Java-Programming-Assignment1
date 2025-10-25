//(Compute the perimeter of a triangle) Write a program that reads three edges for
//a triangle and computes the perimeter if the input is valid. Otherwise, display that
//the input is invalid. The input is valid if the sum of every pair of two edges is
//greater than the remaining edge.

package cis3270.assignment1.chapter3;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first edge of triangle: ");
        double edge1 = input.nextDouble();
        System.out.print("Enter second edge of triangle: ");
        double edge2 = input.nextDouble();
        System.out.print("Enter third edge of triangle: ");
        double edge3 = input.nextDouble();
        boolean valid = false;

        if ((edge1 + edge2) > edge3)
            valid = true;
        else valid = false;
        if ((edge2 + edge3) > edge1)
            valid = true;
        else valid = false;

        if (valid = true)
            System.out.println("The input is valid");
        if (valid = false)
            System.out.println("The input is invalid");

    }
}
