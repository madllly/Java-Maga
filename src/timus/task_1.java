package timus;

// https://leetcode.com/problems/palindrome-number/description/
public class task_1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}
