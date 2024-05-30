package leetcode;

public class PalindromeNumber {
    // https://leetcode.com/problems/palindrome-number/description/
    public boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x);
        return this.isPalindrome(numberAsString);
    }

    public boolean isPalindrome(String str) {
        int middle = str.length();
        for (int i = 0; i < middle; ++i) {
            boolean condition = str.charAt(i) != str.charAt(str.length() - 1 - i);
            if (condition) return false;
        }
        return true;
    }
}
