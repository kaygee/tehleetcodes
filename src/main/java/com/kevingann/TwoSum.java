package com.kevingann;

/**
 * Problem #1
 *
 * <p>Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>You can return the answer in any order.
 */
public final class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    var indices = new int[2];

    for (int i = 0; i < nums.length; i++) {

      var first = nums[i];
      // System.out.println("Index [" + i + "] = " + first);

      for (int x = i + 1; x < nums.length; x++) {

        var second = nums[x];
        // System.out.println("Index [" + x + "] = " + second);

        if (first + second == target) {
          // System.out.println("Indexes [" + i + "]" + "[" + x + "] = " + target);

          indices[0] = i;
          indices[1] = x;
        }
      }
    }

    return indices;
  }
}
