package yjjeon.study.code.book;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int minValue = arr[0][0];
        int minTmp = arr[0][0];
        int maxRow = 0;
        int[] minArr = new int[n];

        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
            minValue = arr[i][0];
            for (int j = 0; j < m; j++) {
                if (minValue > arr[i][j]) minValue = arr[i][j];
            }
            minArr[i] = minValue;
        }
        System.out.println();


        for (int i = 0; i < n; i++) {
            if (minArr[maxRow] < minArr[i]) {
                maxRow = i;
            }
        }

        System.out.println(minArr[maxRow]);
    }
}
