package com.kevingann;

import static org.assertj.core.api.Fail.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;

public final class ProcessLogsTest {

  @Test
  void first() {
    var entries =
        (List.of(
            "30 99 sign-in",
            "30 105 sign-out",
            "12 100 sign-in",
            "12 120 sign-out",
            "20 80 sign-in",
            "20 101 sign-out",
            "21 100 sign-in"));
    var results = ProcessLogs.processLogs(entries, 5);
    System.out.println(results);
  }

  @Test
  void second() {
    var entries = (List.of("60 12 sign-in", "80 20 sign-out", "10 20 sign-in", "60 20 sign-out"));
    var results = ProcessLogs.processLogs(entries, 100);
    System.out.println(results);
  }

  @Test
  void third() {

    Path path = Paths.get("src/test/resources/process-logs.txt");
    List<String> entries = List.of();
    try {
      entries = Files.readAllLines(path);
    } catch (IOException e) {
      fail();
    }

    var results = ProcessLogs.processLogs(entries, 100);
    System.out.println(results);
  }
}
