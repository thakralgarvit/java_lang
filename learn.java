import java.util.*;

public class learn {
    // converting decimal to binary

    // creating a new function
    public static void cov(int dicnum) {

        // some bin integers to strore value
        int mydec = dicnum;
        int pow = 0;
        int binum = 0;

        // starting the loop until our decimal is 0
        while (dicnum > 0) {

            int remander = dicnum % 2;
            binum += remander * ((int) Math.pow(10, pow));
            pow++;

            // to change the value of decimal
            dicnum /= 2;
        }
        System.out.println("decimal of your " + mydec + " is " + binum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("write a decimal number: ");
        int dicnum = sc.nextInt();

        cov(dicnum); // calling the funtion
    }
}