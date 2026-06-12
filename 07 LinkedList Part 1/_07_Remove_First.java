public class _07_Remove_First {

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

    public int removeFirst(Node head) {
        if (size == 0) {
            System.out.println("Empty LinkedList!!");
            return -1;
        }

        if (size == 1) {
            int value = head.data;

            head = tail = null;
            size--;
            return value;
        }

        int value = head.data;

        head = head.next;
        size--;

        return value;
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
        _07_Remove_First ll = new _07_Remove_First();

        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(9);

        System.out.print("Original Node: ");
        ll.printLL(head);

        System.out.println("\nRemoved First Node: " + ll.removeFirst(head));
        ;
    }
}