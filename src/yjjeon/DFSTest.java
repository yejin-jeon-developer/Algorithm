package yjjeon;

import yjjeon.study.Queue;

import java.util.LinkedList;
import java.util.Stack;

class Graph {
    Node[] nodes;
    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;

        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.adjacent) {
                if (!n.marked) {  // 스택에 넣은적 없는 애들만 넣기
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new Queue<>();
        queue.add(root);
        root.marked = true;

        while (!queue.isEmpty()) {
            Node r = queue.remove();
            for (Node n : r.adjacent) {
                if (!n.marked) {
                    n.marked = true;
                    queue.add(n);
                }
            }
            visit(r);
        }
    }

    void dfsR (Node r) {
        if (r == null) {
            return;
        }
        r.marked = true;
        visit(r);
        for (Node n : r.adjacent) {
            if (!n.marked) {
                dfsR(n);
            }
        }
    }

    void dfsR(int index) {
        Node n = nodes[index];
        dfsR(n);
    }

    void dfsR() {
        dfsR(0);
    }

    void visit(Node n) {
        System.out.print(n.data + " ");
    }

    class Node{
        int data;
        LinkedList<Node> adjacent;
        boolean marked;
        Node (int data) {
            this.data = data;
            this.adjacent = new LinkedList<>();
            this.marked = false;
        }
     }
}

public class DFSTest {
    public static void main(String args[]) {
        Graph graph = new Graph(9);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 8);

        //graph.bfs();
        graph.dfsR();

    }
}
