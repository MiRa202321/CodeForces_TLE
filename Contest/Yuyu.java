import java.util.*;

public class Yuyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            // Step 1: fix endpoints a[0], a[n-1]
            if (a[0] == -1 && a[n - 1] == -1) {
                a[0] = 0;
                a[n - 1] = 0;
            } else if (a[0] == -1) {
                a[0] = a[n - 1];
            } else if (a[n - 1] == -1) {
                a[n - 1] = a[0];
            }
            
            // Step 2: Fill all remaining -1's (internal positions) with 0
            for (int i = 0; i < n; i++) {
                if (a[i] == -1) a[i] = 0;
            }
            
            // The objective value is |a[n-1] - a[0]|
            int ans = Math.abs(a[n - 1] - a[0]);
            System.out.println(ans);
            
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
                if (i + 1 < n) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
