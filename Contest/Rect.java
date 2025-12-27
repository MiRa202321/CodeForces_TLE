import java.util.*;

public class Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] l = new int[3];
            int[] b = new int[3];
            for (int i = 0; i < 3; i++) {
                l[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }

            if (canFormSquare(l, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canFormSquare(int[] l, int[] b) {
        // Try all permutations (i, j, k)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) continue;
                for (int k = 0; k < 3; k++) {
                    if (k == i || k == j) continue;

                    int l1 = l[i], b1 = b[i];
                    int l2 = l[j], b2 = b[j];
                    int l3 = l[k], b3 = b[k];

                    // Layout 1: Two rectangles side by side, one on top
                    if (b1 == b2 && l1 + l2 == l3 && b1 + b3 == l3)
                        return true;

                    // Layout 2: All stacked vertically
                    if (l1 == l2 && l2 == l3 && b1 + b2 + b3 == l1)
                        return true;

                    // Layout 3: All placed horizontally
                    if (b1 == b2 && b2 == b3 && l1 + l2 + l3 == b1)
                        return true;

                    // Layout 4: One rectangle next to stack of two
                    if (l2 == l3 && b2 + b3 == b1 && l1 + l2 == b1)
                        return true;
                }
            }
        }
        return false;
    }
}
