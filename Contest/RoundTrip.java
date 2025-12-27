import java.io.*;
import java.util.*;

public class RoundTrip {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split("\\s+");
            long R = Long.parseLong(parts[0]);
            long X = Long.parseLong(parts[1]);
            long D = Long.parseLong(parts[2]);
            int n = Integer.parseInt(parts[3]);
            String s = br.readLine().trim();
            int ans = 0;
            for (int i = 0; i < n; ++i) {
                char c = s.charAt(i);
                if (c == '1') {
                    // always rated
                    ans++;
                    R = Math.max(0L, R - D);
                } else { // '2'
                    if (R < X) {
                        // rated for Vasya
                        ans++;
                        R = Math.max(0L, R - D);
                    }
                    // else unrated: R unchanged
                }
            }
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }
}
