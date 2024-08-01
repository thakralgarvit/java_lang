import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static void print(int arr[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int x, int z, int n) {

        return (x >= 0 && z >= 0 && x < n && z < n && maze[x][z] == 1);
    }

    public static boolean RatWay(int maze[][], int n) {
        int ansMaze[][] = new int[n][n];

        if (solvemaze(maze, 0, 0, ansMaze, n) == false) {
            System.out.println("solution does not exist!!!");
            return false;
        }

        print(ansMaze, n);
        return true;
    }

    public static boolean solvemaze(int maze[][], int x, int z, int ansMaze[][], int n) {
        if (x == n - 1 && z == n - 1 && maze[x][z] == 1) {
            ansMaze[x][z] = 1;
            return true;
        }

        if (isSafe(maze, x, z, n)) {
            ansMaze[x][z] = 1;
            if (solvemaze(maze, x + 1, z, ansMaze, n)) {
                return true;
            }
            if (solvemaze(maze, x, z + 1, ansMaze, n)) {
                return true;
            }
            ansMaze[x][z] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        int n = maze.length;
        RatWay(maze, n);

    }
}
