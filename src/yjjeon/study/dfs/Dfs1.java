package yjjeon.study.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class Dfs1 {
    public static int ice = 0;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] icePlate = new int[n][m];
        boolean[][] marked = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                icePlate[i][j] = scanner.nextInt();
                marked[i][j] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!marked[i][j] && icePlate[i][j] == 0) {
                    System.out.println(i + "," + j);
                    ice++;
                }
                searchIce(icePlate, marked, i, j);
            }
        }

        System.out.println(ice);
    }
    public static void searchIce(int[][] ip, boolean[][] marked,int i, int j) {
        if (ip[i][j] == 1 || marked[i][j] == true) {
            return;
        }
        marked[i][j] = true;

        if (i + 1 < ip.length && ip[i][j] == 0) searchIce(ip, marked, i+1, 0);
        if (j + 1 < ip[0].length && ip[i][j] == 0) searchIce(ip, marked, i, j+1);
        return;
    }
}
