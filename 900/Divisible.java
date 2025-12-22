import java.util.*;

public class Divisible {
    static int solve(String s, char x, char y) {
        int n = s.length();
        int posY = -1;

        // find y from the back
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == y) {
                posY = i;
                break;
            }
        }
        if (posY == -1) return (int)1e9; // impossible

        // find x before y
        int posX = -1;
        for (int i = posY - 1; i >= 0; i--) {
            if (s.charAt(i) == x) {
                posX = i;
                break;
            }
        }
        if (posX == -1) return (int)1e9; // impossible

        // removals between X and Y + after Y
        return (posY - posX - 1) + (n - 1 - posY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            int ans = Integer.MAX_VALUE;
            ans = Math.min(ans, solve(s, '0', '0'));
            ans = Math.min(ans, solve(s, '2', '5'));
            ans = Math.min(ans, solve(s, '5', '0'));
            ans = Math.min(ans, solve(s, '7', '5'));

            System.out.println(ans);
        }
    }
}
