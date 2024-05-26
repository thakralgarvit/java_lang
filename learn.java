import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // fibonacchi series
        System.out.print("enter a num: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(num1 + " ");

            int sum = num1 + num2; // new intiger to store sum of num 1,2;
            num1 = num2;
            num2 = sum; // shifting of the digits
        }
    }
}