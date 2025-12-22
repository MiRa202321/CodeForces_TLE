import java.util.*;

public class Notelock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            System.out.println(minProtect(s, n, k));
        }
        sc.close();
    }

    static int minProtect(String s, int n, int k) {
        int lastKept = Integer.MIN_VALUE / 2; // index of last '1' that will remain (protected or guaranteed)
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                // if there's no kept 1 among previous k-1 positions, we must protect this one
                if (i - lastKept >= k) {
                    ans++;
                    lastKept = i; // we protected this one -> it's kept
                } else {
                    // this '1' will stay because a kept 1 exists in the previous k-1 window
                    lastKept = i; // still becomes the most recent kept 1
                }
            }
        }
        return ans;
    }
}
