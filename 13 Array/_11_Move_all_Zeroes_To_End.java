    // 1. Should order of non-zero elements be preserved?
    // 2. Can there be negative numbers?
    // 3. What if array has no zeros?
    // 4. What if array is all zeros?

    public class _11_Move_all_Zeroes_To_End {

        // 1. Extra Array | TC = O(n) | SC = O(n)
        public static void extraArray(int arr[]) {
            int temp[] = new int[arr.length];
            int k = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    temp[++k] = arr[i];
                }
            }

            System.out.print("New Array: ");
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i] + " ");
            }
        }

        // 2. Two Pointer | TC = O(n) | SC =O(1)
        public static void twoPointer(int arr[]) {
            int start = 0;

            for (int end = 0; end < arr.length; end++) {
                if (arr[end] != 0) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;

                    start++;
                }
            }

            System.out.print("New Array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void main(String[] args) {
            int arr[] = { 0, 1, 0, 3, 12 };

            System.out.println("Extra Array:");
            extraArray(arr);

            System.out.println("\n\nTwo Pointer:");
            twoPointer(arr);
        }
    }