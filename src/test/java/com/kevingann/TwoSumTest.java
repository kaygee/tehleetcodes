package com.kevingann;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>You can return the answer in any order.
 */
public final class TwoSumTest {

  @Test
  void first() {
    int[] list = {2, 7, 11, 15};
    int target = 9;

    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(list, target);
    assertThat(result).containsExactly(0, 1);
  }

  @Test
  void second() {
    int[] list = {3, 2, 4};
    int target = 6;

    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(list, target);
    assertThat(result).containsExactly(1, 2);
  }

  @Test
  void third() {
    int[] list = {3, 3};
    int target = 6;

    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(list, target);
    assertThat(result).containsExactly(0, 1);
  }
}
