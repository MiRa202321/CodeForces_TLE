import java.util.*;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            // Impossible cases:
            // - odd n (sum of even wheels can't be odd)
            // - n == 2 (cannot be written as 4x + 6y)
            if (n % 2 == 1 || n == 2) {
                System.out.println(-1);
                continue;
            }

            long minBuses = (n + 5) / 6; // ceil(n / 6)
            long maxBuses = n / 4;       // floor(n / 4)

            System.out.println(minBuses + " " + maxBuses);
        }
    }
}
