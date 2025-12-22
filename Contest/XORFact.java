import java.util.Scanner;

public class XORFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();
            
            StringBuilder sb = new StringBuilder();
            
            if (k % 2 != 0) {
                // If k is odd, all k elements can be n.
                // n ^ n ^ ... ^ n (odd times) = n
                for (int i = 0; i < k; i++) {
                    sb.append(n);
                    if (i < k - 1) sb.append(" ");
                }
            } else {
                // If k is even, we use k-1 elements as n and the last as 0.
                // n ^ n ^ ... ^ n (odd times) ^ 0 = n ^ 0 = n
                // This gives the maximum possible sum (k-1)*n
                for (int i = 0; i < k - 1; i++) {
                    sb.append(n).append(" ");
                }
                sb.append(0);
            }
            
            System.out.println(sb.toString());
        }
        sc.close();
    }
}