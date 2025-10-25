package cis3270.assignment1.chapter5;
//(Count positive and negative numbers and compute the average of numbers) Write
//a program that reads an unspecified number of integers, determines how many
//positive and negative values have been read, and computes the total and average of
//the input values (not counting zeros). Your program ends with the input 0. Display
//the average as a floating-point number. Here is a sample run:

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int num = 1;
        int pos = 0;
        int neg = 0;
        double total = 0;
        double count = 0;

        while (true) {
            num = input.nextInt();
            if (num > 0)
                pos ++;
            else if (num < 0)
                neg ++;
            else if (num == 0)
                break;
            count ++;
            total += num;
        }

        if (count != 0) {
            double average = total / count;
            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }
        else if (count == 0) {
            System.out.println("No numbers are entered except 0");
        }


    }
}
