import java.util.*;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }

    private static int solve(long n) {
        int i = 1;
        while (true) {
            if (n % i != 0) return i - 1;
            i++;
        }
    }
}
