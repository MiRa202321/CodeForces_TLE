import java.util.*;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            List<Integer> a = new ArrayList<>();
            a.add(b[0]);

            for (int i = 1; i < n; i++) {
                if (b[i] >= b[i - 1]) {
                    a.add(b[i]);
                } else {
                    a.add(1);    // add smaller element to simulate drop
                    a.add(b[i]);
                }
            }

            System.out.println(a.size());
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
