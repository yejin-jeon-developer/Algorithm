package yjjeon.study.code.book;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] dduk = new int[N];
        for (int i = 0; i < N; i++) {
            dduk[i] = scanner.nextInt();
        }
        Arrays.sort(dduk);


    }
    private static int binarySeart(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int mid = (arr[start] + arr[end]) / 2;

        if (target == getM(arr, start, mid, arr[mid])) {
            return 0;
        }
        return 0;
    }

    private static int getM(int[] arr,int start, int end, int height) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i] - height;
        }
        return sum;
    }
}
