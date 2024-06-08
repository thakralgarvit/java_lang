import java.util.*;

public class learn {

    public static void subarr(int num[]) {
        int tp = 0; // take acount of output
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int curmax = 0;
        int currmin = 0;

        // to get first num
        for (int i = 0; i <= num.length - 1; i++) {
            // to get second num
            for (int j = i; j <= num.length - 1; j++) {
                int sum = 0; // to get sum
                for (int k = i; k <= j; k++) { // print and sum the integer
                    System.out.print(num[k] + ", ");
                    sum += num[k];
                }
                if (sum < min) { // checking the min condition
                    min = sum;
                    currmin = sum;
                } else if (sum > max) { // checking max condition
                    max = sum;
                    curmax = sum;
                }
                System.out.print("sum is: " + sum);
                System.out.println();
                tp++;
            }
            System.out.println();
        }

        System.out.println("minimum sum is: " + currmin + " & maximum is: " + curmax);
        System.out.println("total output: " + tp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, -1, -4, 5, 9 };

        subarr(num);

    }
}