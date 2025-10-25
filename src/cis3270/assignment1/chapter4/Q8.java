package cis3270.assignment1.chapter4;

//(Find the character of an ASCII code) Write a program that receives an ASCII code
//(an integer between 0 and 127) and displays its character.
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();
        char asciiChar = (char)ascii;
        System.out.println("The character for ASCII code " + ascii + " is " + asciiChar);




    }
}
