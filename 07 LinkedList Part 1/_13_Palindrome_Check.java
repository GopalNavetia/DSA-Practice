public class _13_Palindrome_Check {

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

    public void printLL() {
        Node temNode = head;

        while (temNode != null) {
            System.out.print(temNode.data + "->");

            temNode = temNode.next;
        }
        System.out.print("null");
    }

    // Slow-Fast Pointer Approach
    public Node findMid(Node head) { // helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find mid
        Node midNode = findMid(head);

        // Step 2: Reverse 2nd Part
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        Node right = prev; // Right Half Head
        Node left = head;

        // Step 3: Compare Both Half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        _13_Palindrome_Check ll = new _13_Palindrome_Check();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLL();

        System.out.println("\nIs Palindrome: "+ll.checkPalindrome());
    }
}