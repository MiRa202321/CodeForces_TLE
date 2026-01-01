import java.util.*;

public class MinLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (n % 2 == 0) {
                System.out.println(n / 2 + " " + n / 2);
            } else {
                long a = 1;

                for (long i = 3; i * i <= n; i += 2) {
                    if (n % i == 0) {
                        a = n / i;
                        break;
                    }
                }

                System.out.println(a + " " + (n - a));
            }
        }
        sc.close();
    }
}
