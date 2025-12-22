import java.util.*;

public class Unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int neg = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == -1) neg++;
            }

            int pos = n - neg;
            int ops = 0;

            // 1️⃣ Make sum >= 0
            if (neg > pos) {
                ops = (neg - pos + 1) / 2;  // ceil((neg - pos)/2)
                neg -= ops;
                pos += ops;
            }

            // 2️⃣ Make product = 1
            if (neg % 2 != 0) {
                ops++;
            }

            System.out.println(ops);
        }

        sc.close();
    }
}
