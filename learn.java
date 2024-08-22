import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static boolean monotonic (ArrayList<Integer> num){
        boolean isDec = true; // flags to test 
        boolean isInc = true;

        for(int i = 0; i < num.size()-1; i++) { // loop till 2 index back
            if (num.get(i) < num.get(i+1)) {
                isDec = false; // check for dec
            } else if (num.get(i) > num.get(i+1)) {
                isInc = false; // check for inc
            }
        }
        return isDec || isInc ; // return if eather one is true
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(4);
        num.add(2);
        num.add(3);
        System.out.println(monotonic(num));
    }
}
