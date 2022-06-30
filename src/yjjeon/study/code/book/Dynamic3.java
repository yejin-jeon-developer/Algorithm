package yjjeon.study.code.book;

import java.util.Scanner;

public class Dynamic3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] money = new int[n];
        int[] d = new int[10000];

        for (int i = 0; i < n; i++) {
            money[i] = scanner.nextInt();
            d[money[i]] = 1;
        }

        for (int i = 0; i < m; i++) {
            if (d[i] != 0) continue;

            for (int j = n - 1; j >= 0; j--) {
                if (i % money[j] == 0) {
                    d[i] = i / money[j];
                } else {
                    if (d[i % money[j]] == 0) {
                        d[i] = -1;
                        continue;
                    }
                    d[i] = d[i % money[j]] + (i / money[j]);
                }
            }
        }
        System.out.println(d[m]);
    }
}
