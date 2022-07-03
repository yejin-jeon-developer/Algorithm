package second.greedy;

import java.util.Scanner;

public class DivideToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = 0;
        while (N != 1) {
            if (N % K != 0) {
                N--;
            } else {
                N = N / K;
            }
            result++;
        }
        System.out.println(result);
    }
}
