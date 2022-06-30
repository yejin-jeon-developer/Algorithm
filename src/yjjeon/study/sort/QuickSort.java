package yjjeon.study.sort;

public class QuickSort {
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2 - 1) { // 왼쪽 방이 1개 이상 일 경
            quickSort(arr, start, part2 - 1);
        }
        if (part2 < end)  {
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int arr[], int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int arr[], int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    private static void printArray(int arr[]) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,8,6,2,6,9,0,6,3,2,5};
        quickSort(arr);
        printArray(arr);
    }
}
