import java.util.*;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            if (n % 2 == 0) {
                // n is even → 3 operations on full range
                System.out.println(3);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
            } else {
                // n is odd → 4 operations
                System.out.println(4);
                System.out.println(1 + " " + (n - 1));
                System.out.println(1 + " " + (n - 1));
                System.out.println((n - 1) + " " + n);
                System.out.println((n - 1) + " " + n);
            }
        }
    }
}
