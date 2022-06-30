package yjjeon.study;

import java.util.*;
/*
5
X S X X T
T X S X X
X X X X X
X T X X X
X X T X X
*/


public class Main {
    public static char[][] map;
    public static int obstacleCount = 0;
    public static int n;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.next().charAt(0);
            }
        }
        dfs(0,0);
    }

    public static void dfs(int a, int b) {
        System.out.println("a:" +  a + ",b:" + b);
        if (a >= n) return;

        if (map[a][b] == 'X') {
            System.out.println("**a:" +  a + ",b:" + b);
            map[a][b] = 'O';
            obstacleCount++;
            System.out.println(obstacleCount);
            if (obstacleCount == 3) {
                detect();
                map[a][b] = 'X';
                obstacleCount--;
            }

        }
        if (b == n - 1) {
            dfs(a+1, 0);
        } else {
            dfs(a, b + 1);
        }
    }

    public static boolean detect() {
        System.out.println("detect");
        return true;
    }

}