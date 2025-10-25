package cis3270.assignment1.chapter6;
//Occurrences of a specified characterr
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        System.out.print("Enter character: ");
        String aStr = input.nextLine();
        char a = aStr.charAt(0);
        System.out.println("The number of occurrences of the character is " + count(str, a));
    }
    public static int count(String str, char a) {
        int countChar = 0;
        for (int i = 0; i <= str.length() - 1; i++){
            if (str.charAt(i) == a)
                countChar++;
        }
        return countChar;
    }
}
