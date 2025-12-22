import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];

            for (int i = 1; i <= n; i++) 
                p[i] = sc.nextInt();

            int g = 0;
            for (int i = 1; i <= n; i++) {
                if (p[i] != i) {
                    g = gcd(g, Math.abs(i - p[i]));
                }
            }

            System.out.println(g);
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
