import java.io.*;
import java.util.*;

public class OXC {
    static int N, S, L, M, K, P, R;
    static int[][] oxcConnections;

    public static void main(String[] args) throws IOException {
        // Using Fast I/O for 5s time limit
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        R = N * (S / P) * K;

        oxcConnections = new int[M][R];
        for (int i = 0; i < M; i++) Arrays.fill(oxcConnections[i], -1);

        for (int qry = 0; qry < 5; qry++) {
            String line = br.readLine();
            if (line == null) break;
            int Q = Integer.parseInt(line.trim());
            int[][] flows = new int[Q][4];
            for (int i = 0; i < Q; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 4; j++) flows[i][j] = Integer.parseInt(st.nextToken());
            }
            solveQuery(Q, flows);
        }
    }

    static void solveQuery(int Q, int[][] flows) {
        // Reset connections to ensure 1-to-1 validity per query
        for (int i = 0; i < M; i++) Arrays.fill(oxcConnections[i], -1);
        
        // Track occupied ports: [oxcId][portId]
        boolean[][] occupied = new boolean[M][R];
        StringBuilder routeOutput = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            int gA = flows[i][0];
            int gB = flows[i][2];

            boolean foundPath = false;
            // Iterate through planes and OXCs to find a free pair of ports
            // We use nested loops to find the first available physical path
            searchPath:
            for (int p = 0; p < P; p++) {
                int oxcsPerPlane = M / P;
                int spinesPerPlane = S / P;
                
                for (int oIdx = 0; oIdx < oxcsPerPlane; oIdx++) {
                    int oxcId = (p * oxcsPerPlane) + oIdx;
                    
                    for (int sA = 0; sA < spinesPerPlane; sA++) {
                        for (int sB = 0; sB < spinesPerPlane; sB++) {
                            for (int kA = 0; kA < K; kA++) {
                                for (int kB = 0; kB < K; kB++) {
                                    
                                    int portA = gA * (S / P) * K + sA * K + kA;
                                    int portB = gB * (S / P) * K + sB * K + kB;

                                    if (!occupied[oxcId][portA] && !occupied[oxcId][portB] && portA != portB) {
                                        oxcConnections[oxcId][portA] = portB;
                                        oxcConnections[oxcId][portB] = portA;
                                        occupied[oxcId][portA] = true;
                                        occupied[oxcId][portB] = true;

                                        int sGlobalA = sA + (p * spinesPerPlane);
                                        int sGlobalB = sB + (p * spinesPerPlane);
                                        
                                        routeOutput.append(sGlobalA).append(" ").append(kA).append(" ")
                                                   .append(oxcId).append(" ").append(sGlobalB).append(" ")
                                                   .append(kB).append("\n");
                                        
                                        foundPath = true;
                                        break searchPath;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!foundPath) {
                // Fallback if no path is found (should be rare with given constraints)
                routeOutput.append("0 0 0 0 0\n");
            }
        }

        // Print OXC state
        StringBuilder oxcOutput = new StringBuilder();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < R; j++) {
                oxcOutput.append(oxcConnections[i][j]).append(j == R - 1 ? "" : " ");
            }
            oxcOutput.append("\n");
        }
        System.out.print(oxcOutput);
        System.out.print(routeOutput);
    }
}