package yjjeon.study.code.book.dfsbfs;

import java.util.*;

public class FindSomeCity {
    public static int n,m,k,x;
    public static final int INF = (int) 1e9;
    public static int[] d;
    public static ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();


        for (int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges.get(a).add(b);
        }

        d = new int[n+1];
        Arrays.fill(d, INF);

        dikstra(x);
    }

    public static void dikstra(int start) {
        Queue<Integer> queue = new LinkedList<>();

        d[start] = 0;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < edges.get(now).size(); i++) {
                if (d[edges.get(now).get(i)] == INF) {
                    d[edges.get(now).get(i)] = d[now] + 1;
                    queue.add(edges.get(now).get(i));
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (d[i] == k) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }
}
