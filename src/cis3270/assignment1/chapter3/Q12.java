//(Palindrome number) Write a program that prompts the user to enter a three-digit
//integer and determines whether it is a palindrome number. A number is palin-
//drome if it reads the same from right to left and from left to right. Here is a sample
//run of this program:

package cis3270.assignment1.chapter3;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();

        boolean isPalindrome = false;

        if (num % 10 == num / 100)
            isPalindrome = true;

        if (isPalindrome == true)
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");

    }
}
