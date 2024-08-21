import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> msintList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(56);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(56);
        msintList.add(list1);
        msintList.add(list2);
        System.out.println(msintList);
    }
}
