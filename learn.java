import java.util.*;

public class learn {

    static int count = 0;

    public static void find_Substring(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            count++;
            System.out.println(ans);
            return;
        }
        //recursion
        //yes choice
        find_Substring(str, ans+str.charAt(i), i+1);
        //no choice 
        find_Substring(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abcde";
        find_Substring(str, "", 0);
        System.out.println("total no of subsets:" + (count));
        
    }
}
