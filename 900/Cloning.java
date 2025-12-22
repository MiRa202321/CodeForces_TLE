import java.util.*;

public class Cloning   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Map<Integer, Integer> freq = new HashMap<>();
            int maxFreq = 0;

            for (int x : a) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(x));
            }

            int cnt = maxFreq;
            int left = n - cnt;
            int ops = 0;

            while (left > 0) {
                ops++;                         // clone
                int take = Math.min(cnt, left);
                ops += take;                   // swaps
                cnt += take;
                left -= take;
            }

            System.out.println(ops);
        }
    }
}
