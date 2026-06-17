import java.util.*;

public class _07_Queue_Reversal{

    public static void reverse(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());    
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args){
        Queue<Integer> q= new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        reverse(q);
    }
}