import java.util.Scanner;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                solve(s);
            }
        }
    }

    public static void solve(String s) {
        int count0 = 0;
        int count1 = 0;

        // Step 1: Count total 0s and 1s available
        for (char c : s.toCharArray()) {
            if (c == '0') count0++;
            else count1++;
        }

        // Step 2: Iterate through s and try to place the opposite character
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                // We need a '1' to make it good (t_i != s_i)
                if (count1 > 0) {
                    count1--;
                } else {
                    // No more '1's left to oppose this '0'
                    break;
                }
            } else {
                // We need a '0' to make it good
                if (count0 > 0) {
                    count0--;
                } else {
                    // No more '0's left to oppose this '1'
                    break;
                }
            }
        }

        // The remaining characters from index i to the end must be deleted
        System.out.println(s.length() - i);
    }
}