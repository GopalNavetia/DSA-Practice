
public class _03_Add_Last{

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

    public static void main(String[] args){
        _03_Add_Last ll=new _03_Add_Last();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
    }
}