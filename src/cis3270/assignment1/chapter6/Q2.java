package cis3270.assignment1.chapter6;

public class Q2 {
    public static int sumDigits(long n) {
        int sum = 0;
        for (int i = 1; n != 0; i++) {
            sum += (int)(n % 10);
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
    }
}
