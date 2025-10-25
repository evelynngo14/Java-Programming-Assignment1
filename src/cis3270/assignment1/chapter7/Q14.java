package cis3270.assignment1.chapter7;
//computing gcd
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println(findGCD(numbers));
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static int findGCD(int... numbers) {
        int gcd = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            gcd = gcd(numbers[i], gcd);
            if (gcd == 1)
                return 1;
        }
        return gcd;
    }
}
