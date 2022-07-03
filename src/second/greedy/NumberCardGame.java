package second.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCardGame {
    public static void main(String[] args) {
        //1. 입력
        //2. 모든행 가장 낮은 숫자 중 가장 max 출력

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] numbers = new int[N][M];

        int result = 0;
        for (int i = 0; i < N; i++) {
            int minValue = 10001;
            for (int j = 0; j < M; j++) {
                int x = scanner.nextInt();
                minValue = Math.min(x, minValue);
            }
            result = Math.max(result, minValue);
        }

        System.out.println(result);
    }
}
