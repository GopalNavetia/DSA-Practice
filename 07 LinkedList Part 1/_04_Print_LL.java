public class _04_Print_LL{

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode= new Node(data);

        if (head==null) {
            head=tail=newNode;
            return;
        }

        tail.next=newNode;

        tail=newNode;
    }

    public void printLL(Node head){
        Node temp= head;

        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        _04_Print_LL ll= new _04_Print_LL();

        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(7);

        ll.printLL(head);

    }
}