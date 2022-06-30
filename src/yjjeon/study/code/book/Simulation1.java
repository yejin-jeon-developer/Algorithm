package yjjeon.study.code.book;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulation1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> command = new ArrayList<>();
        int[][] arr = new int[n][n];

        for (int i = 0; i < 5; i++) {
            command.add(scanner.next());
        }

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < command.size(); i++) {
            if (command.get(i).equals("R")) {
                index1 += 1;
            } else if (command.get(i).equals("L")) {
                index1 -= 1;
            } else if (command.get(i).equals("U")) {
                index2 -= 1;
            } else if (command.get(i).equals("D")) {
                index2 += 1;
            }

            if (index1 < 0) index1 = 0;
            if (index1 >= n) index1 = n - 1;
            if (index2 < 0) index2 = 0;
            if (index2 >= n) index2 = n - 1;
        }

        System.out.println(index1 + " " + index2);


    }
}
