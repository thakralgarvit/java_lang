import java.util.*;

public class learn {

    public static void StairCaseSearch(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length-1;

        while (row < arr.length && col >= 0){
            if (arr[row][col] == key){
                System.out.println("key found at:" + row + ","+ col);
                return;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
            {1,2,3,4} ,
            {5,6,7,8,} ,
            {9,10,11,12} ,
            {13,14,15,16}};
        System.out.println("enter a key");
        int key = sc.nextInt();
        StairCaseSearch(arr, key);

    }
}