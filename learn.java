import java.util.*;

public class learn {

    public static void bubblesort(int arr[]) {
        for (int i = 0; i< arr.length-1; i++) { // it will length-2 bec the last checking will be done at there
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selctionsort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i; // mini position
            for (int j = i+1; j < arr.length; j++) { // compare it to every other
                if (arr[min] > arr[j]) { 
                    min = j; // change min position if j is smaller
                }
            }
            // swap
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i ++) {
            int curr = arr[i];
            int pre = i-1;
            while (pre>=0 && arr[pre] > curr) { // making of space by cheacking the condition and shifting them
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = curr; // putting in the value (pre + 1 = because sometimes it may go one back)
        }
    }

    public static void countingsort(int arr[]) {
        int max = Integer.MIN_VALUE; // to get length for new array it should be = to max value in array + 1
        for (int i = 0; i < arr.length; i ++) {
            max = Math.max(arr[i] , max);
        }

        int frequancy[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            frequancy[arr[i]]++; // putting values in new array at pertcular index of the same num
        }

        int j = 0;
        for (int i = 0; i < max; i++) { // main sortting by putting values in arr and new arr
            while (frequancy[i] > 0) {
                arr[j] = i;
                j++;
                frequancy[i]--;
            }
        }
    }

    public static void in_build(int arr[]){
        Arrays.sort(arr); // acending order
        //Arrays.sort(arr, Collections.reverseOrder()); // decending order
    }              // its red because the arr is not in Interger

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {3, 7, 2, 3, 4, 1, 3, 5, 6};
        in_build(arr);
        printarr(arr);

    }
}