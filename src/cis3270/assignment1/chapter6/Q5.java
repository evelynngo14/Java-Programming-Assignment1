package cis3270.assignment1.chapter6;
import java.util.Scanner;

public class Q5 {

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else return num2;
    }

    public static double min(double num1, double num2) {
        if (num1 < num2)
            return num1;
        else return num2;
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double largestNum = max(max(num1,num2),num3);
        double smallestNum = min(min(num1, num2), num3);
        double middleNum = (num1 + num2 + num3) - (largestNum + smallestNum);
        System.out.printf("%f %f %f", smallestNum, middleNum, largestNum);
    }

    public static void main(String[] args) {
        displaySortedNumbers(5, 6, 4);
    }

}
