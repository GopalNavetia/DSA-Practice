import java.util.LinkedList;

public class _03_LL_Using_JCF {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println(ll);

        ll.removeLast();
        ll.remove(1);
        System.out.println(ll);
    }
}