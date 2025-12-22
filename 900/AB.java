import java.util.*;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            // If first and last characters match, AB = BA already
            if (s.charAt(0) == s.charAt(n - 1)) {
                System.out.println(s);
            } else {
                // Change the first character to match the last
                char[] arr = s.toCharArray();
                arr[0] = arr[n - 1];
                System.out.println(new String(arr));
            }
        }
    }
}
