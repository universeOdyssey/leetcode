/**
 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 **/

package com.ironwyu.leetcode.TwoSum1;

import java.util.*;

class TwoSum {
    //easy hashmap
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length <= 0){
            return null;
        }
        int [] result = new int[2];
        Map m = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(m.containsKey(temp)){
                result[0] = (int) m.get(temp);
                result[1] = i;
            }else {
                m.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String [] args){
        int [] nums = {3, 3};
        new TwoSum().twoSum(nums, 5);
    }
}


