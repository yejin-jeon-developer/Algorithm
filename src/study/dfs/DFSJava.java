package study.dfs;

import java.util.ArrayList;
import java.util.Arrays;

public class DFSJava {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args) {
        graph.add(0,new ArrayList<>());
        graph.add(1,new ArrayList<>(Arrays.asList(2, 3, 8)));
        graph.add(2,new ArrayList<>(Arrays.asList(1, 7)));
        graph.add(3,new ArrayList<>(Arrays.asList(1, 4, 5)));
        graph.add(4,new ArrayList<>(Arrays.asList(3, 5)));
        graph.add(5,new ArrayList<>(Arrays.asList(3, 4)));
        graph.add(6,new ArrayList<>(Arrays.asList(7)));
        graph.add(7,new ArrayList<>(Arrays.asList(2, 6, 8)));
        graph.add(8,new ArrayList<>(Arrays.asList(1, 7)));

        dfs(1);
    }
    /* 1 2 7 6 8 3 4 5 */
}
