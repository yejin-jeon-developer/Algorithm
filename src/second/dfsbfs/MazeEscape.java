package second.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeEscape {
    public static int[][] maze;
    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        maze = new int[n][m];

        //L, R, U, D
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(i) - '0';
            }
        }

        //bfs
        Queue<Node> q = new LinkedList<>();
        int x = 0;
        int y = 0;
        int nx = 0;
        int ny = 0;
        q.offer(new Node(0, 0, 1));
        while (!q.isEmpty()) {
            Node now = q.poll();
            for (int k = 0; k < 4; k++) {
                x = now.x;
                y = now.y;
                nx = x + dx[k];
                ny = y + dy[k];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (maze[nx][ny] != 1) continue;
                q.offer(new Node(nx, ny, now.value + 1));
                maze[nx][ny] = now.value + 1;
            }
        }
        System.out.println(maze[n - 1][m - 1]);

    }

    static class Node {
        int x;
        int y;
        int value;

        Node (int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}
