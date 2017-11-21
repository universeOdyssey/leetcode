/**

 Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:

 Input: 123
 Output:  321

 Example 2:

 Input: -123
 Output: -321

 Example 3:

 Input: 120
 Output: 21

 Note:
 Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */

package com.ironwyu.leetcode.ReverseInteger7;

public class Reverse {

    //tips: 需要考虑到32位int范围 -2147483648~+2147483647, 16位范围  -32768~+32767
    public int reverse(int x) {
        char [] chars = (x + "").toCharArray();
        int lastIndex = 0;
        if(x < 0){
           lastIndex = 1;
        }
        String reverseStr = "";
        for(int i = chars.length - 1; i >= lastIndex; i--){
           reverseStr += chars[i];
        }
        if (x < 0){
            reverseStr = "-" + reverseStr;
        }
        try {
            int target = Integer.parseInt(reverseStr);
            return target;
        } catch (Exception e){
            System.err.println(e);
            return 0;
        }

    }

    public static void main(String[] args) {
        new Reverse().reverse(1534236469);
    }
}
