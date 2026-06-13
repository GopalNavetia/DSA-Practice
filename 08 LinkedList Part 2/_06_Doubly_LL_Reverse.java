public class _06_Doubly_LL_Reverse {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;

            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        _06_Doubly_LL_Reverse dll = new _06_Doubly_LL_Reverse();

        dll.addLast(7);
        dll.addLast(8);
        dll.addLast(9);
        dll.addLast(10);

        dll.printLL();
        System.out.println();

        dll.reverse();
        dll.printLL();
    }
}