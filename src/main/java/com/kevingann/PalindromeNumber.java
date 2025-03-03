package com.kevingann;

/**
 * Problem #9
 *
 * <p>Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public final class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    var checkForPalindrome = String.valueOf(x).toCharArray();

    if (checkForPalindrome.length == 1) {
      // Special case of a single character being a palindrome of itself
      return true;
    }

    var endIndex = checkForPalindrome.length - 1;

    if (checkForPalindrome[0] == checkForPalindrome[endIndex] && checkForPalindrome.length == 2) {
      // Length of 2. If they're the same... it's a palindrome.
      return true;
    }

    for (int i = 0; i < checkForPalindrome.length; i++) {

      if (i == endIndex) {
        // We've met in the middle!
        return true;
      }

      if (checkForPalindrome.length % 2 == 0) {
        /**
         *
         *
         * <ul>
         *   <li>it's an even number
         *   <li>it's longer than 2 characters
         * </ul>
         */
        if (checkForPalindrome[i] != checkForPalindrome[endIndex]) {
          return false;
        }
      }

      if (checkForPalindrome[i] != checkForPalindrome[endIndex]) {
        return false;
      }

      endIndex--;
    }
    return true;
  }
}
