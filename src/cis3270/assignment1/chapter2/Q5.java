//(Financial application: calculate tips) Write a program that reads the subtotal
//and the gratuity rate, then computes the gratuity and total. For example, if the
//user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
//as gratuity and $11.5 as total.

package cis3270.assignment1.chapter2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        double gratuity = number1 * (number2 / 100);
        double total = number1 + (number1 * (number2 / 100));
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }

}


