package cis3270.assignment1.chapter5;

//(Find the two highest scores) Write a program that prompts the user to enter the
//number of students and each student’s name and score, and finally displays the
//student with the highest score and the student with the second-highest score.

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentNum = input.nextInt();
        int i;
        double firstScore = 0;
        double secondScore = 0;
        String firstStudent = "";
        String secondStudent = "";

        for (i = 0; i < studentNum; i++) {
            System.out.print("Enter student name: ");
            String student = input.next();

            System.out.print("Enter " + student + "'s score: ");
            double studentScore = input.nextDouble();
            if (studentScore > firstScore) {
                firstScore = studentScore;
                firstStudent = student;
            }
            if (firstScore > studentScore && studentScore > secondScore) {
                secondScore = studentScore;
                secondStudent = student;
            }
        }

        System.out.println("The highest score is " + firstScore + " from " + firstStudent);
        System.out.println("The second highest score is " + secondScore + " from " + secondStudent);

        }
    }


