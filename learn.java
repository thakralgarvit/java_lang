import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(" the year is century");
        } else {
            System.out.println(" year is not century");
        }
        sc.close();
    }
}