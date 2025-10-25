package cis3270.assignment1.chapter6;
//(USE the isPrime Method)
public class Q10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i))
                count++;
        }
        System.out.println("The number of prime numbers is " + count);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }


}

