import java.util.*;

public class Rae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();

            int maxSeen = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                maxSeen = Math.max(maxSeen, p[i]);
                // i is 0-based, so prefix length = i+1
                if (maxSeen > i + 2) { 
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "Yes" : "No");
        }
    }
}
