public class _02_Largest{

    public static void main(String[] args){
        int arr[]={2,3,1,2,5,6,9,2,3,0};
        int max=Integer.MIN_VALUE;

        for (int index = 0; index < arr.length; index++) {
            max=Math.max(max,arr[index]);
        }

        System.out.println("Max: "+ max);
    }
}