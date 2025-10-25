package cis3270.assignment1.chapter4;
//(Phone key pads) The international standard letter/number mapping found on the
//telephone is shown below: Write a program that prompts the user to enter a letter and displays its correspond-
//ing number.
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.next().toLowerCase();
        int num = 0;

        boolean valid = true;
        if ((letter.equals("a") || letter.equals("b") || letter.equals("c")))
            num = 2;
        else if ((letter.equals("d") || letter.equals("e") || letter.equals("f")))
            num = 3;
        else if ((letter.equals("g") || letter.equals("h") || letter.equals("i")))
            num = 4;
        else if ((letter.equals("j") || letter.equals("k") || letter.equals("l")))
            num = 5;
        else if ((letter.equals("m") || letter.equals("n") || letter.equals("o")))
            num = 6;
        else if ((letter.equals("p") || letter.equals("q") || letter.equals("r") || letter.equals("s")))
            num = 7;
        else if ((letter.equals("t") || letter.equals("u") || letter.equals("v")))
            num = 8;
        else if ((letter.equals("w") || letter.equals("x") || letter.equals("y") || letter.equals("z")))
            num = 9;
        else {
            System.out.println(letter + " an invalid input");
            valid = false;
        }
        if (valid == true)
            System.out.println("The corresponding number is " + num);

    }

}
