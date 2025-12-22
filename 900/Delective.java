import java.util.*;

public class Delective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        while (n-- > 0) {
            String s = sc.next();
            String t = sc.next();
            System.out.println(solve(s, t) ? "YES" : "NO");
        }
    }

    public static boolean solve(String s, String t) {
        // Count frequencies of each character in the target string t
        int[] targetFreq = new int[26];
        for (char c : t.toCharArray()) {
            targetFreq[c - 'A']++;
        }

        StringBuilder result = new StringBuilder();
        
        // Traverse the source string s from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int charIdx = currentChar - 'A';

            // If we still need this character for our target string
            if (targetFreq[charIdx] > 0) {
                result.append(currentChar);
                targetFreq[charIdx]--;
            } else {
                // If we don't need this character, it's "deleted".
                // However, if we encounter a character that we've already 
                // exhausted for our target, we just skip it.
            }
        }

        // The result was built backwards, so reverse it
        String finalString = result.reverse().toString();

        // If the processed string matches t, then it's possible
        return finalString.equals(t);
    }
}