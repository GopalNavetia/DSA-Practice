public class _06_Subarray {
    public static void subarray(int arr[]) {
        int ms=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int cs = 0;
                
                for (int k = i; k <= j; k++) {
                    cs += arr[k];
                }

                ms=cs>ms?cs:ms;
            }
        }

        System.out.println("Max: "+ms);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        subarray(arr);
    }
}