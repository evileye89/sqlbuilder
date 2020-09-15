package de.sqlbuilder.helper;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListHelper {

    public static final String LIST_START = "(";
    public static final String LIST_END = ")";

    private ListHelper() {
    }

    public static String join(Stream<String> stream, String delimiter) {
        return stream.collect(Collectors.joining(delimiter));
    }
}
