package com.kevingann;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public final class LongestCommonPrefixTest {

  @Test
  void first() {

    // "fl"
    var cases = new String[] {"flower", "flow", "flight"};

    var longestCommonPrefix = new LongestCommonPrefix();
    String result = longestCommonPrefix.longestCommonPrefix(cases);
    assertThat(result).isEqualTo("fl");
  }

  @Test
  void second() {

    // There is no common prefix among the input strings.
    var cases = new String[] {"dog", "racecar", "car"};

    var longestCommonPrefix = new LongestCommonPrefix();
    String result = longestCommonPrefix.longestCommonPrefix(cases);
    assertThat(result).isEqualTo("");
  }

  @Test
    void canReturnEmptyForEmptyArray(){

      var cases = new String[] {};

      var longestCommonPrefix = new LongestCommonPrefix();
      String result = longestCommonPrefix.longestCommonPrefix(cases);
      assertThat(result).isEqualTo("");
  }

  @Test
  void canReturnForSingleString(){

    var cases = new String[] {"a"};

    var longestCommonPrefix = new LongestCommonPrefix();
    String result = longestCommonPrefix.longestCommonPrefix(cases);
    assertThat(result).isEqualTo("a");
  }

  @Test
  void thirdCase(){

    var cases = new String[] {"ab", "a"};

    var longestCommonPrefix = new LongestCommonPrefix();
    String result = longestCommonPrefix.longestCommonPrefix(cases);
    assertThat(result).isEqualTo("a");
  }

  @Test
  void canReturnForAllTheSame(){

    var cases = new String[] {"flower","flower","flower","flower"};

    var longestCommonPrefix = new LongestCommonPrefix();
    String result = longestCommonPrefix.longestCommonPrefix(cases);
    assertThat(result).isEqualTo("flower");
  }
}
