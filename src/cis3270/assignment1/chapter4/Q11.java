package cis3270.assignment1.chapter4;
//(Decimal to hex) Write a program that prompts the user to enter an integer between
//0 and 15 and displays its corresponding hex number.
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value between 0 and 15: ");
        int decValue = input.nextInt();
        char hexValue = 0;
        
        if (decValue > 0 && decValue <= 9)
            System.out.println("The hex value is " + decValue);
        else if (decValue >= 10 && decValue <= 15) {
            hexValue = (char) (decValue + 65 - 10);
            System.out.print("The hex value is " + hexValue);
        }
        else System.out.println(decValue + " is an invalid input");

    }
}
