import java.util.Scanner;
import java.lang.Math;

public class Jellyfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Read input for each test case: a, b, and n
            // Use long for a and b as they can be up to 10^9
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            // Read the tool values x_i
            // We don't need to sort the tools as the order of use doesn't matter
            // as long as each is used optimally (at timer=1)
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }

            // The total maximum time starts with the initial timer value 'b'
            // We use long for the answer as the total time can be very large
            long maxTime = b;

            // Iterate through all tools and calculate the net time gain from each
            for (long xi : x) {
                // When the timer hits 1, we use tool xi.
                // The new timer value becomes: min(1 + xi, a)
                long newTimerValue = Math.min(1 + xi, a);

                // The net time gained from this tool is the new timer value minus
                // the 1 second that was already counted for the tick just before
                // the tool was used.
                long netGain = newTimerValue - 1;
                
                maxTime += netGain;
            }

            // A mathematically equivalent and slightly cleaner formula is:
            // T = (b - 1) + sum(min(1 + xi, a))
            // The first formula is: T = b + sum(min(1 + xi, a) - 1)
            // Both are correct. Let's stick to the one derived in the analysis:
            // maxTime = b + sum(min(1 + xi, a) - 1)

            System.out.println(maxTime);
        }
        sc.close();
    }
}