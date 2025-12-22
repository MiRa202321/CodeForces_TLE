import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                max = Math.max(max, x);
            }
            
            System.out.println(max);
        }
        
        sc.close();
    }
}
