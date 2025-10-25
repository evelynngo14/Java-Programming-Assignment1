//(Game: pick a card) Write a program that simulates picking a card from a deck
//of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
//Here is a sample run of the program:

package cis3270.assignment1.chapter3;
public class Q24 {
    public static void main(String[] args) {
        int rankGen = (int)(1 + Math.random() * 13);
        int suitGen = (int)(1 + Math.random() * 4);
        String rank = rankGen + "";
        String suit = "";

        if (rankGen == 1)
            rank = "Ace";
        if (rankGen == 11)
            rank = "Jack";
        if (rankGen == 12)
            rank = "Queen";
        if (rankGen == 13)
            rank = "King";

        if (suitGen == 1)
            suit = "Clubs";
        if (suitGen == 2)
            suit = "Diamonds";
        if (suitGen == 3)
            suit = "Hearts";
        if (suitGen == 4)
            suit = "Spades";

        System.out.println("The card you picked is " + rank + " of " + suit);
    }
}
