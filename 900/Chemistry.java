import java.util.*;
import java.io.*;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];
            for (char c : s.toCharArray()) freq[c - 'a']++;

            int cntOdd = 0;
            for (int f : freq) {
                if (f % 2 == 1) cntOdd++;
            }

            // Condition: can we fix odd frequencies with k removals?
            if (cntOdd <= k + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
