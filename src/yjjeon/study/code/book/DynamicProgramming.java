package yjjeon.study.code.book;

import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = 0;
        while (x != 1) {
            if (x % 5 == 0) {
                x = x / 5;
            } else {
                //배수랑 1차이

                int y = x % 5;
                for (int i = 0; i < y; i++) {
                    x -= 1;
                    result++;
                }
                x = x / 5;
                result++;
            }
        }

        System.out.println(result);
    }
}
