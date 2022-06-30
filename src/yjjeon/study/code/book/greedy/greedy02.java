package yjjeon.study.code.book.greedy;

import java.util.Scanner;

public class greedy02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int result = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            if (n == 0 || result == 0) {
                result += n;
            } else {
                result *= n;
            }
        }
        System.out.println(result);
    }
}
