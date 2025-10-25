package cis3270.assignment1.chapter5;

//(Financial application: compare loans with various interest rates) Write a pro-
//gram that lets the user enter the loan amount and loan period in number of years
//and displays the monthly and total payments for each interest rate starting from
//5% to 8%, with an increment of 1/8. Here is a sample run:
import java.util.Scanner;
import java.lang.Math;
public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loan = input.nextDouble();
        System.out.print("Number of years: ");
        int years = input.nextInt() * 12;

        double interestRate  = 0.00125;
        double monthlyPayment = 0;
        double monthlyInterest = 0;
        double totalPayment = 0;

        System.out.printf("%s%22s%16s\n", "Interest Rate",  "Monthly Payment",  "Total Payment");
        for (double i = 0.05; i <= .08; i+= interestRate) {
            monthlyInterest = i / 12;
            monthlyPayment = loan * (monthlyInterest * (Math.pow((1+monthlyInterest), years)) / (Math.pow(1+monthlyInterest, years) - 1));
            totalPayment = monthlyPayment * (years);
            System.out.printf("%2.3f%s%20.2f%20.2f\n", i*100, "%", monthlyPayment, totalPayment);


        }
    }
}
