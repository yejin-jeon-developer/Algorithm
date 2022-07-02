package second.simulate;

import java.util.Scanner;

public class LRUD {

    public static void main(String[] args) {
        // 1. 입력
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] commands = scanner.nextLine().split(" ");

        //2. LRUD 배열로 이동값 설정
        String[] moveType = {"L", "R", "U", "D"};
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        int nx;
        int ny;
        int x = 1;
        int y = 1;

        for(int i = 0; i < commands.length; i++) {
            for (int j = 0; j < moveType.length; j++) {
                if (moveType[j].equals(commands[i])) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                    if (nx < 1 || ny < 1 || nx > 5 || ny > 5) continue;
                    x = nx;
                    y = ny;
                    System.out.println(x + " " + y);
                }
            }
        }

        //4. 출력
        System.out.println(x + " " + y);
    }
}
