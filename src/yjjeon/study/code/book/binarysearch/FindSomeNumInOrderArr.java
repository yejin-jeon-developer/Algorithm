package yjjeon.study.code.book.binarysearch;

import java.util.Scanner;

public class FindSomeNumInOrderArr {
    public static int firstXIndex = 0;
    public static int lastXIndex = 0;
    public static int x;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = sc.nextInt();
        sc.nextLine();

        String[] arr = sc.nextLine().split(" ");


        findIndex(arr, 0,arr.length - 1);

        System.out.println(lastXIndex - firstXIndex + 1);
    }

    public static void findIndex(String[] arr, int start, int last) {
        int mid = start + last / 2;

        if (!arr[mid - 1].equals(String.valueOf(x)) && arr[mid].equals(String.valueOf(x))) {
            firstXIndex = mid;
            return;
        } else if (!arr[mid + 1].equals(String.valueOf(x)) && arr[mid].equals(String.valueOf(x))) {
            lastXIndex = mid;
            return;
        } else if (!arr[mid].equals(String.valueOf(x)) && arr[mid+1].equals(x)) {
            firstXIndex = mid + 1;
        } else if (!arr[mid].equals(String.valueOf(x)) && arr[mid-1].equals(x)) {
            lastXIndex = mid + 1;
        }

        if (arr[mid - 1].equals(String.valueOf(x))) {
            findIndex(arr, start, mid - 1);
        } else if (arr[mid + 1].equals(String.valueOf(x))) {
            findIndex(arr, mid + 1, last);
        }
    }
}
