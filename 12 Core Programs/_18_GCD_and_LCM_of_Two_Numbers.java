public class _18_GCD_and_LCM_of_Two_Numbers {

    // Calculate GCD
    public static int GCD(int n1, int n2) {
        int gcd = 1;

        for (int i = 1; i <= (int) Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = Math.max(gcd, i);
            }
        }

        return gcd;
    }
    
    // Calculate LCM
     public static int LCM(int n1, int n2) {
        return (n1 * n2) / GCD(n1, n2);
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 18;

        System.out.println("GCD: " + GCD(n1, n2));
        System.out.println("LCM: " + LCM(n1, n2));
    }
}