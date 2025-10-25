//(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-
//paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
//wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
//scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
//2 and displays a message indicating whether the user or the computer wins, loses,
//or draws.

package cis3270.assignment1.chapter3;
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = input.nextInt();
        int bot = (int)(Math.random() * 2);

        String playerMove = "";
        boolean playerWin = false;
        boolean draw = false;
        String outcome = "";
        String botMove = "";

        if (player == 0)
            playerMove = "scissor";
        if (player == 1)
            playerMove = "rock";
        if (player == 2)
            playerMove = "paper";

        if (bot == 0)
            botMove = "scissor";
        if (bot == 1)
            botMove = "rock";
        if (bot == 2)
            botMove = "paper";

        if (player == bot) {
            draw = true;
            outcome = "It is a draw";
        }
        if (player > bot) {
            playerWin = true;
            outcome = "You won";
        }
        if (bot > player) {
            outcome = "The computer won";
        }

        System.out.println("The computer is " + botMove + ". You are " + playerMove + ". " + outcome);
    }
}
