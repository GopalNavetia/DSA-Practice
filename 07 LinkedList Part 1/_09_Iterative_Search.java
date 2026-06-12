public class _09_Iterative_Search {
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

    public int searchLL(int key){
        Node temp=head;
        int i=0;

        while (temp!=null) {
            if (temp.data==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }


    public static void main(String[] args) {
         _09_Iterative_Search ll = new _09_Iterative_Search();

        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(9);

        System.out.println(ll.searchLL(7));

    }
}