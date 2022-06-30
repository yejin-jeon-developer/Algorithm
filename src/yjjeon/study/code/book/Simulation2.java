package yjjeon.study.code.book;

import java.util.Scanner;

public class Simulation2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        /*
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i == 3 || i == 13 || i == 23) {
                sum += (59 * 59);
            } else {
                sum += (15 * 59);
                sum += (44 * 15);
            }
        }
         */
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    if (String.valueOf(k).contains("3")
                     || String.valueOf(j).contains("3")
                     || String.valueOf(i).contains("3")) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
