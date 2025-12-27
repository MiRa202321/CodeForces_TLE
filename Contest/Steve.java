import java.util.*;

public class Steve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Set<Integer> set = new HashSet<>();
            boolean ok = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (set.contains(a[i])) {
                    ok = true;
                }
                set.add(a[i]);
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
