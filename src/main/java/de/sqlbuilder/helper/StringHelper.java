package de.sqlbuilder.helper;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringHelper {

    public static final String LIST_START = "(";
    public static final String LIST_END = ")";

    private StringHelper() {
    }

    public static String join(Stream<String> stream, String delimiter) {
        return stream.collect(Collectors.joining(delimiter));
    }
}
