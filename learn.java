import java.util.*;

public class learn {

    public static void maxsubarrsum(int num[]) { // with better time complexity
        // declation of new array prefix
        int prefix[] = new int[num.length];
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        // putting values in prefix array
        prefix[0] = num[0]; // first index is same
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i]; // to get total of the prefix index
        }

        for (int i = 0; i < num.length; i++) { // to get start
            currsum = 0;
            for (int j = i; j < num.length; j++) { // to get end
                // calculating the sum throught prefix array  
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            if (currsum > maxsum) { // compare the max value
                maxsum = currsum;
            }
        }

        System.out.println(maxsum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 1, -2, 6, -1, 3 };

        maxsubarrsum(num);

    }
}