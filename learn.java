import java.util.*;

public class learn {

    public static int profitstock (int price []) {
        int bp = Integer.MAX_VALUE; // buying price to get lowest price
        int mp = 0; // to track the max profit of the stock
        int sp = 0; // just to print selling price

        for (int i = 0; i < price.length; i ++) {
            if (price[i] > bp) { // to check the values and also give bp the value of first variable
                int crrp = price[i] - bp; // current profit
                if (mp < crrp){ // compRE MAX profit to current profit
                    mp = crrp;
                    sp = price[i]; // putting the biggest selling price;
                }

            } else  { // when price is < buying price
                bp = price[i];
            }
        }
        System.out.println("our buying price is: " + bp + "\nand selling price is: " + sp);

        return mp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(profitstock(price));
    }
}