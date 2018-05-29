package com.ironwyu.leetcode._035;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 */

public class SearchInsertPosition {

    public int searchInsert2(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for(i = 0; i< nums.length; i++){
            if(target == nums[i]) {
                return i;
            }
        }

        for(j = 0; j< nums.length; j++){
            if(nums[j]> target){
                return j;
            }
        }
        return j;

    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int mid = (start + end) / 2;
            if(nums[mid]<target) {
                start = mid + 1;
            } else if(nums[mid]>target) {
                end = mid - 1;
            } else
                return mid;
        }

        return start;
    }

    public static void main(String[] args) {
        // [1,3,5,6]-7  [1]-1   [1,3]-2 [1,3,5]-4 [3,5,7,9,10]-8
        int [] nums = {1,3,5,6};
        int target = 7;
        int result = new SearchInsertPosition().searchInsert(nums, target);
        System.out.println(result);
    }

}
