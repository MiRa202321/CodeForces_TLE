import java.util.*;

public class Editing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n-- > 0) {
            String s = sc.next();
            String t = sc.next();

            if (canTransform(s, t)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }

    private static boolean canTransform(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 && j >= 0) {
            if (s.charAt(i) == t.charAt(j)) {
                i--;
                j--;
            } else {
                i--; // delete s[i]
            }
        }

        return (j < 0); // matched entire t
    }
}
