import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 9, 7, 2, 4, 8, };
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // min conndition
            if (min < arr[i]) {
                min = arr[i];

            }
            if (max > arr[i]) { // max condition
                max = arr[i];
            }
        }
        System.out.println("the max is " + max);
        System.out.println("the min is " + min);
    }
}