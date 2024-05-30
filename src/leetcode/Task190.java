package leetcode;
//
// https://leetcode.com/problems/reverse-bits/description/
public class Task190 {
    // 190. Reverse Bits
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans |= (n & 1) << (31 - i);
            n >>= 1;
        }
        
        return ans;
    }
}
