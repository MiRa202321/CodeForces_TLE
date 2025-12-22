import java.util.*;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            
            if (!sorted) {
                System.out.println(0);
                continue;
            }
            
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                minDiff = Math.min(minDiff, a[i + 1] - a[i]);
            }
            
            System.out.println(minDiff / 2 + 1);
        }
        sc.close();
    }
}
