import java.util.*;

public class learn {
    
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) { // base case
            return;
        }
        // divide 
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid+1, ei);// right
        // concer
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si +1];
        int i = si; // index for left arr
        int j = mid +1; // index for right arr
        int k = 0; // index for temp[]
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++; i++;
            }else {
                temp[k] = arr[j];
                j++; k++;
            }
        }

        // for the cases when any arr keys are left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        i = 0;
        // copying the temp[] to original []
        for(k = 0; k< temp.length; k++) {
            arr[si +k] = temp[k];
        }
        
    }

    public static void print (int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-5};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }
}

