package yjjeon.study.code.book;

import java.util.Scanner;
/*
5 6
101010
111111
000001
111111
111111
 */
public class EscapeMage {
    public static int n,m, result = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(row.charAt(j) + "");
            }
        }
        System.out.println("gd");
        dfs(arr, 0, 0);
    }

    public static void dfs(int[][] arr, int x, int y) {

        if (x >= n) return;
        if (y >= m) return;
        if (arr[x][y] == 0) return;

        result++;

        if (x == n-1 && y == m-1) {
            System.out.println(result);
            return;
        }

        dfs(arr, x+1, y);
        dfs(arr, x, y+1);
        dfs(arr, x-1, y);
        dfs(arr, x, y-1);
    }
}
