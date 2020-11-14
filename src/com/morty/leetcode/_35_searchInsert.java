package com.morty.leetcode;

public class _35_searchInsert {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target == nums[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return target <= nums[left] ? left : left + 1;
    }
}
