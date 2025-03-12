package com.kevingann;

public final class LongestCommonPrefix {

  /**
   * Notes
   *
   * <ul>
   *   <li>Prefix means the beginning of the string.
   *   <li>Empty list means no prefixes to check.
   *   <li>Is the first letter the same between all?
   *   <li>1 <= strs.length <= 200
   *   <li>0 <= strs[i].length <= 200
   *   <li>strs[i] consists of only lowercase English letters if it is non-empty.
   * </ul>
   */
  public String longestCommonPrefix(String[] strs) {

    // Out of bounds
    if (strs.length < 1 || strs.length > 200) {
      return "";
    }

    if (strs.length == 1) {
      return strs[0];
    }

    // Find the shortest string. Because, that'll be the longest possible prefix.
    int shortestIndex = 0;
    int shortestLengthSeen = strs[0].length();

    for (int i = 1; i < strs.length; i++) {
      int currentLength = strs[i].length();
      if (currentLength < shortestLengthSeen) {
        shortestLengthSeen = currentLength;
        shortestIndex = i;
      }
    }

    var shortestString = strs[shortestIndex];
    var longestCommonPrefix = "";
    System.out.println("Shortest string [" + shortestString + "]");

    for (int x = 1; x < shortestString.length() + 1; x++) {
      var currentPrefix = getPrefix(shortestString, x);
      System.out.println("Current prefix [" + currentPrefix + "]");
      if (hasCommonPrefixes(strs, currentPrefix, shortestIndex)) {
        longestCommonPrefix = currentPrefix;
      }
    }
    return longestCommonPrefix;
  }

  private boolean hasCommonPrefixes(String[] toCheck, String prefix, int indexToSkip) {
    for (int y = 0; y < toCheck.length; y++) {
      if (y != indexToSkip) {
        if (!toCheck[y].startsWith(prefix)) {
          return false;
        }
      }
    }
    return true;
  }

  private String getPrefix(String useForPrefix, int size) {
    return useForPrefix.substring(0, size);
  }
}
