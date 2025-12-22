import java.util.*;

public class Villagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] g = new long[n];
            
            long sum = 0;
            long gmin = Long.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                g[i] = sc.nextLong();
                sum += g[i];
                gmin = Math.min(gmin, g[i]);
            }
            
            long result = sum + (n - 2) * gmin;
            System.out.println(result);
        }
        
        sc.close();
    }
}
