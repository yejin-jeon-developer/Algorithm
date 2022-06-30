package yjjeon.study.code.book;

import java.util.Scanner;

public class Greedy3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int count = 0;
        while (N != 1) {
            while (N % K != 0) {
                N -= 1;
                count++;
            }
            N = N / K;
            count++;
        }

        System.out.println(count);
    }
}
