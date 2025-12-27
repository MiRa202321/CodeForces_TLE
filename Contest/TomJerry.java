// package Contest;

// import java.util.*;
// public class TomJerry {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         int t= sc.nextInt();

//         while(t-->0){
//             int n = sc.nextInt();
//             int k = sc.nextInt();

//             int[] a = new int[n];
//             int min = Integer.MAX_VALUE;
//             long sum = 0;


//             for (int i = 0; i < n; i++) {
//                 a[i] = sc.nextInt();
//                 min = Math.min(min, a[i]);
//             }



//             boolean tomCanWin = false;
//             for (int i = 0; i < n; i++) {
//                 if (a[i] > min && a[i] - 1 - min <= k) {
//                     tomCanWin = true;
//                     break;
//                 }
//             }

//             System.out.println(tomCanWin ? "Tom" : "Jerry");
//         }







//         }
//     }


















package Contest;

import java.util.*;
import java.io.*;


public class TomJerry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // number of test cases

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                min = Math.min(min, a[i]);
            }

            boolean tomCanWin = false;
            for (int i = 0; i < n; i++) {
                if (a[i] > min && a[i] - 1 - min <= k) {
                    tomCanWin = true;
                    break;
                }
            }

            System.out.println(tomCanWin ? "Tom" : "Jerry");
        }
    }
}
