import java.util.*;

public class Twin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = n - a[i] + 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
