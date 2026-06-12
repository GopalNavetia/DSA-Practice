public class _05_Add_Middle {

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

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;

        // Find Previous Node
        for (int i = 0; i < idx - 1; i++) {
            temp = head.next;
        }

        // Add operations
        Node newNode = new Node(data);

        newNode.next = temp.next;

        temp.next = newNode;
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
        _05_Add_Middle ll = new _05_Add_Middle();

        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(9);

        System.out.println("\nOriginal Node: ");
        ll.printLL(head);

        ll.add(2, 6);

        System.out.println("\nNew Node: ");
        ll.printLL(head);

    }
}