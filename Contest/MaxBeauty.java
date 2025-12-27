import java.util.*;

public class MaxBeauty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            int[] bitCounts = new int[n];
            long totalBeauty = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                bitCounts[i] = Integer.bitCount(a[i]);
                totalBeauty += bitCounts[i];
            }

            // Priority queue for best (cost, index, gain) operations
            PriorityQueue<Step> pq = new PriorityQueue<>(new Comparator<Step>() {
                public int compare(Step x, Step y) {
                    return Long.compare(x.cost, y.cost);
                }
            });

            for (int i = 0; i < n; i++) {
                int current = a[i];
                int currentBit = Integer.bitCount(current);

                // Try to find first point where bit count increases
                for (int j = 1; j <= 60; j++) {
                    int next = current + j;
                    int nextBit = Integer.bitCount(next);
                    if (nextBit > currentBit) {
                        pq.add(new Step(j, i, nextBit - currentBit));
                        break;
                    }
                }
            }

            while (!pq.isEmpty() && k > 0) {
                Step s = pq.poll();
                if (s.cost > k) break;

                k -= s.cost;
                totalBeauty += s.gain;

                // Update a[i]
                a[s.index] += s.cost;

                // Look for next possible bitcount increase from new value
                int newBit = Integer.bitCount(a[s.index]);
                for (int j = 1; j <= 60; j++) {
                    int next = a[s.index] + j;
                    int nextBit = Integer.bitCount(next);
                    if (nextBit > newBit) {
                        pq.add(new Step(j, s.index, nextBit - newBit));
                        break;
                    }
                }
            }

            System.out.println(totalBeauty);
        }

        sc.close();
    }

    static class Step {
        long cost;
        int index;
        int gain;

        Step(long cost, int index, int gain) {
            this.cost = cost;
            this.index = index;
            this.gain = gain;
        }
    }
}
