import java.util.*;

public class MergeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // coverCount[x] = number of sets containing element x
            int[] coverCount = new int[m + 1]; // 1-based indexing

            // Store sets (optional, needed for mandatory set detection)
            List<Set<Integer>> sets = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int li = sc.nextInt();
                Set<Integer> s = new HashSet<>();
                for (int j = 0; j < li; j++) {
                    int x = sc.nextInt();
                    s.add(x);
                    coverCount[x]++;
                }
                sets.add(s);
            }

            // Step 1: Check if universe is fully covered
            boolean fullCoverage = true;
            for (int i = 1; i <= m; i++) {
                if (coverCount[i] == 0) {
                    fullCoverage = false;
                    break;
                }
            }

            if (!fullCoverage) {
                System.out.println("NO");
                continue;
            }

            // Step 2: Identify mandatory sets (any element appearing in exactly 1 set)
            Set<Integer> mandatorySets = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int x : sets.get(i)) {
                    if (coverCount[x] == 1) {
                        mandatorySets.add(i);
                    }
                }
            }

            // Step 3: Check if mandatory sets alone cover all elements
            Set<Integer> unionMandatory = new HashSet<>();
            for (int idx : mandatorySets) {
                unionMandatory.addAll(sets.get(idx));
            }

            if (unionMandatory.size() == m) {
                // Mandatory sets already cover the universe
                // Now check if there is at least one extra flexible set to get ≥3 ways
                boolean flexibleExists = false;
                for (int i = 0; i < n; i++) {
                    if (!mandatorySets.contains(i)) {
                        flexibleExists = true;
                        break;
                    }
                }
                if (flexibleExists) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                // There is flexibility; more than one way to cover universe
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
