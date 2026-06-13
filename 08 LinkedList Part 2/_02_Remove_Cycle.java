public class _02_Remove_Cycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // Detect Cycyle
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (isCycle == false) {
            return;
        }

        // Find Meeting Point
        slow = head;
        Node prev = null;

        while (slow != fast) {
            slow = slow.next;

            prev = fast; // store fast before update
            fast = fast.next;
        }

        // Remove Cycle -> Last.next=null
        prev.next=null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temNode=new Node(2);
        head.next = temNode;
        head.next.next = new Node(3);
        head.next.next.next = temNode;

        System.out.println("Before Removing Cycle: "+isCycle());
        removeCycle();
        System.out.println("After Removing Cycle: "+isCycle());
    }
}
