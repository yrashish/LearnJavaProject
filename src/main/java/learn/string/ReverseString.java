package learn.string;

public class ReverseString {
    public static void main(String[] args) {
        String string = "pivotal gemfire";
        final char[] chars = string.toCharArray();
        System.out.println("using char array");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println("");
        System.out.println("using stringbuilder");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        System.out.println(stringBuilder.reverse());
    }
}