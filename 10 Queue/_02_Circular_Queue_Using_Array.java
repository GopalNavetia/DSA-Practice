public class _02_Circular_Queue_Using_Array {

    public static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // IsEmpty
        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // IsFull
        public static boolean isFull() {
            return front == (rear + 1) % size; // formula to send the last idx to first idx
        }

        // Add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Array Queue is full!!");
                return;
            }

            // add 1st element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }

            int result = arr[front];

            // last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return arr[front];
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}