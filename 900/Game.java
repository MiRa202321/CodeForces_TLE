import java.util.*;

public class Game   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int cnt0 = 0, cnt1 = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') cnt0++;
                else cnt1++;
            }

            if (Math.min(cnt0, cnt1) % 2 == 1) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        sc.close();
    }
}
