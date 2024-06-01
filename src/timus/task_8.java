package timus;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class task_8 {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
