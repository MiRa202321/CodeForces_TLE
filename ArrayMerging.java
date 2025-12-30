import java.io.*;
import java.util.*;

public class ArrayMerging {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int size = 2 * n + 1;

            int[] maxA = new int[size];
            int[] maxB = new int[size];

            process(br.readLine(), maxA);
            process(br.readLine(), maxB);

            int ans = 0;
            for (int i = 1; i < size; i++) {
                ans = Math.max(ans, maxA[i] + maxB[i]);
            }

            out.append(ans).append('\n');
        }

        System.out.print(out.toString());
    }

    private static void process(String line, int[] maxCnt) {
        StringTokenizer st = new StringTokenizer(line);
        int prev = -1, count = 0;

        while (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            if (x == prev) {
                count++;
            } else {
                if (prev != -1) {
                    maxCnt[prev] = Math.max(maxCnt[prev], count);
                }
                prev = x;
                count = 1;
            }
        }
        maxCnt[prev] = Math.max(maxCnt[prev], count);
    }
}
