import java.util.*;

public class _02_Operations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add - O(1)
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);

        list.add(1, 9); // O(n) - Zero based

        System.out.println(list);

        // Get - O(1)
        System.out.println(list.get(2)); // Zero based Index

        // Remove - O(n)
        list.remove(2); // Zero based Index
        System.out.println(list);

        // Set at index - O(n)
        list.set(3, 9);
        System.out.println(list);

        // Contains Element - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(9));

        // Size 

        System.out.println(list.size());
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index)+" ");
        }
    }
}