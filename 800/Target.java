import java.util.*;

public class Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        sc.nextLine(); // consume newline

        while (t-- > 0) {
            char[][] grid = new char[10][10];
            for (int i = 0; i < 10; i++) {
                grid[i] = sc.nextLine().toCharArray();
            }

            int totalPoints = 0;

            // Calculate points for each cell
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid[i][j] == 'X') {
                        // Distance from the nearest border
                        int dist = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                        int points = dist + 1; // ring value (1 to 5)
                        totalPoints += points;
                    }
                }
            }

            System.out.println(totalPoints);
        }

        sc.close();
    }
}

