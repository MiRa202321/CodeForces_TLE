import java.util.*;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            long ops = 0;
            boolean possible = true;
            
            // Process from right to left
            for (int i = n - 2; i >= 0; i--) {
                while (a[i] >= a[i + 1] && a[i] > 0) {
                    a[i] /= 2;
                    ops++;
                }
                if (a[i] >= a[i + 1]) {
                    possible = false;
                    break;
                }
            }
            
            System.out.println(possible ? ops : -1);
        }
    }
}
