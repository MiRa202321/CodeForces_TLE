import java.util.*;

public class Shifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            List<Integer> ones = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') ones.add(i);
            }

            int m = ones.size();

            // If all are already 1
            if (m == n) {
                System.out.println(0);
                continue;
            }

            int result = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {

                    // binary search for insertion point of i in ones list
                    int pos = Collections.binarySearch(ones, i);
                    if (pos < 0) pos = -pos - 1;

                    int dist1, dist2;

                    // next 1 (pos or wrap to 0)
                    int nextIdx = (pos < m) ? ones.get(pos) : ones.get(0);
                    dist1 = (i - nextIdx + n) % n; // distance from that 1 to i

                    // previous 1 (pos-1 or wrap to m-1)
                    int prevIdx = (pos > 0) ? ones.get(pos - 1) : ones.get(m - 1);
                    dist2 = (i - prevIdx + n) % n; // distance from that 1 to i

                    int best = Math.min(dist1, dist2);
                    result = Math.max(result, best);
                }
            }

            System.out.println(result);
        }
    }
}
