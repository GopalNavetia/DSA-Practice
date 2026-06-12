public class _02_Add_First {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Step 1: Create New Node
        Node newNode = new Node(1);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: newNode next = head
        newNode.next = head;

        // Step 3: head = new Node
        head = newNode;
    }

    public static void main(String[] args) {
        _02_Add_First ll = new _02_Add_First();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

    }
}