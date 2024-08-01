import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    static char ch[][] = { {}, {}, { 'a', 'b', 'c' },
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' },
            { 'j', 'k', 'l' },
            { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' },
            { 'w', 'x', 'y', 'z' } };

    public static void combination(String str) {
        int l = str.length();
        if (l == 0) {
            System.out.println("mu ba la ala");
            return;
        }
        bfs(0, l, new StringBuilder(), str);
    }

    public static void bfs(int pos, int l, StringBuilder sb, String str) {
        if (pos == l) {
            System.out.println(sb.toString());
        } else {
            char letter[] = ch[Character.getNumericValue(str.charAt(pos))];
            for (int i = 0; i < letter.length; i++) {
                bfs(pos + 1, l, new StringBuilder(sb).append(letter[i]), str);
            }
        }
    }

    public static void main(String[] args) {
        combination("23");
    }
}
