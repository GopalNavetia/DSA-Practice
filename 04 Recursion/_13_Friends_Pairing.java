public class _13_Friends_Pairing {
    public static int friendsPairing(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }

        // Work

        // Choice
        // Single
        int single = friendsPairing(n - 1);

        // Pair
        int pair = friendsPairing(n - 2);
        int pairWays = (n - 1) * pair;

        // Total Ways
        int totalWays = single + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
        ;
    }
}