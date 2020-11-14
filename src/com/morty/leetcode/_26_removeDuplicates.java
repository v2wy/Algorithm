package com.morty.leetcode;

public class _26_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        //双指针 一个指向最左端的
        int length = nums.length;
        if (length <= 1) {
            return length;
        }
        int left = 0;
        for (int right = 1; right < length; right ++) {
            if(nums[right] != nums[left]){
                nums[++left] = nums[right];
            }
        }
        return left + 1;
    }
}
