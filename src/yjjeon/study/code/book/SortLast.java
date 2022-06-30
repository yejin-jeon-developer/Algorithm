package yjjeon.study.code.book;

import java.util.Arrays;
import java.util.Scanner;

public class SortLast {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = scanner.nextInt();
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < k; i++) {
            if (arrA[i] < arrB[arrB.length - 1 - i]) {
                swap(arrA, arrB, i, arrB.length - 1 - i);
            }
        }

        int sum = 0;
        for (int i = 0; i < arrA.length; i++) {
            sum += arrA[i];
        }
        System.out.println(sum);
    }
    private static void swap(int a[], int b[], int aIndex, int bIndex) {
        int temp = a[aIndex];
        a[aIndex] = b[bIndex];
        b[bIndex] = temp;
    }
}
