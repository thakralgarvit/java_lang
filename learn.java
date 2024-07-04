import java.util.*;

public class learn {

    public static int fctorial(int n) {
       if (n == 0) {
        return 0;
       } 
       return n + fctorial(n-1);
    }

    public static int fibonachi (int n ) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonachi(n-1) + fibonachi(n-2);
    }

    public static boolean isSort (int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSort(arr, i+1);
    }

    public static int find(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return find(arr, key, i+1);
    }

    public static int findla(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return find(arr, key, i-1);
    }

    public static int pow(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * pow(n, p-1);
    }

    public static void main(String[] args) {
        int arr[] = {3,4,7,6,8,4,4,3,6,7,5,};
        int key = 7;
        int i = arr.length-1;
        int p = 10;
        int n = 2;
        System.out.println(pow(n, p));
    }
}

