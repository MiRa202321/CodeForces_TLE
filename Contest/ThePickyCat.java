import java.util.Scanner;

public class ThePickyCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int _t = 0; _t < t; _t++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int median_pos = (n + 1) / 2; // ceiling of n/2
            int absA1 = Math.abs(a[0]);

            int lessCount = 0;

            for (int i = 1; i < n; i++) {
                int absVal = Math.abs(a[i]);
                if (absVal < absA1) {
                    lessCount++;
                }
            }

            if (lessCount <= median_pos - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}

