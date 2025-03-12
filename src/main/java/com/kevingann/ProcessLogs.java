package com.kevingann;

import java.util.*;

/** Hackerrank interview question */
public final class ProcessLogs {

  public static List<String> processLogs(List<String> logs, int maxSpan) {

    // Get the people that have signed out.
    Map<String, Integer> signOutMap = new HashMap<>();
    for (String entry : logs) {
      // tokenize based on spaces
      var tokens = List.of(entry.split(" "));
      if (tokens.size() != 3) {
        throw new IllegalArgumentException();
      }

      var userId = tokens.get(0);
      var timestamp = Integer.parseInt(tokens.get(1));
      var action = tokens.get(2);

      if (action.equals("sign-out")) {
        if (!signOutMap.containsKey(userId)) {
          signOutMap.put(userId, timestamp);
        }
      }
    }

    Map<String, Integer> signInMap = new HashMap<>();
    for (String entry : logs) {
      // tokenize based on spaces
      var tokens = List.of(entry.split(" "));
      if (tokens.size() != 3) {
        throw new IllegalArgumentException();
      }

      var userId = tokens.get(0);
      var timestamp = Integer.parseInt(tokens.get(1));
      var action = tokens.get(2);

      if (action.equals("sign-in")) {
        signInMap.put(userId, timestamp);
      }
    }

    var resultsToSort = new ArrayList<Integer>();
    for (Map.Entry<String, Integer> entry : signOutMap.entrySet()) {
      if (signOutMap.containsKey(entry.getKey()) && signInMap.containsKey(entry.getKey())) {
        var signedOutTime = signOutMap.get(entry.getKey());
        var signedInTime = signInMap.get(entry.getKey());
        var delta = signedOutTime - signedInTime;
        if (delta <= maxSpan) {
          resultsToSort.add(Integer.parseInt(entry.getKey()));
        }
      }
    }
    Collections.sort(resultsToSort);

    var resultsToReturn = new ArrayList<String>();
    for (Integer entry : resultsToSort) {
      resultsToReturn.add(String.valueOf(entry));
    }
    return resultsToReturn;
  }
}
