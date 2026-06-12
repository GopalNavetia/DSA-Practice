public class _10_Recursive_Search {
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

    public int helper(Node head, int key){
        if (head==null) {
            return -1;
        }

        if (head.data==key) {
            return 0;
        }

        int idx= helper(head.next, key);

        if (idx==-1) {
            return -1;
        }

        return idx+1;
    }

    public int recursiveSearchLL(int key){
        return helper(head,key);
        
    }


    public static void main(String[] args) {
         _10_Recursive_Search ll = new _10_Recursive_Search();

        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(9);

        System.out.println(ll.recursiveSearchLL(7));

    }
}