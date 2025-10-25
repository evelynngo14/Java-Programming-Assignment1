package cis3270.assignment1.chapter6;
//Display matrix of 0s and 1s
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n) {
        int element;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                element = (int)(Math.random() * (2));
                System.out.printf(element + " ");

            }
            System.out.println();
        }

    }
}
