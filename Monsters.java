import java.util.*;

public class Monsters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] a = new int[n][2];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int rem = x % k;
                if (rem == 0) rem = k;
                a[i][0] = rem;
                a[i][1] = i + 1;
            }

            Arrays.sort(a, (p, q) -> {
                if (p[0] != q[0]) return q[0] - p[0]; // higher remainder first
                return p[1] - q[1];                  // smaller index first
            });

            for (int i = 0; i < n; i++) {
                System.out.print(a[i][1] + " ");
            }
            System.out.println();
        }
    }
}
