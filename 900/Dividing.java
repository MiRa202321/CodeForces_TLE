import java.util.*;

public class Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Step 1: Replace all 1s with 2
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) a[i] = 2;
            }

            // Step 2: Fix divisibility
            for (int i = 0; i < n - 1; i++) {
                if (a[i + 1] % a[i] == 0) {
                    a[i + 1]++;     // add 1 operation
                }
            }

            // print result
            for (int x : a) System.out.print(x + " ");
            System.out.println();
        }
    }
}
