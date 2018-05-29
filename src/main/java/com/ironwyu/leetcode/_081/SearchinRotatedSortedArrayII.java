package com.ironwyu.leetcode._081;


/**
 Follow up for "Search in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?
 */

public class SearchinRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if (nums[mid] == target){
                return true;
            }
            if(nums[mid] > nums[start]){
                if(target >= nums[start] && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            } else if (nums[mid] < nums[start]){
                if (target <= nums[end] && target >= nums[mid]) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            } else{
                start++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // [1,3,5,6]-7  [1]-1   [1,3]-2 [1,3,5]-4 [3,5,7,9,10]-8
        int [] nums = {1,3,5};
        int target = 1;
        boolean result = new SearchinRotatedSortedArrayII().search(nums, target);
        System.out.println(result);
    }

    /**
     在SearchinRotatedSortedArray基础上移位过滤掉重复的边界
     */
}
