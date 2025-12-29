import java.util.*;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int prodMod = 1;
            for (int x : a) {
                prodMod = (prodMod * (x % k)) % k;
            }

            if (prodMod == 0) {
                System.out.println(0);
                continue;
            }

            int ans = Integer.MAX_VALUE;

            // try making one element divisible by k
            for (int x : a) {
                int need = (k - (x % k)) % k;
                ans = Math.min(ans, need);
            }

            // special handling for k = 4
            if (k == 4) {
                int cnt2 = 0;
                for (int x : a) {
                    if (x % 2 == 0) cnt2++;
                }
                if (cnt2 >= 2) ans = 0;
                else if (cnt2 == 1) ans = Math.min(ans, 1);
                else ans = Math.min(ans, 2);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
