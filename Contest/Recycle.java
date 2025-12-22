import java.util.*;

public class Recycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a); // Sort to try destroying small items first
            int minCoins = n;

            // Try destroying the last k bags (heaviest) with coins, and the first n-k bags for free
            for (int k = 0; k <= n; k++) {
                boolean ok = true;
                for (int i = 0; i < n - k; i++) {
                    long weight = (long) a[i] << i;
                    if (weight > c) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    minCoins = Math.min(minCoins, k);
                }
            }

            System.out.println(minCoins);
        }
    }
}
