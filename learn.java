import java.util.*;

public class learn {
    // converting binary to decimal

    // creating a new function
    public static void cov(int binum) {

        // some bin integers to strore value
        int mybinum = binum;
        int pow = 0;
        int decnum = 0;

        // starting the loop until our binary is 0
        while (binum > 0) {
            int lastdig = binum % 10;
            // main converting
            decnum += lastdig * ((int) Math.pow(2, pow));
            pow++;
            binum /= 10;
        }
        System.out.println("decimal of your " + mybinum + " is " + decnum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("write a binary number: ");
        int binum = sc.nextInt();

        cov(binum); // calling the funtion
    }
}