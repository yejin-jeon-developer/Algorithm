import java.util.NoSuchElementException;

class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void add(T item) {
        Node<T> t = new Node<>(item);
        if (last != null) {
            last.next = t;
        }
        last = t;
        if (first == null) { // 데이터 없을때
            first = last;
        }
    }

    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        T data = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }

        return data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}

public class QueueTest {
    public static void main(String args[]) {
        Queue<Integer> q = new Queue<>();
        q.add(1);
        q.add(2);
        System.out.println(q.remove());
    }
}
