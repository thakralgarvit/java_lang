import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static boolean isSafe(int sudoko[][], int row, int col, int digit) {
        // colum
        for (int i = 0; i <= 8; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }

        // row,
        for (int i = 0; i <= 8; i++) {
            if (sudoko[row][i] == digit) {
                return false;
            }
        }

        // box
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoko[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solver(int sudoko[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }

        // recurtion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoko[row][col] != 0) {
            return solver(sudoko, nextRow, nextCol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(sudoko, row, col, i)) {
                sudoko[row][col] = i;
                if (solver(sudoko, nextRow, nextCol)) {
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }

        return false;
    }

    public static void print(int sudoko[][]) {
        for (int i = 0; i < sudoko.length; i++) {
            for (int j = 0; j < sudoko.length; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] sudoko = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        if (solver(sudoko, 0, 0)) {
            System.out.println("solution exict");
            print(sudoko);
        } else {
            System.out.println("not solved");
        }
    }
}
