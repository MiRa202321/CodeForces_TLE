import java.util.*;

public class Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            boolean found = false;

            for (int j = 1; j < n - 1 && !found; j++) {
                int iIndex = -1;
                int kIndex = -1;

                // find i < j such that p[i] < p[j]
                for (int i = 0; i < j; i++) {
                    if (p[i] < p[j]) {
                        iIndex = i;
                        break;
                    }
                }

                // find k > j such that p[k] < p[j]
                for (int k = j + 1; k < n; k++) {
                    if (p[k] < p[j]) {
                        kIndex = k;
                        break;
                    }
                }

                if (iIndex != -1 && kIndex != -1) {
                    System.out.println("YES");
                    // +1 because indices are 1-based
                    System.out.println((iIndex + 1) + " " + (j + 1) + " " + (kIndex + 1));
                    found = true;
                }
            }

            if (!found) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
