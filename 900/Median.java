import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n * k];
            for (int i = 0; i < n * k; i++) {
                a[i] = sc.nextLong();
            }

            int mid = (n + 1) / 2;
            int step = n - mid + 1;

            long sum = 0;
            int pos = n * k - step;

            for (int i = 0; i < k; i++) {
                sum += a[pos];
                pos -= step;
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
