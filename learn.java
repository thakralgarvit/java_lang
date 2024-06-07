import java.util.*;

public class learn {

    public static int bisearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) { // to get terminating statment
            int mid = (start + end) / 2; // finding mid

            if (num[mid] == key) { // first case
                return mid;
            } else if (num[mid] > key) { // second case key is first half
                end = mid - 1;
            } else if (num[mid] < key) { // thrid case key is in second half
                start = mid + 1;
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaration of array
        int num[] = new int[8];

        for (int i = 0; i < num.length; i++) { // input array
            System.out.println("enter your sorted " + i + "th number: ");
            num[i] = sc.nextInt();
        }

        // output array
        System.out.println("this is your array");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }

        System.out.println();
        int key = 10;
        System.out.print("your key is on index num: ");
        System.out.print(bisearch(num, key)); // calling by refrance

    }
}