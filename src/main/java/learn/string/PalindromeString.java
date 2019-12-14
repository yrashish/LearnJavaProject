package learn.string;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        boolean isPalindrome = checkPalindrome(inputString);
        final char[] chars = inputString.toCharArray();
        char[] charArray = new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            charArray[i] = chars[i];
        }
        System.out.println(String.valueOf(charArray).equals(inputString));
        if (isPalindrome) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }

    static boolean checkPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        String reverseString = stringBuilder.reverse().toString();
        return reverseString.equals(s);
    }
}
