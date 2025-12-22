import java.util.*;

public class Grasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();

            long mod = n % 4;

            if (mod == 1) {
                x += (x % 2 == 0) ? -n : n;
            } else if (mod == 2) {
                x += (x % 2 == 0) ? 1 : -1;
            } else if (mod == 3) {
                x += (x % 2 == 0) ? (n + 1) : -(n + 1);
            }

            System.out.println(x);
        }
    }
}
