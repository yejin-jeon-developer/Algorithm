package second;

import java.util.Arrays;
import java.util.Scanner;

public class AdventureGuild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int member = 0;
        int group = 0;
        for (int i = 0; i < n; i++) {
            member ++;
            if (member == arr[i]) {
                group++;
                member = 0;
            }
        }
        System.out.println(group);
    }
}
