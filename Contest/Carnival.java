import java.util.*;

public class Carnival {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int g = gcd(l, b);
            int steps = l / g;

            int pos = a;
            int ans = a;

            for (int i = 0; i < steps; i++) {
                ans = Math.max(ans, pos);
                pos = (pos + b) % l;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
