package cis3270.assignment1.chapter3;
import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x-coordinate, y-coordinate, width, and height of rectangle 1: ");
        double aX = input.nextDouble();
        double aY = input.nextDouble();
        double aWidth = input.nextDouble();
        double aHeight = input.nextDouble();

        System.out.print("Enter x-coordinate, y-coordinate, width, and height of rectangle 2: ");
        double bX = input.nextDouble();
        double bY = input.nextDouble();
        double bWidth = input.nextDouble();
        double bHeight = input.nextDouble();

        boolean Inside = false;

        double aTop = (aY + (aHeight / 2));;
        double aBottom = (aY - (aHeight / 2));
        double aLeft = (aX - (aWidth / 2));
        double aRight = (aX + (aWidth / 2));

        double bTop = (bY + (bHeight / 2));;
        double bBottom = (bY - (bHeight / 2));
        double bLeft = (bX - (bWidth / 2));
        double bRight = (bX + (bWidth / 2));

        if (! (bLeft >= aLeft && bRight <= aRight))
            Inside = false;
        else if ( ! (bBottom >= aBottom && bTop <= aTop))
            Inside = false;
        else Inside = true;

        boolean Overlap = false;
        double xDist = Math.abs(aX - bX);
        double sumHalfWidths = (aWidth + bWidth) / 2;
        double yDist = Math.abs(aY - bY);
        double sumHalfHeights = (aHeight + bHeight) / 2;

        if (xDist < sumHalfWidths && yDist < sumHalfHeights)
            Overlap = true;

        if (Inside)
            System.out.println("r2 is inside");
        else if (Overlap)
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");

    }
}
