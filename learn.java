import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // finding prime in 2 -100 num

        // first loop to get from 2-100
        for (int i = 2; i <= 100; i++) {
            boolean isprime = true; // placed inside so that it can reset when loop runs again

            if (i == 2) {
                isprime = true;
            } else {
                // another loop to check the diviser
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isprime = false;
                    }
                }
            }
            if (isprime) {
                System.out.println(i + " ");
            }
        }
    }
}