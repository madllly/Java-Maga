package leetcode;
// +
// https://leetcode.com/problems/length-of-last-word/description/

public class Task58 {
    
    // 58. Length of Last Word

    static public int lengthOfLastWord(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') length++;
            else if (length > 0) break;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" nsdngof iosjfio   dsopfkpo sd  fsdofkpof s df sdnmfposnp"));
        System.out.println(lengthOfLastWord(" nsdngof iosjfio   "));
    }
}
