public class _01_Queue_Using_Array {
    public static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // IsEmpty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Array Queue is full!!");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Remove
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;

            return front;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return arr[0];
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q= new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}