import java.util.*;

public class learn {

    public static void rainwater(int hight[]) {
        int l = hight.length;
        int LMx[] = new int[l];
        int RMx[] = new int[l];

        // calculate left max i=1 : l ++
        LMx[0] = hight[0];
        for (int i = 1; i < l; i++) {
            LMx[i] = Math.max(hight[i], LMx[i - 1]);
        }

        // calculate right max i=l-2 : 0 --
        RMx[l - 1] = hight[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            RMx[i] = Math.max(hight[i], RMx[i + 1]);
        }

        int totalwater = 0;
        for (int i = 0; i < l; i++) {
            // find waterlevel (find min in left and right max)
            int waterlevel = Math.min(LMx[i], RMx[i]);

            // calculate trapedwater (waterlevel - height [i] * wirth)
            int trapedwater = waterlevel - hight[i];
            totalwater += trapedwater;
        }
        System.out.println("total trap water is: " + totalwater);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hight[] = { 4, 2, 0, 6, 3, 2, 5 };
        rainwater(hight);
    }
}