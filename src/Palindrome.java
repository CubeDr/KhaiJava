import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        System.out.println(str + " is" +
                (isPalindrome(str)? "" : " not") +
                " palindrome");
    }
    public static boolean isPalindrome(String str) {
        // closing condition
        if(str.length() <= 1) return true;

        if(str.charAt(0) != str.charAt(str.length()-1)) return false;
        return isPalindrome(str.substring(1, str.length()-1));
    }
}
