package com.ironwyu.leetcode._283;

/**
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.

 */
public class MoveZeroes283 {

    public void moveZeroes2(int[] nums) {
//        [0 1 0 3 12]
//        [0 1 0 3 12]
//        [1 1 0 3 12]
//        [1 1 0 3 12]
//        [1 3 0 3 12]
//        [1 3 12 3 12]
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }



    public static void main(String[] args) {
        int [] nums = {0, 1, 0, 3, 12};
        new MoveZeroes283().moveZeroes2(nums);
    }
}
