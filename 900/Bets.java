import java.util.*;

public class Bets {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);

            if (a == b) {
                sb.append("0 0\n");
                continue;
            }

            long d = Math.abs(a - b);
            long rem = a % d;

            long moves = Math.min(rem, d - rem);
            sb.append(d).append(" ").append(moves).append("\n");
        }

        System.out.print(sb.toString());
    }
}
