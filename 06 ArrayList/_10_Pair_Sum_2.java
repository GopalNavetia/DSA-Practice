import java.util.*;

public class _10_Pair_Sum_2{
     // Two Pointer
    public static boolean twoPointer(ArrayList<Integer> list, int targetSum) {
        int breakPoint=-1;
    
        // Find Breaking Point
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)>list.get(i+1)) {
                breakPoint=i;
                break; 
            }
        }

        int left=breakPoint+1;
        int right=breakPoint;

        while (left!=right) {
            int currSum=list.get(left)+list.get(right);
            if (currSum==targetSum) {
                return true;
            }

            if (currSum<targetSum) {
                left=(left+1)%list.size(); // list.size=n;
            }else{
                right=(list.size()+right-1)%list.size();
            }
        }

        return false;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

         System.out.println(twoPointer(list, 16));
    }
}