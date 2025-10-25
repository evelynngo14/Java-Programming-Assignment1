package cis3270.assignment1.chapter6;

import java.util.Scanner;

//Financial: credit card number validation
public class Q31a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter credit card number as a long integer: ");
        long cardNumber = input.nextLong();
        if (isValid(cardNumber))
            System.out.println(cardNumber + " is valid");
        else System.out.println(cardNumber + " is invalid");

        }

    public static boolean isValid(long number) {
        long prefix1 = getPrefix(number, 1);
        long prefix2 = getPrefix(number, 2);
        if (getSize(number) >= 13 || getSize(number) <= 16) {
            if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number,6)) {
                if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        int length = getSize(number);
        int evenNum = 0;
        for (int i = 2; i <= length; i += 2) {
            evenNum = (int)(number % Math.pow(10,i) / Math.pow(10, i-1)) * 2;
            sum += getDigit(evenNum);
        }
        return sum;
    }
    public static int getDigit(int number) {
        if (number >= 10)
            return number = (number / 10) + (number % 10);
        else return number;
    }
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        int length = getSize(number);
        long oddNum = 0;
        for (int i = 1; i <= length; i += 2) {
            oddNum = (int)(number % Math.pow(10,i) / Math.pow(10, i-1));
            sum += oddNum;
        }
        return sum;
    }
    public static boolean prefixMatched(long number, int d) {
        if ((int)getPrefix(number, getSize(d)) == d)
            return true;
        else return false;
    }

    public static int getSize(long d){
        String dStr = d + "";
        int size;
        return size = dStr.length();
    }

    public static long getPrefix(long number, int k) {
        if (k > getSize(number))
            return number;
        else {
            long prefix = (long) (number / Math.pow(10, getSize(number) - 1));
            return prefix;
        }
    }
}
