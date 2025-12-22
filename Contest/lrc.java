
package Contest;
import java.util.*;

public class lrc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> countMap = new HashMap<>();
            boolean allSame = true;

            a[0] = sc.nextInt();
            countMap.put(a[0], 1);

            for (int i = 1; i < n; i++) {
                a[i] = sc.nextInt();
                countMap.put(a[i], countMap.getOrDefault(a[i], 0) + 1);
                if (a[i] != a[0]) allSame = false;
            }

            if (allSame) {
                System.out.println("No");
                continue;
            }

            // Try placing first element into B, and rest in C until GCDs differ
            List<Integer> B = new ArrayList<>();
            List<Integer> C = new ArrayList<>();

            B.add(a[0]);

            for (int i = 1; i < n; i++) {
                C.add(a[i]);
            }

            int gcdB = B.get(0);
            for (int i = 1; i < B.size(); i++) {
                gcdB = gcd(gcdB, B.get(i));
            }

            int gcdC = C.get(0);
            for (int i = 1; i < C.size(); i++) {
                gcdC = gcd(gcdC, C.get(i));
            }

            if (gcdB != gcdC) {
                System.out.println("Yes");
                System.out.print("1 ");
                for (int i = 1; i < n; i++) {
                    System.out.print("2 ");
                }
                System.out.println();
            } else {
                // try finding a different split
                boolean found = false;
                for (int i = 1; i < n; i++) {
                    if (a[i] != a[0]) {
                        System.out.println("Yes");
                        for (int j = 0; j < n; j++) {
                            if (j == i) System.out.print("2 ");
                            else System.out.print("1 ");
                        }
                        System.out.println();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No");
                }
            }
        }

        sc.close();
    }

    // Utility method to calculate GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
