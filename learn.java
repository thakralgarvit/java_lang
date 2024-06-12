import java.util.*;

public class learn {

    public static int find(int num[], int target) {
        int left = 0;
        int right = num.length - 1;

        while (left <= right) { // infinity loop
            int mid = left + (right - left) / 2; // using (right-left) to control the overflow of index
            if (num[mid] == target) { // first thing to check if our target is in the mid
                return mid;
            }
            if (num[left] <= num[mid]) { // value in left <= value of mid so that we can go to left side of search
                if (num[left] <= target && target < num[mid]) { // as the num is sorted so if in the range of start & end our num is present or not
                    right = mid - 1;
                                                               
                } else {
                    left = mid + 1;
                }
            } else {
                if (num[mid] < target && target <= num[right]) { // right half of the num
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(find(num, target));
    }
}