import java.util.*;

public class Mainak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int ans = a[n-1] - a[0];  // no-op

            // Option 1: Put minimum value at start -> a[n] - min(a)
            int min = Integer.MAX_VALUE;
            for (int x : a) min = Math.min(min, x);
            ans = Math.max(ans, a[n-1] - min);

            // Option 2: Put maximum value at end -> max(a) - a[1]
            int max = Integer.MIN_VALUE;
            for (int x : a) max = Math.max(max, x);
            ans = Math.max(ans, max - a[0]);

            // Option 3: Use adjacent rotation -> maximize a[i] - a[i+1]
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, a[i] - a[i+1]);
            }

            System.out.println(ans);
        }
    }
}
