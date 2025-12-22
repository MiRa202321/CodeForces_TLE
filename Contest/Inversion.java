import java.util.*;

public class Inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int maxLeft = a[0];
            int operations = 0;
            
            for (int j = 1; j < n; j++) {
                if (a[j] < maxLeft) {
                    operations++;     // we can remove this element
                } else {
                    maxLeft = a[j];   // update running maximum
                }
            }
            
            System.out.println(operations);
        }
    }
}
