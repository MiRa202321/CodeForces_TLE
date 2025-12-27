package Contest;

import java.util.*;

public class StablePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] a = new int[n];

            // Reading the array
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Sorting the array
            Arrays.sort(a);

            // Check for at least two valid partitions
            if (a[0] + a[1] >= a[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
// time limit exceed 
// 2025 is near contest