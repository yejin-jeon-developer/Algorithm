package yjjeon.study.code.book;

import java.util.Scanner;

public class Graph1 {
    public static int[] parent;
    public static void union(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static int findParent(int x) {
        if (parent[x] == x) return x;
        return parent[x] = findParent(parent[x]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        parent = new int[n+1];

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int command = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (command == 0) {
                union(a, b);
            } else if (command == 1) {
                if (parent[a] == parent[b]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
