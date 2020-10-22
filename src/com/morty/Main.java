package com.morty;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        testTowSum();
    }

    private static void testTowSum() {
        int[] testcase1 = {1, 2, 34, 2, 7, 11, 15};
        int target = 9;
        int[] res = TwoSum.solution1(testcase1, target);
        System.out.println(Arrays.toString(res));
    }
}
