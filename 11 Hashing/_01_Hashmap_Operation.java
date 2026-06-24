import java.util.*;

public class _01_Hashmap_Operation {

    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        // get - O(1)
        System.out.println(hm.get("India"));
        
        // contain - O(1)
        System.out.println(hm.containsKey("India"));
        
        // remove -O(1)
        System.out.println(hm.remove("India"));
        
        // size 
        System.out.println(hm.size());

        // clear 
        hm.clear();
        
        // isEmpty
        System.out.println(hm.isEmpty());
    }
}