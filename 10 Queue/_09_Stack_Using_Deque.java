import java.util.*;

public class _09_Stack_Using_Deque {
    static class Stack {
        static Deque<Integer> dq = new LinkedList<>();

        // push
        public static void push(int data) {
            dq.addFirst(data);
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
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}