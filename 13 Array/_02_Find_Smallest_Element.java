public class _02_Find_Smallest_Element{

    public static int smallestElement(int arr[]){
        int smallest=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (smallest>arr[i]) {
                smallest=arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args){
        int arr[]={8,7,9,2,3,1,4};

        System.out.println(smallestElement(arr));
    }
}