package second.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigNumberRule {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        int N, M, K = 0;
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();
        Integer[] numbers = new Integer[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 2. 역순 정렬
        Arrays.sort(numbers, Comparator.reverseOrder());

        // 3. 최대값 K번, 다음 최대값 1번 반복 (M번째 도달시 break)
        int index = 0;
        int max = 0;
        while (index != M) {
            for (int j = 0; j < K; j++) {
                max += numbers[0];
                index++;
            }
            if (index == M) break;

            max += numbers[1];
            index++;
        }

        // 4. 출력
        System.out.println(max);
    }
}
