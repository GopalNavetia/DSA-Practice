public class _14_Swap_Two_Num_Without_3rd_Variable{

    public static void main(String[] args){
        int a=5;
        int b=10;

        System.out.println("Original Numbers: a = "+a+", b = "+b);
        
        // swap;
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("Updated Numbers: a = "+a+", b = "+b);
    }
}