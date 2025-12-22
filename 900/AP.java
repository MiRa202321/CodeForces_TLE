import java.util.*;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (canMakeAP(a, b, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canMakeAP(long a, long b, long c) {
        // Case 1: multiply a
        long m1 = 2 * b - c;
        if (m1 > 0 && m1 % a == 0) return true;

        // Case 2: multiply b
        long m2 = a + c;
        if (m2 % (2 * b) == 0) return true;

        // Case 3: multiply c
        long m3 = 2 * b - a;
        if (m3 > 0 && m3 % c == 0) return true;

        return false;
    }
}
