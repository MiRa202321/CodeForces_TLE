import java.util.*;

public class Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n + 1];
            long[] pref = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                pref[i] = pref[i - 1] + a[i];
            }

            long totalSum = pref[n];

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                long oldRangeSum = pref[r] - pref[l - 1];
                int len = r - l + 1;
                long newRangeSum = 1L * len * k;

                long newTotal = totalSum - oldRangeSum + newRangeSum;

                if (newTotal % 2 == 1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
