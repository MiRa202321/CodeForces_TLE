import java.util.*;

public class Secret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> ans = new ArrayList<>();
            
            for (int k = 1; k <= 18; k++) {
                long div = (long) Math.pow(10, k) + 1;
                if (div > n) break;  // no need to check further
                if (n % div == 0) ans.add(n / div);
            }
            
            if (ans.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(ans);
                System.out.print(ans.size() + "\n");
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i));
                    if (i + 1 < ans.size()) System.out.print(" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
