/**

 Determine whether an integer is a palindrome. Do this without extra space.

 Some hints:
 Could negative integers be palindromes? (ie, -1)

 If you are thinking of converting the integer to string, note the restriction of using extra space.

 You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

 There is a more generic way of solving this problem.

 */

package com.ironwyu.leetcode._009;

public class PalindromeNumber {

    //tips: 反转一半的数字串,和另外一半做比较
    public boolean isPalindrome(int x) {
        //判断边界问题
        if (x < 0 || (x % 10 == 0 && x != 0)){
           return false;
        }

        int reverseNum = 0;
        while (x > reverseNum){
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }

        return x == reverseNum || x == reverseNum / 10;
    }

    public static void main(String[] args) {
        new PalindromeNumber().isPalindrome(1223221);
    }
}
