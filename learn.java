import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // reversing the array

        int[] arr = { 1, 2, 3, 4, 5 };
        int length = arr.length;
        int[] orr = new int[length]; // build a dummy array to store the ans

        // trasfer integers from one to another array
        for (int i = 0; i < length; i++) {
            orr[i] = arr[length - 1 - i];
        }
        // printing of new array
        for (int k = 0; k < length; k++) {
            System.out.println(orr[k]);
        }
    }
}