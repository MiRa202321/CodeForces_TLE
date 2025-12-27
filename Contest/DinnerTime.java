

// // import java.util.*;

// // public class DinnerTime {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int t = sc.nextInt();

// //         while (t-- > 0) {
// //             int n = sc.nextInt();
// //             int m = sc.nextInt();
// //             int p = sc.nextInt();
// //             int q = sc.nextInt();

// //             if ((n - p + 1) <= m && ( m- (n - p + 1) )% 1 ==0) {
// //                 System.out.println("YES");
                
// //             }
// //              else {
// //                 System.out.println("NO");
// //             }
// //         }
// //     }
// // }


// import java.util.Scanner;

// public class DinnerTime {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt(); // number of test cases
        
//         for (int i = 0; i < t; i++) {
//             int n = scanner.nextInt();
//             int m = scanner.nextInt();
//             int p = scanner.nextInt();
//             int q = scanner.nextInt();
            
//             // Calculate the number of segments
//             int k = n - p + 1;
//             // Calculate the total sum of all segments
//             int totalSegmentSum = k * q;
            
//             // Check the conditions
//             if (totalSegmentSum <= m && (m - totalSegmentSum) % 1 == 0) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
        
//         scanner.close();
//     }
// }




import java.util.Scanner;

public class DinnerTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            int fullReps = n / p;
            int leftover = n % p;

            if (leftover == 0) {
                // leftover = 0 means array is full repeats of the first p elements
                if (m == fullReps * q) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                // leftover > 0 means partial repetition with flexibility, so always YES
                System.out.println("YES");
            }
        }

        scanner.close();
    }
}

