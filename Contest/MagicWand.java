import java.util.*;

public class MagicWand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
            
            for (int num : a) {
                if (num % 2 == 0) even.add(num);
                else odd.add(num);
            }
            
            Collections.sort(even);
            Collections.sort(odd);
            
            int evenIdx = 0, oddIdx = 0;
            
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0)
                    a[i] = even.get(evenIdx++);
                else
                    a[i] = odd.get(oddIdx++);
            }
            
            for (int x : a)
                System.out.print(x + " ");
            System.out.println();
        }
        
        sc.close();
    }
}
