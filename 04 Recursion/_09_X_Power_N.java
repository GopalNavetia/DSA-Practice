public class _09_X_Power_N{

    public static int power(int x,int n){
        // Base Case
        if (n==0) {
            return 1;
        }

        return x*power(x, n-1);
    }
    public static void main(String[] args){
        int x=2, n=5;

        System.out.println(power(x,n));
    }
}