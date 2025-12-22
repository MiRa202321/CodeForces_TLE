import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            // A solution exists if:
            // 1. There is enough space in the middle to enforce the required differences.
            //    The required middle space is n - (a + b) positions. We need at least 2:
            //    n - (a + b) >= 2  =>  a + b <= n - 2
            // 2. OR, if the permutations are required to be identical, and 
            //    the required LCP/LCS are also 'n' (the maximum possible).
            //    This is the case a = n AND b = n.
            
            if (a == n && b == n) {
                // Case: n=2, a=2, b=2. p=q=[1, 2]. LCP=2, LCS=2. Correct.
                System.out.println("Yes");
            } else if (a + b <= n - 2) {
                // Case: n=4, a=1, b=1. a+b=2. 2 <= 4-2. Correct.
                System.out.println("Yes");
            } else {
                // All other cases (a+b = n-1, a+b = n, a+b > n, but not a=b=n) fail.
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}