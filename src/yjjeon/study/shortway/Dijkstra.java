package yjjeon.study.shortway;
import java.util.*;

class Node implements Comparable<Node> {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override
    public int compareTo(Node other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}
public class Dijkstra {
    public static final int INF = (int) 1e9; // 무한을 의미. 10억 설정
    public static int n, m, start;

    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static boolean[] visited = new boolean[100001];

    public static int[] d = new int [100001];

    //이거만 우선순위 큐로 변
    public static int getSmallestNode() {
        int min_value = INF;
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (d[i] < min_value && !visited[i]) {
                min_value = d[i];
                index = i;
            }
        }
        return index;
    }

    public static void dijkstra(int start) {
       PriorityQueue<Node> pq = new PriorityQueue<>();
       pq.offer(new Node(start, 0));
       d[start] = 0;

       while(!pq.isEmpty()) {
           Node node = pq.poll();

           int dist = node.getDistance();
           int now = node.getIndex();

           if (d[now] < dist) continue;

           for (int i = 0; i < graph.get(now).size(); i++) {
               int cost = d[now] + graph.get(now).get(i).getDistance();
               if (cost < d[graph.get(now).get(i).getIndex()]) {
                   d[graph.get(now).get(i).getIndex()] = cost;
                   pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
               }
           }
       }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            //a -> b , 비용 : c
            graph.get(a).add(new Node(b, c));
        }

        Arrays.fill(d, INF);

        dijkstra(start);

        //출력
        for (int i = 0; i <= n; i++) {
            if (d[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(d[i]);
            }
        }
    }

}
