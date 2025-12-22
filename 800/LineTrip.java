import java.util.*;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of gas stations
            int x = sc.nextInt(); // endpoint of the trip
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            // Step 1: calculate maximum gap between consecutive stations (including 0 and x)
            int maxGap = a[0]; // distance from 0 to first station
            for (int i = 1; i < n; i++) {
                maxGap = Math.max(maxGap, a[i] - a[i - 1]);
            }

            // Step 2: consider the last part of trip (from last station to x)
            // After reaching x, you need to return to 0, so effectively double the last gap
            maxGap = Math.max(maxGap, 2 * (x - a[n - 1]));

            System.out.println(maxGap);
        }
        sc.close();
    }
}
