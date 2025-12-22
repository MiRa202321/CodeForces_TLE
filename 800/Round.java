import java.io.*;
import java.util.*;

public class Round {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long p = 1;
            int ans = 0;
            while (p <= n) {
                long cnt = n / p;
                ans += (int)Math.min(9, cnt);
                p *= 10;
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }
}
