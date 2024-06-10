import java.util.*;

public class learn {

    public static void kadanes(int num[]) {
        int cs = 0; // current sum to store the value for non negative num
        int csm = 0; // current sum minimum to store the value for negative num
        int ms = Integer.MIN_VALUE; // to compare
        int msm = Integer.MAX_VALUE; // to compare (minimum)
        int flag = 0; // dummy value use to identify

        for (int i = 0; i < num.length; i++) { // to check all the integers are +ve/-ve
            if (num[i] > 0) {
                flag = 1; // change the value if the num[i] is bigger making it a +ve integer
            }
        }

        if (flag == 0) { // condition to make it perform one function at a time
            for (int i = 0; i < num.length; i++) {
                msm = Math.min(msm, num[i]);
                csm = msm; // storing the ans
            }
            System.out.println("the minimun is: " + csm);
        } else {
            for (int i = 0; i < num.length; i++) {
                cs += num[i]; // calculating the max sum
                if (cs < 0) {
                    cs = 0; // changing its value if the calculated sum ends up in 0
                }
                ms = Math.max(ms, cs); // comaring maximum integer
            }
            System.out.println("the maximun is: " + ms);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { -9, -4, -2, -8, -1 };
        // checking max & min sub array sum with the best time complexity
        kadanes(num);
    }
}