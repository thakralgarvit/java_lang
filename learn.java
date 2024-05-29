import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // time calculator

        System.out.println("put in your time");
        int day = sc.nextInt();
        int hr = sc.nextInt();
        int min = sc.nextInt();

        // converting GMT TO IST

        hr += 5;
        min += 30;

        if (hr > 24) {
            day++;
            hr -= 24;
        }
        if (min > 60) {
            hr++;
            min -= 60;
        }
        if (day > 30) {
            day = 1;
        }

        System.out.println("the date will be: " + day + "  hr: " + hr + "  min: " + min);

    }
}