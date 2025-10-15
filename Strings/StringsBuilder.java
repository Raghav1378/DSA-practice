package Strings;

public class StringsBuilder {
    public static void isPalindrome(String s){
        StringBuilder a = new StringBuilder(s);
        a.reverse();
        String reverseString = a.toString();

        System.out.println(s.equals(reverseString));
    }
    public static void main(String[] args) {
        String s = "hello";
        String l = "level";

        isPalindrome(s);
        isPalindrome(l);
        
    }
}
