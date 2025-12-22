import java.io.*;

public class Connected {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            char[][] g = new char[n][n];
            boolean hasBlack = false, invalid = false;

            for (int i = 0; i < n; i++) {
                g[i] = br.readLine().trim().toCharArray();
                for (char c : g[i]) if (c == '#') hasBlack = true;
            }

            if (!hasBlack) {
                out.append("YES\n");
                continue;
            }

            for (int i = 0; i < n && !invalid; i++) {
                for (int j = 0; j < n && !invalid; j++) {
                    if (g[i][j] == '#') {
                        // Check 3 in a row horizontally
                        if (j + 2 < n && g[i][j + 1] == '#' && g[i][j + 2] == '#') invalid = true;
                        // Check 3 in a row vertically
                        if (i + 2 < n && g[i + 1][j] == '#' && g[i + 2][j] == '#') invalid = true;
                        // Check pattern #.# horizontally
                        if (j + 2 < n && g[i][j + 1] == '.' && g[i][j + 2] == '#') invalid = true;
                        // Check pattern #.# vertically
                        if (i + 2 < n && g[i + 1][j] == '.' && g[i + 2][j] == '#') invalid = true;
                    }
                }
            }

            out.append(invalid ? "NO\n" : "YES\n");
        }

        System.out.print(out);
    }
}
