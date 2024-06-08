import java.util.*;

public class learn {

    public static void reverse(int num[]) {
        int first = 0;
        int last = num.length - 1;

        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            last--;
            first++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = { 2, 3, 5, 7, 9, 13 };

        reverse(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}