import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static boolean find(ArrayList<Integer> list, int tar) {
        int n = list.size();
        int bp = -1; //invalid index

        for(int i = 0; i < n ; i++) { // cheching the breakig point
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int Lp = bp+1;
        int Rp = bp;

        while (Lp != Rp) {
            if (list.get(Lp) + list.get(Rp) == tar) { //1st case
                return true;
            }
            if (list.get(Lp) + list.get(Rp) < tar) { // 2nd case
                Lp = (Lp + 1) % n;
            } else { // 3rd case
                Rp = (n + Rp -1) % n;
            } 
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target = 16;
        System.out.println(find(list, target));
    }
}
