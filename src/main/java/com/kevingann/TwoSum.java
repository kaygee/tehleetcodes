package com.kevingann;

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
