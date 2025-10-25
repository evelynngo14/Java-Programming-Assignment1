package cis3270.assignment1.chapter7;

public class Q22 {

    public static void main(String[] args) {
        String[] board = queens(board());
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);
        }

    }

    public static String[] board() {
        String[] board = new String[130];

        for (int i = 0; i < 130; i+=2) {
            board[i] = "|";
            board[i+1] = " ";
            if (i % 16 == 0 && i != 0 && i != 128)
                board[i] = "|\n|";
        }
        return board;
    }

    public static String[] queens(String[] board) {
        String[] queens = board();
        int[] invalidSpaces = invalid();
        int k = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 17; j += 1) {
                int placeQueen = placeQueen();
                if (checkValid(placeQueen, invalidSpaces)) {
                    if (placeQueen + (16*i) > 129)
                        break;
                    queens[placeQueen + (16*i)] = "Q";
                    invalidSpaces[placeQueen] = 0;
                    break;
                } else {
                    while (k < 0) {
                        placeQueen = placeQueen();
                        if (checkValid(placeQueen, invalidSpaces))
                            k++;
                    }
                }
            }
        }
        return queens;
    }

    public static boolean checkValid(int placeQueen, int[] invalid) {
        for (int i = 0; i < invalid.length; i++) {
            if (invalid[placeQueen] == 0)
                return false;
        }
        return true;
    }

    public static int[] invalid() {
        int [] invalid = new int[18];
        for (int i = 1; i < 16; i++) {
            if (i % 2 == 0)
                invalid[i] = 0;
            else
                invalid[i] = 1;
            }
        return invalid;
    }

    public static int placeQueen() {
        int placeQueen = (int)(Math.random() * 17) + 1;
        return placeQueen;
    }
}




/* queen or no queen?
eight columns / 9 lines
next row
find valid row (randomize)
repeat 8x
 */