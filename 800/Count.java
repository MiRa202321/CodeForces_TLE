import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int ans = -1;
            String current = x;

            // Try up to 6 operations (safe upper limit)
            for (int i = 0; i <= 6; i++) {
                if (current.contains(s)) {
                    ans = i;
                    break;
                }
                current += current; // perform one operation
            }

            System.out.println(ans);
        }
    }
}
