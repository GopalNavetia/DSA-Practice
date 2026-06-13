public class _04_Merge_Sort {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

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
        System.out.println("null");
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node left, Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        while (left != null) {
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }

        while (right != null) {
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // Find Mid
        Node mid = getMid(head);

        // Break into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Sort both halves
        Node newLeftHead = mergeSort(head);
        Node newRightHead = mergeSort(rightHead);

        // Merge both halves
        return merge(newLeftHead, newRightHead);
    }

    public static void main(String[] args) {
        _04_Merge_Sort ll = new _04_Merge_Sort();

        ll.addLast(5);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(3);

        System.out.println("Before Sorting:");
        ll.printLL(ll.head);

        ll.head = ll.mergeSort(ll.head);

        System.out.println("After Sorting:");
        ll.printLL(ll.head);
    }
}