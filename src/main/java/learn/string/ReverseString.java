package learn.string;

public class ReverseString {
    public static void main(String[] args) {
        String string = "pivotal gemfire";
        final char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }


    }
}
