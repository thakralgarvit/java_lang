import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // printing a pattern with nessted loops
        System.out.println("write a num");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // outter loop for raws
            for (int j = 1; j <= i; j++) { // inner loop for colums
                System.out.print(" * ");
            }
            System.out.println(); // to move in next line
        }
    }
}