import java.util.*;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            if (c == 'g') {
                System.out.println(0);
                continue;
            }

            String doubled = s + s;
            int len = doubled.length();
            int[] nextGreen = new int[len];

            int next = Integer.MAX_VALUE;
            for (int i = len - 1; i >= 0; i--) {
                if (doubled.charAt(i) == 'g') {
                    next = i;
                }
                nextGreen[i] = next;
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    ans = Math.max(ans, nextGreen[i] - i);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
