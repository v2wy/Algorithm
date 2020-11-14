package com.morty.leetcode;

public class _941_ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int length = A.length;
        if (length < 3) {
            return false;
        }
        boolean up = true;
        int j;
        for (int i = 0; i < length - 1; i++) {
            j = i + 1;
            if (A[j] == A[i]) {
                return false;
            }
            if (up) {
                if (A[j] < A[i]) {
                    up = false;
                }
            } else {
                if (A[j] > A[i]) {
                    return false;
                }
            }
            if (i == 0 && !up) {
                return false;
            }
        }
        return !up;
    }

    public boolean solution(int[] A) {
        int length = A.length;
        if(length < 3){
            return false;
        }
        int left = 0;
        int right = length - 1;
        while (left < length - 1 && A[left] < A[left + 1]) {
            left++;
        }
        while (right > 0 && A[right] < A[right - 1]) {
            right--;
        }

        return right == left && left != 0 && right != length - 1;
    }
}
