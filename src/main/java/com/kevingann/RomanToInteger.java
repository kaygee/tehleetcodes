package com.kevingann;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * <p>Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 For example, 2 is written as II in Roman
 * numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number
 * 27 is written as XXVII, which is XX + V + II.
 *
 * <p>Roman numerals are usually written largest to smallest from left to right. However, the
 * numeral for four is not IIII. Instead, the number four is written as IV. Because the one is
 * before the five we subtract it making four. The same principle applies to the number nine, which
 * is written as IX. There are six instances where subtraction is used:
 *
 * <p>I can be placed before V (5) and X (10) to make 4 and 9. X can be placed before L (50) and C
 * (100) to make 40 and 90. C can be placed before D (500) and M (1000) to make 400 and 900. Given a
 * roman numeral, convert it to an integer.
 */
public final class RomanToInteger {

  private static final Map<String, Integer> ROMAN_NUMERALS_MAP = new HashMap<>();
  private static final List<String> SUBTRACT_CASES = List.of("IV", "IX", "XL", "XC", "CD", "CM");

  public int romanToInt(String s) {
    ROMAN_NUMERALS_MAP.put("I", 1);
    ROMAN_NUMERALS_MAP.put("IV", 4);
    ROMAN_NUMERALS_MAP.put("V", 5);
    ROMAN_NUMERALS_MAP.put("IX", 9);
    ROMAN_NUMERALS_MAP.put("X", 10);
    ROMAN_NUMERALS_MAP.put("XL", 40);
    ROMAN_NUMERALS_MAP.put("L", 50);
    ROMAN_NUMERALS_MAP.put("XC", 90);
    ROMAN_NUMERALS_MAP.put("C", 100);
    ROMAN_NUMERALS_MAP.put("CD", 400);
    ROMAN_NUMERALS_MAP.put("D", 500);
    ROMAN_NUMERALS_MAP.put("CM", 900);
    ROMAN_NUMERALS_MAP.put("M", 1000);

    int total = 0;

    // Look for all the subtraction cases and remove them. But, add them along the way.
    for (String subtractCase : SUBTRACT_CASES) {
      if (s.contains(subtractCase)) {
        total = total + ROMAN_NUMERALS_MAP.get(subtractCase);
        s = s.replace(subtractCase, "");
      }
    }

    // At this point we should be only left with things to add.
    for (int i = 0; i < s.length(); i++) {
      String current = String.valueOf(s.charAt(i));
      total = total + ROMAN_NUMERALS_MAP.get(current);
    }

    return total;
  }
}
