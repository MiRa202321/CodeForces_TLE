import java.util.*;
//wrong
public class Expansion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
            String s = sc.next();

            long L8 = 0, L4 = 0;

            for (char c : s.toCharArray()) {
                if (c == '8') L8++;
                else L4++;
            }

            long Linf = L8;
            long L1 = L4 + L8;

            boolean ok = true;

            if (Math.abs(x) > Linf) ok = false;
            if (Math.abs(y) > Linf) ok = false;
            if (Math.abs(x) + Math.abs(y) > L1) ok = false;

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
