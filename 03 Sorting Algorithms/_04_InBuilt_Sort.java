import java.util.*;

public class _04_InBuilt_Sort{
      public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

      public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        Integer arr1[]={5,3,2,1,4};

        System.out.print("Original array: ");
        printArray(arr);
        
        Arrays.sort(arr);
        System.out.print("After sort: ");
        printArray(arr);

        Arrays.sort(arr,0,3);
        System.out.print("After sort from si to ei: ");
        printArray(arr);

        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.print("After sort in reverse order: ");
        printArray(arr1);


    }
}