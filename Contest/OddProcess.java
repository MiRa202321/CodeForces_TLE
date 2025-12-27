import java.util.*;

public class OddProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> odd = new ArrayList<>();
            List<Integer> even = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if ((x & 1) == 1) odd.add(x);
                else even.add(x);
            }

            // sort descending
            odd.sort(Collections.reverseOrder());
            even.sort(Collections.reverseOrder());

            int o = odd.size();
            int e = even.size();

            long[] prefE = new long[e + 1];
            for (int i = 1; i <= e; i++) prefE[i] = prefE[i - 1] + even.get(i - 1);

            StringBuilder sb = new StringBuilder();

            // if no odd coins, every answer is 0 (every addition will always be even -> bag emptied)
            if (o == 0) {
                for (int k = 1; k <= n; k++) sb.append(0).append(" ");
                System.out.println(sb.toString().trim());
                continue;
            }

            long largestOdd = odd.get(0);

            for (int k = 1; k <= n; k++) {
                long best = 0;

                // try y evens appended to the final bag (y from 0 .. min(e, k-1))
                int maxY = Math.min(e, k - 1);
                for (int y = 0; y <= maxY; y++) {
                    int r = 1 + y; // final bag size must be at least 1 (one odd) + y evens
                    if (r > k) continue;

                    // Remaining picks to place before final bag = k - r
                    // We have remaining odds = o - 1, remaining evens = e - y
                    int remPicks = k - r;
                    int remOdds = o - 1;
                    int remEvens = e - y;

                    // We need to pick remPicks coins such that number of odds among them is even.
                    // Let z = number of odds used among remPicks. Then:
                    // 0 <= z <= min(remOdds, remPicks), z even
                    // and remPicks - z <= remEvens  -> z >= remPicks - remEvens
                    int L = Math.max(0, remPicks - remEvens); // minimal odds we must use
                    int U = Math.min(remOdds, remPicks);      // maximal odds we can use

                    if (L > U) continue; // impossible

                    // we need an even z in [L, U]
                    if ((L & 1) == 1) L++; // bump to next even
                    if (L <= U) {
                        // feasible: reserve largest odd for final bag and y top evens
                        long candidate = largestOdd + prefE[y];
                        best = Math.max(best, candidate);
                    }
                }

                sb.append(best).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
