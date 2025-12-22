import java.util.*;

public class  Comparison   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int maxRun = 1;
            int curr = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    curr++;
                } else {
                    maxRun = Math.max(maxRun, curr);
                    curr = 1;
                }
            }

            maxRun = Math.max(maxRun, curr);

            System.out.println(maxRun + 1);
        }

        sc.close();
    }
}
