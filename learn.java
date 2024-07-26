import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static int gridways (int i, int j, int n, int m) {
        // base case
        if (i == n-1 || j == m-1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;                                // O(2^(n+m))
        }
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1 + w2;
    }

    public static int fgridways (int n, int m) {
        if (n == 0 || m == 0) {
           return 1; 
        }
        int nm1 = factorial(n-1);
        int mm1 = factorial(m-1);
        int up = (n-1) + (m-1);
        int upf = factorial(up);                      // O(n+m)
        return upf / (nm1 * mm1);
    }

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n= 3;
        int m = 3;
        System.out.println(gridways(0, 0, n, m));
        System.out.println(fgridways(n, m));
    }
}
