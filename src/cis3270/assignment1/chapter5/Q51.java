package cis3270.assignment1.chapter5;
//(Longest common prefix) Write a program that prompts the user to enter two
//strings and displays the largest common prefix of the two strings.
import java.util.Scanner;
public class Q51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        int prefixLength = 0;

        int minLength = 0;

        boolean prefix = true;

        if (s1.length() > s2.length())
            minLength = s2.length();
        else if (s2.length() > s1.length())
            minLength = s1.length();

        if (s1.equals(s2))
            System.out.println("The strings are the same");

        int i = 0;
        while (i < minLength) {
            if (s1.charAt(i) == s2.charAt(i))
                prefixLength = i;
            else if (s1.charAt(i) != s2.charAt(i) && i == 0) {
                System.out.println(s1 + " and " + s2 + " have no common prefix");
                break;
            }
            else
                break;
            i += 1;
        }
        if (i > 0)
            System.out.println("The common prefix is " + s1.substring(0,prefixLength));
    }

}


