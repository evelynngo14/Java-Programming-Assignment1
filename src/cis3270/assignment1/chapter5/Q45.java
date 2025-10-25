package cis3270.assignment1.chapter5;
//(Statistics: compute mean and standard deviation)
import java.util.Scanner;
public class Q45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mean = 0;
        double standardDev = 0;

        double total = 0;
        double num = 0;

        double summation1 = 0;
        double summation2 = 0;

        System.out.print("Enter 10 numbers = ");
        for (int i = 1; i <= 10; i++) {
            num = input.nextDouble();
            total += num;
            summation1 += Math.pow(num, 2);
        }
        summation2 = Math.pow(total, 2) / 10;
        standardDev = Math.sqrt((summation1 - summation2) / 9);
        mean = total / 10;

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + standardDev);
    }
}
