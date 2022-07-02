package second.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Dfs {
    public static void main(String[] args) {
        //1. stack
        Stack<Integer> s = new Stack<>();
        s.push(5);
        System.out.println(s.pop());
        //2. Queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        System.out.println(q.poll());
    }
}
