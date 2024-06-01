package timus;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/
public class task_3 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    static public String longestCommonPrefix(String[] strs) {
            if(strs.length==0)
                return "";
            Arrays.sort(strs);
            StringBuilder str=new StringBuilder();
            int n=strs.length;
            String first=strs[0];
            String last=strs[n-1];
            int min =Math.min(first.length(),last.length());
            int index=0;
            while(index<min && first.charAt(index)==last.charAt(index))
                index++;
            return first.substring(0,index);
        }
}
