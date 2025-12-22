import java.util.*;

public class YourName   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // number of test cases

        while (q-- > 0) {
            int n = sc.nextInt(); // length of strings
            String s = sc.next();
            String t = sc.next();

            char[] arrS = s.toCharArray();
            char[] arrT = t.toCharArray();

            Arrays.sort(arrS);
            Arrays.sort(arrT);

            if (Arrays.equals(arrS, arrT))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
