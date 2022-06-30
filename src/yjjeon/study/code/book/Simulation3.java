package yjjeon.study.code.book;

import java.util.Scanner;

public class Simulation3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int x = s.charAt(0) - 96;
        int y = Integer.parseInt(s.substring(1));

        System.out.println(x + "," + y);

        int[][] command = {{2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {-1, 2}, {1, -2}, {-1, -2}};
        int count = 0;
        for (int i = 0; i < command.length; i++) {

            x += command[i][0];
            y += command[i][1];

            if (x > 8 || y > 8 || x < 1 || y < 1) {

            } else {
                count++;
            }
            x -= command[i][0];
            y -= command[i][1];
        }

        System.out.println(count);


    }
}
