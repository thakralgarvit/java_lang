import java.util.*;

public class learn {

    public static int  search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si)/2;

        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) { //condition for left side
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            } else {
                return search(arr, tar, mid+1, ei);
            }
        } else { //condition for right side
            if (tar <= arr[ei] && tar >= arr[mid]) {
                return search(arr, tar, mid+1, ei);
            } else {
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int index = search(arr, 7, 0, arr.length-1);
        System.out.println(index);
    }
}
