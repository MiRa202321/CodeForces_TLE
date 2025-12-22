// import java.util.Scanner;

// public class Trippi {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int t= sc.nextInt();

//        for(int i=1;i<=t;i++){
//             String st= sc.nextLine();
//             String res="";


//                if (!st.isEmpty()) {
//                 String[] w = st.split("\\s+");
//             String[] w= st.split(" ");

//             for(String word: w){
//                 res= res+ word.charAt(0);
//             }

//             System.out.println(res);

//         }
//     }
// }





import java.util.Scanner;

public class Trippi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Read full line or do sc.nextInt(); sc.nextLine();

        for (int i = 1; i <= t; i++) {
            String st = sc.nextLine().trim();
            String res = "";

            if (!st.isEmpty()) {
                String[] w = st.split("\\s+"); // handles multiple spaces

                for (String word : w) {
                    if (!word.isEmpty()) {
                        res += word.charAt(0);
                    }
                }
            }

            System.out.println(res);
        }

        sc.close();
    }
}
