package yjjeon.study.code.book;

import java.util.Scanner;


public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] plans = sc.nextLine().split(" ");

        for (int i = 0; i < plans.length; i++) {
            System.out.println(plans[i]);
        }
    }
}
