import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    static int count = 0;

    public static void find_permutation(String str, String ans){
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String nstr = str.substring(0,i) + str.substring(i+1);
            find_permutation(nstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        find_permutation(str, "");
        System.out.println("total no of subsets:" + (count));
        
    }
}
