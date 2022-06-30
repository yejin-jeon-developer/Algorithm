package yjjeon.study.sort;

public class BubbleSort {
    private static void bubbleSort(int arr[]) {
        bubbleSort(arr, arr.length - 1);
    }
    private static void bubbleSort(int arr[], int last) {
        if (last > 0) {
            for (int i = 1; i <= last; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
            bubbleSort(arr, last - 1); // 마지막 인덱스는 정렬상태니까 마지막은 빼고!
        }
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
        int arr[] = {2,4,7,7,9,2,5,6,3,3,7,7,1};
        bubbleSort(arr);
        printArray(arr);
    }
}
