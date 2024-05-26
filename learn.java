import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // reverce a given num
        System.out.println("enter your number");
        int n = sc.nextInt();
        int rev = 0; // making an int to store the reverce num

        while (n > 0) {
            int lasdig = n % 10; // the modulo will give the last digit
            n /= 10; // this will remove the last digit from out n
            rev = (rev * 10) + lasdig; // this will store our new n in reverce
        }

        System.out.println(rev);
    }
}