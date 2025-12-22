import java.util.*;

public class Ashmal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.next();
            }

            String s = "";

            for (int i = 0; i < n; i++) {
                String front = a[i] + s;
                String back = s + a[i];

                if (front.compareTo(back) < 0) {
                    s = front;
                } else {
                    s = back;
                }
            }

            System.out.println(s);
        }
        sc.close();
    }
}
