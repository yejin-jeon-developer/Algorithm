package yjjeon.study.code.book;

import java.util.Scanner;

public class Simulation4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int d = scanner.nextInt();

        int[][] map = new int[n][m];
        int[][] mapVisited = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.nextInt();
                mapVisited[i][j] = map[i][j];
            }
        }

        int[][] command = {{0,-1}, {0,1}, {1,0}, {-1,0}};
        int moveCount = 0;
        while (true) {
            for (int i = 0; i < 4; i++) {
                d -= 1;
                if (d < 0) d = 3;

                x += command[d][0];
                y += command[d][1];

                if (mapVisited[x][y] != 1) {
                   moveCount++;
                }
                x -= command[d][0];
                y -= command[d][1];
            }

            if (d >= 2) d -= 2;
            else d += 2;
            x += command[d][0];
            y += command[d][1];
            if (mapVisited[x][y] != 1) {
                moveCount++;
            } else {
                break;
            }
        }

        System.out.println(moveCount);
    }
}
