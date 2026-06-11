import java.util.*;

public class _05_Swap_Two_Num{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter idx1: ");
        int idx1=sc.nextInt();
        System.out.print("Enter idx2: ");
        int idx2=sc.nextInt();
        sc.close();

        System.out.println("Original List:"+ list);
        
        // Swap
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        
        System.out.println("New List:"+ list);
    }
}
