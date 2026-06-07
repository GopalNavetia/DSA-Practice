public class _11_Tilling_Problem {
    public static int tilingProblem(int n) { // 2 * n Area
        // Base Case
        if (n == 1 || n == 0) {
            return 1;
        }

        // Call
        int verticalTile = tilingProblem(n - 1);
        int horizontalTile = tilingProblem(n - 2);

        // Work
        int totalTiles = verticalTile + horizontalTile;

        return totalTiles;
    }

    public static void main(String[] args) {
        System.out.println("Total Ways:" + tilingProblem(4));
    }
}