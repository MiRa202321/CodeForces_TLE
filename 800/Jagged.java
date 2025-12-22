import java.util.*;

public class Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            if(a[0]==1) System.out.println("Yes");
            else System.out.println("No");

            }
        }
    }
    //         boolean changed;
    //         do {
    //             changed = false;
    //             for (int i = 1; i < n - 1; i++) {
    //                 if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
    //                     int temp = a[i];
    //                     a[i] = a[i + 1];
    //                     a[i + 1] = temp;
    //                     changed = true;
    //                 }
    //             }
    //         } while (changed);
            
    //         if (isSorted(a))
    //             System.out.println("YES");
    //         else
    //             System.out.println("NO");
    //     }
    //     sc.close();
    // }

    // private static boolean isSorted(int[] a) {
    //     for (int i = 1; i < a.length; i++)
    //         if (a[i] < a[i - 1])
    //             return false;
    //     return true;
    // }

