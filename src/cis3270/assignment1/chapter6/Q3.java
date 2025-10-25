package cis3270.assignment1.chapter6;
//Palindrome integer
public class Q3 {
    public static int reverse(int number) {
        int rev = 0;
        int rem = 0;
        while (number > 0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }

    public static void main(String[] args) {
        int num = 54345;
        if (isPalindrome(num))
            System.out.println(num + " is a palindrome");
        else System.out.println(num + " is not a palindrome");
    }
}