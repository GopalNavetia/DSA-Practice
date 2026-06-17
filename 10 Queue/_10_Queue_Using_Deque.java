import java.util.*;

public class _10_Queue_Using_Deque {

    static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty() {
            return dq.isEmpty();
        }

        // push
        public static void push(int data) {
            dq.addLast(data);
        }

        // pop
        public static int pop() {
            return dq.removeFirst();
        }

        // peek
        public static int peek() {
            return dq.getFirst();
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue();

        q.push(1);
        q.push(2);
        q.push(3);

        while (!q.isEmpty()) {
            System.out.println((q.peek()));
            q.pop();
        }
    }
}