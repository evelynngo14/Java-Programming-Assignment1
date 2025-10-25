//(Find the number of years) Write a program that prompts the user to enter the
//minutes (e.g., 1 billion), and displays the number of years and days for the min-
//utes. For simplicity, assume a year has 365 days. Here is a sample run:

package cis3270.assignment1.chapter2;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int mins = input.nextInt();

        double years = (((mins / 60.0) / 24.0) / 365.0);
        int yearsOutput = (int)years;

        double daysOutput = ((years - (double)yearsOutput)*365);

        System.out.println(mins + " minutes is approximately " + yearsOutput + " years and " + (int)daysOutput + " days ");
    }
}
