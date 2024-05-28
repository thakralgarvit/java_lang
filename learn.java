import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // butterfly pattern

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // 1st star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // printing spaces
            int spc = 2 * (n - i);

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            // 2nd star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {

            // 1st star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // printing spaces
            int spc = 2 * (n - i);

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            // 2nd star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}