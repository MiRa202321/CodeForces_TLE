import java.util.*;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] pref = new int[n];
            int[] suff = new int[n];

            boolean[] seen = new boolean[26];
            int cnt = 0;

            // prefix distinct count
            for (int i = 0; i < n; i++) {
                int idx = s.charAt(i) - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    cnt++;
                }
                pref[i] = cnt;
            }

            Arrays.fill(seen, false);
            cnt = 0;

            // suffix distinct count
            for (int i = n - 1; i >= 0; i--) {
                int idx = s.charAt(i) - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    cnt++;
                }
                suff[i] = cnt;
            }

            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, pref[i] + suff[i + 1]);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
