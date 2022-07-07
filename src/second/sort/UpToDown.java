package second.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class UpToDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers, Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
