package yjjeon.study.code.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int nodeA;
    int nodeB;
    int distance;

    public Edge (int nodeA, int nodeB, int distance) {
        this.nodeA = nodeA;
        this.nodeB = nodeB;
        this.distance = distance;
    }

    public int getNodeA(){
        return this.nodeA;
    }

    public int getNodeB() {
        return this.nodeB;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override
    public int compareTo(Edge other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }

}
public class Graph2 {
    public static ArrayList<Edge> edges = new ArrayList<>();
    public static int result;
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
        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n+1];
        ArrayList<Integer> resultArr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        int sum = 0;


        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int distance = sc.nextInt();

            edges.add(new Edge(a, b, distance));
        }

        int last = 0;
        Collections.sort(edges);
        for (int i = 0; i < edges.size(); i++) {
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();
            int distance = edges.get(i).getDistance();

            if (findParent(a) != findParent(b)) {
                System.out.println("aa");
                union(a,b);
                sum += distance;
                last = distance;
            }
        }
        Collections.sort(resultArr);

        System.out.println(sum - last);
    }
    /*
    7 12
1 2 3
1 3 2
3 2 1
2 5 2
3 4 4
7 3 6
5 1 5
1 6 2
6 4 1
6 5 3
4 5 3
6 7 4
     */
}
