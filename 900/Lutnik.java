import java.util.*;
 
public class Lutnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            long cnt0 = 0;
            long cnt1 = 0;
            
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                if (x == 0) cnt0++;
                if (x == 1) cnt1++;
            }
            
            if (cnt1 == 0) {
                System.out.println(0);
            } else {
                System.out.println(cnt1 * (1L << cnt0));
            }
        }
    }
}
