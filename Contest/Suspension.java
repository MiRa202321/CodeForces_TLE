import java.util.*;

public class Suspension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();
            
            int maxSuspended = Math.min(n, r + y / 2);
            System.out.println(maxSuspended);
        }
        
        sc.close();
    }
}
