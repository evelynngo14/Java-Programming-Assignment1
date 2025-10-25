package cis3270.assignment1.chapter5;
//(Display pyramid) Write a program that prompts the user to enter an integer from
//1 to 15 and displays a pyramid, as shown in the following sample run:
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 15: ");
        int num = input.nextInt();
        int nextLine = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = nextLine; j <= num; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();
            nextLine += 1;
        }
    }
}
