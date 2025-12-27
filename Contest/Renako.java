import java.util.*;

public class Renako {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int A = 0; // Ajisai indices (odd)
            int M = 0; // Mai indices (even)

            for (int i = 0; i < n; i++) {
                if ((a[i] ^ b[i]) == 1) {
                    if ((i + 1) % 2 == 1) A++;  // odd index → Ajisai
                    else M++;                  // even index → Mai
                }
            }

            if (A > M) System.out.println("Ajisai");
            else if (M > A) System.out.println("Mai");
            else System.out.println("Tie");
        }
    }
}
