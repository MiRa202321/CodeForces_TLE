// // // import java.util.*;

// // // public class BeautifulString {
// // //     static boolean isPalindrome(String s) {
// // //         int i = 0, j = s.length() - 1;
// // //         while (i < j) {
// // //             if (s.charAt(i++) != s.charAt(j--)) return false;
// // //         }
// // //         return true;
// // //     }

// // //     static boolean isNonDecreasing(String s) {
// // //         for (int i = 1; i < s.length(); i++) {
// // //             if (s.charAt(i) < s.charAt(i - 1)) return false;
// // //         }
// // //         return true;
// // //     }

// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         int t = sc.nextInt();

// // //         while (t-- > 0) {
// // //             int n = sc.nextInt();
// // //             String s = sc.next();

// // //             boolean found = false;

// // //             // Try all subsequences via bitmask
// // //             for (int mask = 0; mask < (1 << n); mask++) {
// // //                 StringBuilder p = new StringBuilder();
// // //                 StringBuilder x = new StringBuilder();

// // //                 for (int i = 0; i < n; i++) {
// // //                     if ((mask & (1 << i)) != 0) {
// // //                         p.append(s.charAt(i));
// // //                     } else {
// // //                         x.append(s.charAt(i));
// // //                     }
// // //                 }

// // //                 if (isNonDecreasing(p.toString()) && isPalindrome(x.toString())) {
// // //                     List<Integer> indices = new ArrayList<>();
// // //                     for (int i = 0; i < n; i++) {
// // //                         if ((mask & (1 << i)) != 0) {
// // //                             indices.add(i + 1);
// // //                         }
// // //                     }

// // //                     System.out.println(indices.size());
// // //                     if (!indices.isEmpty()) {
// // //                         for (int i = 0; i < indices.size(); i++) {
// // //                             System.out.print(indices.get(i));
// // //                             if (i < indices.size() - 1) System.out.print(" ");
// // //                         }
// // //                         System.out.println();
// // //                     }
// // //                     found = true;
// // //                     break;
// // //                 }
// // //             }

// // //             if (!found) {
// // //                 System.out.println(-1);
// // //             }
// // //         }
// // //         sc.close();
// // //     }
// // // }

// // import java.util.ArrayList;
// // import java.util.List;
// // import java.util.Scanner;

// // public class BeautifulString {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int t = sc.nextInt();

// //         while(t-->0){
// //         int n = sc.nextInt();
// //         String s = sc.next();

// //         // boolean isBeautiful = true;
// //         int k=0;
        
// //         List<Integer> a = new ArrayList<>();

// //         for(int i=0; i<n; i++){
// //             if(s.charAt(i)=='0'){
// //                 a.add(i+1);
// //                 k++;
// //             }
// //         }

// //         if(k==0) System.out.println(-1);
// //         else{
// //             System.out.println(k);
          
// //                  for(int x: a){
// //                     System.out.print(x+" ");
// //                  }                
// //             }
         
// //         }
// //     }
// // }


import java.util.*;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    a.add(i + 1);
                }
            }

            int k = a.size();

            if (k == 0) {
                boolean palin = true;
                int l = 0, r = n - 1;

                while (l < r) {
                    if (s.charAt(l) != s.charAt(r)) {
                        palin = false;
                        break;
                    }
                    l++;
                    r--;
                }

                if (palin) System.out.println(0);
                else System.out.println(-1);

            } else {
                System.out.println(k);
                for (int x : a) System.out.print(x + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
