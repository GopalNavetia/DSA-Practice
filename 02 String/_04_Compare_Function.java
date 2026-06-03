public class _04_Compare_Function {

    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        if (str1 == str2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (str2 == str3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // We use ,eqal funtion to compare the value of string
        if (str1.equals(str3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}