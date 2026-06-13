public class _05_Doubly_LL {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

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

    public void removeFirst() {
        if (head == null) {
            System.out.println("Emply Doubly LinkedList!!");
            return;
        }
        
        head = head.next;
        head.prev = null;
    }
    
    public void removeLast(){
        if (head== null) {
            System.out.println("Emply Doubly LinkedList!!");
            return;
        }

        tail=tail.prev;
        tail.next=null;
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
        _05_Doubly_LL dll = new _05_Doubly_LL();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);

        dll.addLast(7);
        dll.addLast(8);
        dll.addLast(9);
        dll.addLast(10);

        dll.printLL();
        
        dll.removeFirst();
        dll.removeFirst();

        dll.removeLast();

        System.out.println();
        dll.printLL();
    }
}