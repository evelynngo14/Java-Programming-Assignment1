package cis3270.assignment1.chapter7;
//Assign grades
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        System.out.print("Enter " + num + " scores: ");
        int [] scores = new int[num];

        for (int i = 0; i < num; i++) {
            scores[i] = input.nextInt();
        }

        String [] grades = assignGrades(scores, num);

        for (int i = 0; i < num; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }

    }
    public static String[] assignGrades(int[] scores, int num) {
        String [] grades = new String[num];
        int currentBest = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > currentBest)
                currentBest = scores[i];
        }
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > currentBest - 10 || scores[i] == currentBest - 10)
                grades[i] = "A";
            else if (scores[i] > currentBest - 20 || scores[i] == currentBest - 20)
                grades[i] = "B";
            else if (scores[i] > currentBest - 30 || scores[i] == currentBest - 30)
                grades[i] = "C";
            else if (scores[i] > currentBest - 40 || scores[i] == currentBest - 40)
                grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
}

