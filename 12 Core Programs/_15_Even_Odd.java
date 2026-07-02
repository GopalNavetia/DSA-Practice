import java.util.*;

public class _15_Even_Odd{

    public static void isEvenOrOdd(int n){
        if (n%2==0) {
            System.out.println(n+" is Even.");
        }else{
            System.out.println(n+" is Odd.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        sc.close();

        isEvenOrOdd(n);
    }
}