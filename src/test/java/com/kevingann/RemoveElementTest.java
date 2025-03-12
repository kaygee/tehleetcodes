package com.kevingann;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public final class RemoveElementTest {

  @Test
  void firstCase() {
    int[] nums = {3, 2, 2, 3};
    int val = 3;
    int i = new RemoveElement().removeElement(nums, val);
    assertThat(i).isEqualTo(2);
  }

  @Test
  void secondCase() {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;
    int i = new RemoveElement().removeElement(nums, val);
    assertThat(i).isEqualTo(5);
  }
}
