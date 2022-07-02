package second.dfsbfs;

import java.util.Scanner;

/*
 1. 0 일 경우 주변의 0 계속 탐색 (dfs)
 2. 주변의 0 을 다 1로 바꾼후 result + 1
 */
public class FrozenDrink {
    public static int frozenDrink = 0;
    public static int[][] drink;
    public static int N;
    public static int M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();

        drink = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                drink[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(drink[0][0]);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (drink[i][j] == 0) {
                    isFrozen(i, j);
                    frozenDrink++;
                }
            }
        }

        System.out.println(frozenDrink);
    }

    public static void isFrozen(int i, int j) {
        if (i < 0 || j < 0 || i >= N || j >= M) return;
        if (drink[i][j] == 1) return;

        if (drink[i][j] == 0) {
            drink[i][j] = 1;
            isFrozen(i - 1, j);
            isFrozen(i + 1, j);
            isFrozen(i, j + 1);
            isFrozen(i, j - 1);
        }
    }
}
