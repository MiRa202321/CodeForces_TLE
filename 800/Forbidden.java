import java.util.*;

public class  Forbidden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            
            if (x != 1) {
                // Use all 1's (since 1 is allowed)
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            } 
            else {
                // 1 is forbidden
                if (k == 1) {
                    System.out.println("NO");
                } 
                else if (n % 2 == 0) {
                    // Use 2's only
                    System.out.println("YES");
                    System.out.println(n / 2);
                    for (int i = 0; i < n / 2; i++) {
                        System.out.print(2 + " ");
                    }
                    System.out.println();
                } 
                else if (k >= 3) {
                    // For odd n, use one 3 and the rest 2's
                    System.out.println("YES");
                    System.out.println((n - 3) / 2 + 1);
                    System.out.print(3 + " ");
                    for (int i = 0; i < (n - 3) / 2; i++) {
                        System.out.print(2 + " ");
                    }
                    System.out.println();
                } 
                else {
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}
