package yjjeon.study.code.book.simulate;

import java.util.Scanner;

public class LuckyStrike {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String n1 = n.substring(0, n.length()/2);
        String n2 = n.substring(n.length()/2);

        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < n.length() / 2; i++) {
            s1 += Integer.parseInt(n1.charAt(i) + "");
            s2 += Integer.parseInt(n2.charAt(i) + "");
        }

        System.out.println(s1 + "," + s2);
        if (s1 == s2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
