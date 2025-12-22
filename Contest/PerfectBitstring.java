


import java.util.*;

public class PerfectBitstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            // Add all 1s first
            for (int i = 0; i < k; i++) {
                sb.append('1');
            }

            // Fill the rest with 0s
            for (int i = k; i < n; i++) {
                sb.append('0');
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}

