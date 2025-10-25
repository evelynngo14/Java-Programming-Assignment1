//(Health application: computing BMI) Body Mass Index (BMI) is a measure of
//health on weight. It can be calculated by taking your weight in kilograms and
//dividing by the square of your height in meters. Write a program that prompts the
//user to enter a weight in pounds and height in inches and displays the BMI. Note
//that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
//a sample run:

package cis3270.assignment1.chapter2;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double weightKg = weight * 0.45359237;
        double heightM = Math.pow(height * 0.0254, 2);

        double BMI = weightKg / heightM;

        System.out.print("BMI is " + BMI);

    }
}
