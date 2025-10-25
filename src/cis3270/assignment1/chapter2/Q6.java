//(Sum the digits in an integer) Write a program that reads an integer between 0 and
//1000 and adds all the digits in the integer. For example, if an integer is 932, the
//sum of all its digits is 14.
//Hint: Use the % operator to extract digits, and use the / operator to remove the
//extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.


package cis3270.assignment1.chapter2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int digit1 = num % 10;
        int num1 = num / 10;
        int digit2 = num1 % 10;
        int num2 = num1 / 10;
        int digit3 = num2 % 10;

        int answer = digit1 + digit2 + digit3;

        System.out.println("The sum of the digits is: " + answer);

    }
}
