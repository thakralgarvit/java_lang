import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static int maxWater(ArrayList<Integer> hight) {
        int maxWater = 0;

        // its a brute force with TC of O(n^2)
        for (int i = 0; i < hight.size(); i++) {
            for (int j = i + 1; j < hight.size(); j++) {
                int currhight = Math.min(hight.get(i), hight.get(j));
                int width = j - i;
                int area = currhight * width;
                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        // 2 pointer apporch with TC of O(n)
        while (lp < rp) {
            int ht = Math.min(height.get(rp), height.get(lp));
            int width = rp - lp;
            int area = ht * width;
            maxWater = Math.max(maxWater, area);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);

        System.out.println(maxWater(hight));
        System.out.println(storeWater(hight));
    }
}
