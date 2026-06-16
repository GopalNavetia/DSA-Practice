public class _03_Queue_Using_LinkedList{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    static class Queue{
        static Node head;
        static Node tail;
        
        // isEmpty
        public static boolean isEmpty(){
            return head==null;
        }

        // add
        public static void add(int data){
            Node newNode= new Node(data);
            
            if (head==null) {
                head=tail=newNode;
                return;
            }

            tail.next=newNode;
            tail=newNode;
        }

        // remove;
        public static int remove(){
            if (isEmpty()) {
                return -1;
            }

            int front= head.data;

            if (tail==head) {
                tail=head=null;
            }else{
                head=head.next;
            }

            return front;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args){
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}