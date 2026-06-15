import java.util.ArrayList;

public class _01_Using_ArrayList {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        // Method to check if stack
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            int topEle;
            if (!isEmpty()) {
                topEle = list.get(list.size() - 1);

                list.remove(list.size() - 1);

                return topEle;
            }

            return -1;
        }

        // peek
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}