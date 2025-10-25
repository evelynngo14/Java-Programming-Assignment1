package cis3270.assignment1.chapter5;
//(Sum a series) Write a program to sum the following series:
public class Q24 {
    public static void main(String[] args) {
        double numerator = 1;
        double denominator = 3;
        double sum = 0;
        for (int i = 0; i <= 96; i++) {
            sum += numerator / denominator;
            numerator += 2;
            denominator += 2;
        }
        System.out.println(sum);
    }
}
