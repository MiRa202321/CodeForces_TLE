import java.util.*;

public class Balanced{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Step 1: Count frequencies of each element
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int x : a) {
                freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
            }

            // Step 2: Collect frequencies
            List<Integer> freqList = new ArrayList<>(freqMap.values());

            // Step 3: Try all possible k values
            int maxLen = 0;
            int maxFreq = Collections.max(freqList);
            for (int k = 1; k <= maxFreq; k++) {
                int groups = 0;
                for (int f : freqList) {
                    if (f >= k) groups++;
                }
                maxLen = Math.max(maxLen, k * groups);
            }

            // Step 4: Print result for this test case
            System.out.println(maxLen);
        }
        sc.close();
    }
}
