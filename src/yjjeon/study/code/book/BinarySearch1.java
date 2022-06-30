package yjjeon.study.code.book;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = scanner.nextInt();
        }

        Arrays.sort(arrN);

        for (int i = 0; i < m; i++) {
            if (binarySearch(arrN, arrM[i], 0, arrN.length - 1)) {
                System.out.print("yes ");
            } else {
                System.out.print("no ");
            }
        }
    }

    private static boolean binarySearch(int arr[], int target, int start, int end) {
        if (start > end) {
            return false;
        }

        int mid = (start + end) / 2;
        System.out.println("target" + target + "mid" + mid);
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}
