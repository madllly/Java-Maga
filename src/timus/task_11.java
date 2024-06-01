package timus;

import java.math.BigInteger;
import java.util.Arrays;

// https://leetcode.com/problems/plus-one/description/
public class task_11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder hp = new StringBuilder();
        for(int i=0; i<digits.length; i++){
            hp.append(digits[i]);
        }
        String a = hp.toString();
        BigInteger num = new BigInteger(a);
        num = num.add(BigInteger.ONE);
        String b = String.valueOf(num);
        int res[] = new int[b.length()];
        for(int j=0; j<b.length(); j++){
            res[j] = Character.getNumericValue(b.charAt(j));
        }
        return res;
    }
}
