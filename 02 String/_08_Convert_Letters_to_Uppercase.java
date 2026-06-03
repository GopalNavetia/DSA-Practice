public class _08_Convert_Letters_to_Uppercase {

    public static void convertToUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        Character ch = Character.toUpperCase(str.charAt(0));

        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println("Updated: " + sb);
    }

    public static void main(String[] args) {
        String str = "hello world ";

        convertToUppercase(str);

    }
}