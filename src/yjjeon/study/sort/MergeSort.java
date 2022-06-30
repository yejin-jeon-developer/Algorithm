package yjjeon.study.sort;

public class MergeSort {
    private static void mergeSort(int arr[]) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1 );

    }
    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2; // 1. 가운데로 자름
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end );
            merge(arr, tmp, start, mid, end);
        }
    }
    private static void merge(int arr[], int[] tmp, int start, int mid, int end) {
         for (int i = start; i <= end; i++) {
             tmp[i] = arr[i];
         }
         int part1 = start;
         int part2 = mid + 1;
         int index = start; // 결과 배열방 인덱스, 다음 저장장소 기억

         while (part1 <= mid && part2 <= end) { // 첫번째, 두번째 배열이 끝까지 갈때 까지 반복
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
         }
         for (int i = 0; i <= mid - part1; i++) { // 앞쪽 배열이 남을 경우 처리. 뒷쪽 배열은 원본에 이미 자리잡고 있
             arr[index + i] = tmp[part1 + i];
         }
    }

    private static void printArray(int arr[]) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {4,3,5,1,2};
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }
}
