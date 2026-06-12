public class _12_Delete_Nth_From_End {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");

            temp = temp.next;
        }
        System.out.print("null");
    }

    public void deleteNthFromEnd(int n) {
        // Calculate Size
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // Remove First
            return;
        }

        int i = 1;
        int idxToFind = sz - n;

        Node prev = head;

        while (i < idxToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        _12_Delete_Nth_From_End ll = new _12_Delete_Nth_From_End();

        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(3);

        ll.printLL(head);

        ll.deleteNthFromEnd(2);

        ll.printLL(head);
    }
}