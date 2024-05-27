import java.util.*;

public class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // checking palindrom

        // input a string
        System.out.print("input a num: ");
        String str = sc.nextLine();

        boolean ispali = true;
        int length = str.length();

        for (int i = 1; i <= length / 2; i++) { // to make it faster
            if (str.charAt(i) != str.charAt(length - 1 - i)) { // to check the charAt(i) not equal to end of the word
                ispali = false;
                break; // to get out of loop as soon as the condition is true
            }
        }

        System.out.println(ispali);

    }
}