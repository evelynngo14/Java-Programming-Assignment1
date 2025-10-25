package cis3270.assignment1.chapter4;
//(Check SSN) Write a program that prompts the user to enter a Social Security
//number in the format DDD-DD-DDDD, where D is a digit. Your program should
//check whether the input is valid. Here are sample runs:
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN ");
        String SSN = input.next();
        char dash1 = SSN.charAt(3);
        char dash2 = SSN.charAt(6);

        if (!(SSN.indexOf("-",3) == -1) && !(SSN.indexOf('-',6) == -1)
            && (SSN.length() == 11))
                System.out.println(SSN + " is a valid SSN");
        else System.out.println(SSN + " is not a valid SSN");

    }
}
