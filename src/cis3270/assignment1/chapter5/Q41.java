package cis3270.assignment1.chapter5;
//(Occurrence of max numbers) Write a program that reads integers, finds the larg-
//est of them, and counts its occurrences. Assume that the input ends with number
//0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
//is 5 and the occurrence count for 5 is 4.
import java.util.Scanner;
public class Q41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int max = 0;
        int count = 0;
        int number = 0;
        number = input.nextInt();
        while (number > 0) {
            number = input.nextInt();
            if (number == 0)
                break;
            else if (number > max) {
                max = number;
                count = 1;
            }
            else if (number == max){
                count += 1;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

    }
}
