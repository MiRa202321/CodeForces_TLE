import java.util.*;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int xorAll = 0;

            for (int i = 0; i < n; i++) {
                xorAll ^= sc.nextInt();
            }

            if (n % 2 == 0) {
                if (xorAll == 0)
                    System.out.println(0);
                else
                    System.out.println(-1);
            } else {
                System.out.println(xorAll);
            }
        }

        sc.close();
    }
}
