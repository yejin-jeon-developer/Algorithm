package yjjeon.study.shortway;

import java.util.*;
class ShortWay1 {
    public static final int INF = (int)1e9;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int N, M;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        int[][] company = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            Arrays.fill(company[i], INF);
        }


        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            company[x][y] = 1;
            company[y][x] = 1;
        }

        int X = scanner.nextInt();
        int K = scanner.nextInt();

        for (int k = 1; k <= N; k++) {
            for (int a = 1; a <= N; a++) {
                for (int b = 1; b <= N; b++) {
                    if (company[a][b] > company[a][k] + company[b][k]) {
                        company[a][b] = company[a][k] + company[b][k];
                    }
                }
            }
        }
        if (company[1][K] == INF || company[K][X] == INF) {
            System.out.println(-1);
        } else {
            System.out.println(company[1][K] + company[K][X]);
        }
    }
}