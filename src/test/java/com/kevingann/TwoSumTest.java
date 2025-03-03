package com.kevingann;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

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
