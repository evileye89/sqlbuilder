package de.sqlbuilder.helper;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringHelper {

  private StringHelper() {}

  public static String join(Stream<String> stream, String delimiter) {
    return stream.collect(Collectors.joining(delimiter));
  }
}
