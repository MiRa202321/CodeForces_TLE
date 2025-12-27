import java.util.*;

public class TooGreat {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) sc.nextInt(); // b[i] is always 1

            boolean foundGCD = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(a[i], a[j]) > 1) {
                        foundGCD = true;
                        break;
                    }
                }
                if (foundGCD) break;
            }

            if (foundGCD) {
                System.out.println(0);
                continue;
            }

            int countGreaterThan1 = 0;
            for (int x : a) if (x > 1) countGreaterThan1++;

            if (countGreaterThan1 == 0 || countGreaterThan1 == 1) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }

        sc.close();
    }
}
