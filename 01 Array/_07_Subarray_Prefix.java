public class _07_Subarray_Prefix {
    public static void subarray(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int cs = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];

                ms = cs > ms ? cs : ms;
            }
        }
        System.out.println("max:" + ms);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        subarray(arr);
    }
}