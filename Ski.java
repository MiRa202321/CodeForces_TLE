import java.util.*;

public class Ski {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long q = sc.nextLong();

            long ans = 0;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                long temp = sc.nextLong();
                if (temp <= q) {
                    cnt++;
                } else {
                    if (cnt >= k) {
                        long x = cnt - k + 1;
                        ans += x * (x + 1) / 2;
                    }
                    cnt = 0;
                }
            }

            // process last segment
            if (cnt >= k) {
                long x = cnt - k + 1;
                ans += x * (x + 1) / 2;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
