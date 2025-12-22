import java.util.*;

public class Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            Arrays.sort(a);

            int longest = 1;
            int current = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k) {
                    current++;
                } else {
                    longest = Math.max(longest, current);
                    current = 1;
                }
            }
            longest = Math.max(longest, current);

            System.out.println(n - longest);
        }
    }
}
