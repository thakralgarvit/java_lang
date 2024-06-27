import java.util.*;

public class learn {

    public static void StairCaseSearch(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("key found at:" + row + "," + col);
                return;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
    }

    public static void compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "aaabbbchdf";
        compress(str);

    }
}