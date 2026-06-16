import java.util.*;

public class _05_Queue_Using_Two_Stack {

    // # **** Method 1 ****#
    // static class Queue {
    // static Stack<Integer> s1 = new Stack<>();
    // static Stack<Integer> s2 = new Stack<>();

    // // isEmpty
    // public static boolean isEmpty() {
    // return s1.isEmpty();
    // }

    // // add O(n) <------------------------------------
    // public static void add(int data) {
    // while (!s1.isEmpty()) {
    // s2.push(s1.pop());
    // }

    // s1.push(data);

    // while (!s2.isEmpty()) {
    // s1.push(s2.pop());
    // }
    // }

    // // remove O(1)
    // public static int remove() {
    // if (s1.isEmpty()) {
    // return -1;
    // }

    // return s1.pop();
    // }

    // // peek O(1)
    // public static int peek() {
    // if (s1.isEmpty()) {
    // return -1;
    // }

    // return s1.peek();
    // }
    // }

    // # **** Method 2 ****#
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add O(1)
        public static void add(int data) {
            s1.push(data);
        }

        // remove O(n) < ------------------------------------
        public static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }

            while (s1.size() != 1) {
                s2.push(s1.pop());
            }

            int front = s1.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return front;
        }

        // peek O(n) < ------------------------------------
        public static int peek() {
            if (s1.isEmpty()) {
                return -1;
            }

            while (s1.size() != 1) {
                s2.push(s1.pop());
            }

            int front = s1.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return front;
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}