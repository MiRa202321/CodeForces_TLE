import java.util.*;

public class Goals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();  // number of teams
            int[] a = new int[n - 1];  // efficiencies of n-1 teams
            
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            
            // Since total efficiency = 0, missing team's efficiency = -sum
            System.out.println(-sum);
        }
        sc.close();
    }
}
