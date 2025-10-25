package cis3270.assignment1.chapter5;
//(Financial application: compute future tuition) Suppose that the tuition for a uni-
//versity is $10,000 this year and increases 5% every year. In one year, the tuition
//will be $10,500. Write a program that computes the tuition in ten years and the
//total cost of four years’ worth of tuition after the tenth year.

public class Q7 {
    public static void main(String[] args) {

        double tuition = 10000;
        double increase = 0.05;
        int year = 0;

        while (year < 10) {
                tuition = tuition * (1 + increase);
                year++;
        }
        System.out.println("The future tuition after 10 years is " + tuition);

        year = 0;
        while (year < 4) {
            tuition = tuition * (1 + increase);
            year ++;
        }
        System.out.println("The total cost of four years' worth of tuition after the tenth year is " + tuition);


    }
}
