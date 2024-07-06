import java.util.*;

public class learn {

    public static int tile(int k) {
        if (k == 0 || k == 1) {
            return 1;
        }
        // n-1 for vertical tiles and n-2 for horizontal tiles
        return tile(k-1) + tile(k-2);
    }

    public static void redup(String str, StringBuilder nstr, int ind, boolean map[]) {
        if (ind == str.length()) {
            System.out.println(nstr);
            return;
        }
        char curr = str.charAt(ind);
        if (map[curr -'a'] == true) {
            redup(str, nstr, ind+1, map);
        } else {
            map[curr-'a'] = true;
            redup(str, nstr.append(str.charAt(ind)), ind+1, map);
        }
    }

    public static int friendPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendPair(n-1) + (n-1) * friendPair(n-2);
    }

    public static void biStr(int n, String str, int lastp) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        biStr(n-1, str+"0", 0);
        if (lastp == 0) {
            biStr(n-1, str+"1", 1);
        }
    }
 
    public static void occr( int arr[] , int index, int key) {
        if (arr[index] == key) {
            System.out.print(index + " ");
        }
        if (index == arr.length-1) {
            return;
        }
        occr(arr, index+1, key);
    }

    static String dig[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printdid (int n) {
        if (n == 0) {
            return;
        }
        int lastdig = n % 10;
        printdid(n/10);
        System.out.print(dig[lastdig]+ " ");
    }

    static int count = 0;
    public static void towerof(int n, String start, String helper, String destination) {
        if (n == 1) {
            System.out.println("disk " + n +"  will transfer from " + start + " to " + destination);
            count++;
            return;
        }
        towerof(n-1, start, destination, helper);
        System.out.println("disk " + n +" will transfer from " + start + " to " + destination);
        towerof(n-1, helper, start, destination);
        count++;
    }   
    
    public static void main(String[] args) {
        redup("guuguufaa", new StringBuilder(""), 0, new boolean[26]);
        // out put should be gufa
        System.out.println(friendPair(3));
        biStr(3, "", 0);
        int arr[] = {3,2,4,5,6,2,7,2,2};
        occr(arr, 0, 2);
        System.out.println();
        printdid(1578);
        System.out.println();
        towerof(3, "a", "b", "c");
        System.out.println(count);

    }
}

