public class _10_Optimized_Power {
    public static int optimizedPower(int x, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        // Work
        int halfPower= optimizedPower(x, n/2);
        int halfPowerSq= halfPower*halfPower;

        if (n%2!=0) { // Odd
            return halfPowerSq*= x;            
        }

        return halfPowerSq; // Even
    }

    public static void main(String[] args) {
        int x = 2, n = 5;

        System.out.println(optimizedPower(x, n));
    }
}