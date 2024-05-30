package leetcode;
// +
// https://leetcode.com/problems/valid-palindrome/description/

public class Task125 {

	// 125. Valid Palindrome

    static public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        int start = 0;
        int last = s.length() - 1;
        
		while(start <= last) {
        	char currentFirst = s.charAt(start);
        	char currentLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currentFirst )) start++;
        	else if(!Character.isLetterOrDigit(currentLast)) last--;
			else {
        		if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) return false;
        		start++;
        		last--;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		System.out.println(isPalindrome("uibidfssidfbowqei0u2q0"));
		System.out.println(isPalindrome("faaf"));
	}
}
