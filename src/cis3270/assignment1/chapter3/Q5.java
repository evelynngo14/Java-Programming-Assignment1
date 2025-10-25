/// (Find future dates) Write a program that prompts the user to enter an integer for
/// today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
/// prompt the user to enter the number of days after today for a future day and dis-
/// play the future day of the week. Here is a sample run:

package cis3270.assignment1.chapter3;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int currentDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysAfter = input.nextInt();

        int futureDay = currentDay + daysAfter;

        int i;
        String calendarDay = "";

        for (int count = 0; count < futureDay; count++) {
            if (currentDay == 0)
                calendarDay = "Sunday";
            else if (currentDay == 1)
                calendarDay = "Monday";
            else if (currentDay == 2)
                calendarDay = "Tuesday";
            else if (currentDay == 3)
                calendarDay = "Wednesday";
            else if (currentDay == 4)
                calendarDay = "Thursday";
            else if (currentDay == 5)
                calendarDay = "Friday";
            else if (currentDay == 6)
                calendarDay = "Saturday";


            if (count == 0) {
                System.out.print("Today is " + calendarDay + " ");
                currentDay = currentDay + daysAfter;
            }
            if (currentDay > 6)
                currentDay = currentDay - 7;

        }
        System.out.print("and the future day is " + calendarDay);
    }
}
