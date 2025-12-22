import java.util.*;
import java.io.*;

public class NIT     {
    public static void main(String[] args) {
        // Using Fast I/O for performance
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            int islands = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                
                // Count a new "island" whenever a non-zero segment starts
                if (a[i] != 0) {
                    if (i == 0 || a[i - 1] == 0) {
                        islands++;
                    }
                }
            }

            // The answer is 0, 1, or 2 (never needs more than 2)
            if (islands == 0) {
                out.println(0);
            } else if (islands == 1) {
                out.println(1);
            } else {
                out.println(2);
            }
        }
        out.flush();
    }
}