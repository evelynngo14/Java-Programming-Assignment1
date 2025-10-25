//(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
//the current time in GMT. Revise the program so that it prompts the user to enter
//the time zone offset to GMT and displays the time in the specified time zone.

package cis3270.assignment1.chapter2;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + offset;


        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
