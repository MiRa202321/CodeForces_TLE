import java.util.*;

public class Cyclic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            long sum = 0, max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
                max = Math.max(max, a[i]);
            }

            long bestPair = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long pair = a[i] + a[(i + 1) % n];
                bestPair = Math.min(bestPair, pair);
            }

            long ans = sum + max - bestPair;
            System.out.println(ans);
        }
    }
}
