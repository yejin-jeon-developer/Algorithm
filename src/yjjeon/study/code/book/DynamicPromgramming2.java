package yjjeon.study.code.book;

import java.util.Scanner;

public class DynamicPromgramming2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] foodRoom = new int[n];
        for (int i = 0; i < n; i++) {
            foodRoom[i] = scanner.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = foodRoom[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (index == i - 1) {
                int temp = dp[i-1] - foodRoom[i-1]+ foodRoom[i];
                if (temp > dp[i - 1]) {
                    dp[i] = temp;
                    index = i;
                } else {
                    dp[i] = dp[i - 1];
                }
            } else {
                dp[i] = dp[i-1] + foodRoom[i];
                index = i;
            }
        }

        System.out.println(dp[n-1]);
        for (int i = 0; i < n; i++) {
            System.out.println(dp[i]);
        }
    }
}
