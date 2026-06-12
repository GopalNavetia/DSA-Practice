public class _11_Reverse {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
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

        tail = newNode;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head=prev;
    }

    public void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        _11_Reverse ll = new _11_Reverse();

        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(9);

        System.out.print("Original Node: ");
        ll.printLL(head);

        ll.reverse();

        System.out.print("\nNew Node: ");
        ll.printLL(head);

    }
}