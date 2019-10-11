package com.fibers.algorithm.leetcode._35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}