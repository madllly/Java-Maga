package timus;

// https://leetcode.com/problems/length-of-last-word/description/
public class task_10 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello java education"));
    }

    public static int lengthOfLastWord(String s) {
        s=s.trim();

        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
                return ans;

            ans++;
        }
        return ans;
    }
}
