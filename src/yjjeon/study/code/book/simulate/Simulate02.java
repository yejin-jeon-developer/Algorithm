package yjjeon.study.code.book.simulate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Simulate02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        ArrayList<Character> alpha = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                alpha.add(s.charAt(i));
            } else {
                sum += s.charAt(i) - '0';
            }
        }
        Collections.sort(alpha);
        for (int i = 0; i < alpha.size(); i++) {
            System.out.print(alpha.get(i));
        }
        System.out.print(sum);
    }
}
