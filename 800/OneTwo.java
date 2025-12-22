import java.util.*;

public class OneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            int totalTwos = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 2) totalTwos++;
            }

            if (totalTwos % 2 == 1) {
                System.out.println(-1);
                continue;
            }

            int need = totalTwos / 2;
            int prefixTwos = 0;
            int k = -1;

            for (int i = 0; i < n - 1; i++) {  // k must be 1..n-1
                if (a[i] == 2) prefixTwos++;
                if (prefixTwos == need) {
                    k = i + 1;  // convert index to position
                    break;
                }
            }

            System.out.println(k);
        }
    }
}
