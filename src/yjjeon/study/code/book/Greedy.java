package yjjeon.study.code.book;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Greedy {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(getBigNumber(arr, m, k));
    }
    private static int getBigNumber(int[] arr, int m, int k) {
        Arrays.sort(arr);
        int sum = 0;
        int kCount = 0;
        for (int i = 0; i < m; i++) {
            if (kCount == k) {
                sum += arr[arr.length - 2];
                kCount = 0;
                continue;
            }
            sum += arr[arr.length - 1];
            kCount++;
        }

        return sum;
    }
}
