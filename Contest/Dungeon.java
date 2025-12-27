import java.util.*;

public class Dungeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int deletions = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int x = entry.getKey();
                int f = entry.getValue();

                if (x == 0) {
                    // 0 must not appear
                    deletions += f;
                } else if (f >= x) {
                    // Keep x occurrences, delete extra
                    deletions += (f - x);
                } else {
                    // Cannot reach x occurrences → delete all
                    deletions += f;
                }
            }

            System.out.println(deletions);
        }
    }
}
