package cis3270.assignment1.chapter7;
//sort students
import java.sql.SQLOutput;
import java.util.Scanner;
public class Q17 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num of students: ");
        int numStudents = input.nextInt();

        String[] students = new String[numStudents];
        int [] scores = new int[numStudents];

        System.out.println("Enter students and their scores: ");
        for (int i = 0; i < numStudents; i++) {
            students[i] = input.next();
            scores[i] = input.nextInt();
        }

        String[] sortedNames = sortStudents(numStudents, students, scores);

        for (int i = 0; i < numStudents; i++) {
            System.out.println(sortedNames[i]);
        }


    }
    public static String[] sortStudents(int numStudents, String students[], int scores[]) {
        int[] sortStudents = new int[numStudents];
        for (int i = 0; i < numStudents - 1; i++) {
            for (int j = 0; j < numStudents - i - 1; j++)
                if (scores[j] < scores[j+1]) {
                    int score = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = score;
                    String student = students[j];
                    students[j] = students[j+1];
                    students[j+1] = student;
            }
        }
        return students;
    }
}
