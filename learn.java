import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    static int count = 0;

    public static void printboard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(char board[][], int row, int col) {
        // vertical case
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagnal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagnal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printQ(char board[][], int row) {
        // base case
        if (row == board.length) {
            printboard(board);
            count++;
            System.out.println("-----chess-----"); // just to denote the end of one solution
            return;
        }
        // recursion
        for (int i = 0; i < board.length; i++) { // start with o becual we have to itarate col
            if (issafe(board, row, i)) {
                board[row][i] = 'Q'; // placing of queen
                printQ(board, row + 1); // placcing of queen next row
                board[row][i] = 'x'; // backtraking as we again go back to origianl form
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        // fill the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        printQ(board, 0);
        System.out.println("total solve are: " + count);
    }
}
