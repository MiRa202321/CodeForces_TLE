// import java.io.*;
// import java.util.*;

// public class Zigzag {
//     public static void main(String[] args) throws Exception {
//         FastScanner fs = new FastScanner(System.in);
//         int t = fs.nextInt();
//         StringBuilder out = new StringBuilder();
//         while (t-- > 0) {
//             int n = fs.nextInt();
//             long[] a = new long[n];
//             for (int i = 0; i < n; i++) a[i] = fs.nextLong();
//             out.append(minDecreases(a)).append('\n');
//         }
//         System.out.print(out.toString());
//     }

//     static long minDecreases(long[] a) {
//         int n = a.length;
//         // prefix max
//         long[] p = new long[n];
//         long cur = Long.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             cur = Math.max(cur, a[i]);
//             p[i] = cur;
//         }

//         // peaks are at 1-based even indices => 0-based odd indices
//         int peakParity = 1; // 0-based index %2 == 1 are peaks
//         long[] b = new long[n];
//         // initialize peaks to p[i]
//         for (int i = 0; i < n; i++) {
//             if ((i & 1) == peakParity) b[i] = p[i];
//             else b[i] = Long.MIN_VALUE; // marker for valley not yet assigned
//         }
//         // assign valleys
//         for (int i = 0; i < n; i++) {
//             if (b[i] != Long.MIN_VALUE) continue; // already peak
//             long leftPeak = Long.MAX_VALUE;
//             long rightPeak = Long.MAX_VALUE;
//             if (i - 1 >= 0 && ((i - 1) & 1) == peakParity) leftPeak = b[i - 1];
//             if (i + 1 < n && ((i + 1) & 1) == peakParity) rightPeak = b[i + 1];
//             long mn = Math.min(leftPeak, rightPeak);
//             if (mn == Long.MAX_VALUE) {
//                 // no neighboring peak, valley can be as large as p[i]
//                 b[i] = p[i];
//             } else {
//                 long target = mn - 1;
//                 if (target < 0) target = 0;
//                 b[i] = Math.min(p[i], target);
//             }
//         }

//         long cost = 0L;
//         for (int i = 0; i < n; i++) {
//             if (a[i] > b[i]) cost += (a[i] - b[i]);
//         }
//         return cost;
//     }

//     // fast scanner
//     static class FastScanner {
//         BufferedReader br;
//         StringTokenizer st;
//         FastScanner(InputStream is) {
//             br = new BufferedReader(new InputStreamReader(is));
//         }
//         FastScanner() { this(System.in); }
//         String next() throws IOException {
//             while (st == null || !st.hasMoreElements()) {
//                 String line = br.readLine();
//                 if (line == null) return null;
//                 st = new StringTokenizer(line);
//             }
//             return st.nextToken();
//         }
//         int nextInt() throws IOException { return Integer.parseInt(next()); }
//         long nextLong() throws IOException { return Long.parseLong(next()); }
//     }
// }

import java.util.Scanner;

public class Zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while (t-- >0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
           
            int ma = a[0];
            int ans = 0;

            for(int i=1; i<n;i++){
                if( i %2 !=0){  // zero indexing odd indexing hwnce, even pos in 1 indexing
                    a[i] = Math.max(a[i], ma);

                }
                ma = Math.max(ma,a[i]);
            }

            for(int i=0; i<n;i +=2){
                int mi = Integer.MAX_VALUE;
                if(i-1 >=0) mi = Math.min(mi, a[i-1]);  


                if(i+1 < n) mi = Math.min(mi, a[i+1]);

                if(a[i] >= mi){
                    ans += (a[i] - mi +1);
                    
                }
            }   
            System.out.println(ans);
    }
}
}