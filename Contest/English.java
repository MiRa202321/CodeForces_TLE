import java.util.*;

public class English {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // length of string a
            String a = sc.next();
            int m = sc.nextInt(); // length of strings b and c
            String b = sc.next();
            String c = sc.next();

            StringBuilder result = new StringBuilder(a);

            for (int i = 0; i < m; i++) {
                char ch = b.charAt(i);
                if (c.charAt(i) == 'V') {
                    // Vlad adds to the beginning
                    result.insert(0, ch);
                } else {
                    // Dima adds to the end
                    result.append(ch);
                }
            }

            System.out.println(result.toString());
        }
        sc.close();
    }
}
