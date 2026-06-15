public class _02_Using_LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        // Is Empty
        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;

            head = newNode;
        }

        // pop
        public static int pop() {
            if (!isEmpty()) {
                int top = head.data;

                head = head.next;

                return top;
            }

            return -1;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
