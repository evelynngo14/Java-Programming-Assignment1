package cis3270.assignment1.chapter4;
//(Vowel or consonant?) Write a program that prompts the user to enter a letter and
//check whether the letter is a vowel or consonant. Here is a sample run:
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.next();

        if (Character.isLetter(letter.charAt(0))) {
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
                System.out.print(letter + " is a vowel");
            else
                System.out.println(letter + " is a consonant");
        }
        else System.out.print("invalid input");
    }
}
