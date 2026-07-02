public class _09_Reverse_Number{
    public static int reverse(int n){
        int reverse=0;

        while (n!=0) {
            int lastDigit=n%10;
            reverse= (reverse*10)+lastDigit;
            n/=10;
        }

        return reverse;
    }

    public static void main(String[] args){
        int n=3579;

        n=reverse(n);

        System.out.println(n);
    }
}