package cis3270.assignment1.chapter6;
// Check password
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String inputPassword = input.nextLine();

        if (checkPassword(inputPassword))
            System.out.println("Valid password");
        else System.out.println("Invalid password");

    }
    public static boolean checkPassword(String password) {
        int digit = 0;
        if (password.length() >= 8) {
            for (int i = 0; i <= password.length() - 1; i++) {
                if (Character.isDigit(password.charAt(i)))
                    digit++;
                if (Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)))
                    continue;
                else return false;
            }
            if (digit >= 2) return true;
        }
        return false;

    }
}
