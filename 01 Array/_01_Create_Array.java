import java.util.*;

public class _01_Create_Array{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();

        int arr[]= new int[size];

        // Get Array Element
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        // Print array
        System.out.print("Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}