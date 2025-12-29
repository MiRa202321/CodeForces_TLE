import java.util.*;

public class Helmet {
    static class Resident {
        int a, b;
        Resident(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long p = sc.nextLong();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            List<Resident> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new Resident(a[i], b[i]));
            }

            // Sort by increasing sharing cost
            list.sort(Comparator.comparingInt(r -> r.b));

            long cost = p;          // Inform one person initially
            long informed = 1;      // Number of people informed

            for (Resident r : list) {
                if (informed >= n) break;
                if (r.b >= p) break;

                long canShare = Math.min(r.a, n - informed);
                cost += canShare * r.b;
                informed += canShare;
            }

            // Remaining people informed directly
            if (informed < n) {
                cost += (n - informed) * p;
            }

            System.out.println(cost);
        }
        sc.close();
    }
}
