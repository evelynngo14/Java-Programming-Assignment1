package cis3270.assignment1.chapter6;
//Financial: credit card number validation
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter credit card number as a long integer: ");
        long cardNumber = input.nextLong();
        String cardNumberStr = cardNumber + "";
        int sum = 0;
        int digit = 0;
        for (int i = cardNumberStr.length() - 2; i >= 0; i -= 2) {
            System.out.println(cardNumberStr.charAt(i));
            digit = cardNumberStr.charAt(i) - '0';
            System.out.println(digit);
            System.out.println(sum += getDigit(digit));
        }


    }

    public static boolean isValid(long number) {
        long prefix = getPrefix(number, 1);
        if (getSize(number) >= 13 && getSize(number) <= 16) {
            if (prefix == 4 || prefix == 5 || prefix == 6 || prefixMatched(number, 32)) {
                if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String numberStr = number + "";
        int sum = 0;
        int digit = 0;
        for (int i = numberStr.length() - 1; i >= 0; i -= 2) {
            digit = (numberStr.charAt(i) - 1) * 2;
            sum += getDigit(digit);
        }
        return sum;
    }
    public static int getDigit(int number) {
        if (number >= 10)
            return number = (number / 10) + (number % 10);
        else return number;
    }

    public static int sumOfOddPlace(long number) {
        String numberStr = number + "";
        int sum = 0;
        for (int i = numberStr.length() - 1; i >= 0; i-=2) {
            sum += getDigit(numberStr.charAt(i) - 1);
        }
        return sum;
    }
    public static boolean prefixMatched(long number, int d) {
        String numString = number + "";
        int size = getSize(d);
        if (getPrefix(number, size) == d)
            return true;
        else return false;
    }

    public static int getSize(long d) {
        String dStr = d + "";
        int size;
        return size = dStr.length();
    }

    public static long getPrefix(long number, int k) {
        String numStr = number + "";
        String prefixStr = "";
        if (numStr.length() < k)
            return number;
        else {
            for (int i = 0; i <= k; i++)
                prefixStr = prefixStr + "" + numStr.charAt(i);
        }
        long prefix = Long.parseLong(prefixStr);
        return prefix;

    }

}