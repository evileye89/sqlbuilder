package de.sqlbuilder.helper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListHelperTest {

    @Test
    public void testJoin() {
        List<String> values = Arrays.asList("ID", "NAME");

        assertEquals("ID, NAME", ListHelper.join(values.stream(), ", "));
    }
}
