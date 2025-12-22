import java.util.*;

public class United {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            
            // If all elements are same, no valid partition
            if (a[0] == a[n - 1]) {
                System.out.println(-1);
                continue;
            }
            
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            
            int minVal = a[0];
            for (int x : a) {
                if (x == minVal) b.add(x);
                else c.add(x);
            }
            
            System.out.println(b.size() + " " + c.size());
            for (int x : b) System.out.print(x + " ");
            System.out.println();
            for (int x : c) System.out.print(x + " ");
            System.out.println();
        }
        
        sc.close();
    }
}
