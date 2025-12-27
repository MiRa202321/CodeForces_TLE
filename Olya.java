// import java.util.*;
// import java.io.*;

// public class Olya {
//     public static void main(String[] args) throws IOException {
//         FastReader sc = new FastReader();
//         PrintWriter out = new PrintWriter(System.out);
        
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             long min1Global = Long.MAX_VALUE;
//             long min2Global = Long.MAX_VALUE;
//             long sumMin2 = 0;
            
//             for (int i = 0; i < n; i++) {
//                 int m = sc.nextInt();
//                 long m1 = Long.MAX_VALUE;
//                 long m2 = Long.MAX_VALUE;
                
//                 for (int j = 0; j < m; j++) {
//                     long val = sc.nextLong();
//                     if (val < m1) {
//                         m2 = m1;
//                         m1 = val;
//                     } else if (val < m2) {
//                         m2 = val;
//                     }
//                 }
                
//                 // Track the smallest absolute minimum across all arrays
//                 min1Global = Math.min(min1Global, m1);
//                 // Track the smallest "second minimum" to exclude it from the sum later
//                 min2Global = Math.min(min2Global, m2);
//                 // Sum up all second minimums
//                 sumMin2 += m2;
//             }
            
//             if (n == 1) {
//                 out.println(min1Global);
//             } else {
//                 // Beauty = (Total sum of min2s) - (smallest min2) + (smallest min1)
//                 long result = sumMin2 - min2Global + min1Global;
//                 out.println(result);
//             }
//         }
//         out.flush();
//     }

//     // Fast I/O for competitive programming
//     static class FastReader {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st;

//         String next() {
//             while (st == null || !st.hasMoreElements()) {
//                 try { st = new StringTokenizer(br.readLine()); }
//                 catch (IOException e) { e.printStackTrace(); }
//             }
//             return st.nextToken();
//         }

//         int nextInt() { return Integer.parseInt(next()); }
//         long nextLong() { return Long.parseLong(next()); }
//     }
// }



import java.util.*;

public class Olya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long min1Global = Long.MAX_VALUE;
            long min2Global = Long.MAX_VALUE;
            long sumMin2 = 0;

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                long[] a = new long[m];
                for (int j = 0; j < m; j++) a[j] = sc.nextLong();
                
                Arrays.sort(a); // Sort to easily get min1 and min2
                long m1 = a[0];
                long m2 = a[1];

                min1Global = Math.min(min1Global, m1);
                min2Global = Math.min(min2Global, m2);
                sumMin2 += m2;
            }

            // If only 1 array, beauty is just its minimum
            if (n == 1) {
                System.out.println(min1Global);
            } else {
                System.out.println(sumMin2 - min2Global + min1Global);
            }
        }
    }
}