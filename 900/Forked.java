import java.util.*;

public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long xK = sc.nextLong();
            long yK = sc.nextLong();

            long xQ = sc.nextLong();
            long yQ = sc.nextLong();

            long[][] moves = {
                    { a,  b}, { a, -b},
                    {-a,  b}, {-a, -b},
                    { b,  a}, { b, -a},
                    {-b,  a}, {-b, -a}
            };

            Set<Long> kingSet = new HashSet<>();
            Set<Long> queenSet = new HashSet<>();

            // Possible knight positions that attack king
            for (long[] m : moves) {
                long x = xK + m[0];
                long y = yK + m[1];
                kingSet.add(hash(x, y));
            }

            // Possible knight positions that attack queen
            for (long[] m : moves) {
                long x = xQ + m[0];
                long y = yQ + m[1];
                queenSet.add(hash(x, y));
            }

            int count = 0;
            for (long pos : kingSet) {
                if (queenSet.contains(pos)) count++;
            }

            System.out.println(count);
        }
    }

    // Perfect hashing for pair (x, y)
    private static long hash(long x, long y) {
        return (x << 32) ^ (y & 0xffffffffL);
    }
}
