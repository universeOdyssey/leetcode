package com.ironwyu.leetcode.LongestIncreasingSubsequence300;

/**
 Given an unsorted array of integers, find the length of longest increasing subsequence.

 For example,
 Given [10, 9, 2, 5, 3, 7, 101, 18],
 The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

 Your algorithm should run in O(n2) complexity.

 Follow up: Could you improve it to O(n log n) time complexity?

 tag : dp(动态规划)
 */

public class LongestIncreasingSubsequence300 {

    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length, max = 0;
        int[] dp = new int[len];

        for(int i = 0; i < len; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        return 0;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,6,7,9,4,10,5,6};
        int lis = new LongestIncreasingSubsequence300().lengthOfLIS(nums);
        System.out.printf(lis + "");
    }
}
