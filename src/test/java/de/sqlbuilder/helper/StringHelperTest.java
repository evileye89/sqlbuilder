package de.sqlbuilder.helper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperTest {

    @Test
    public void testJoin() {
        List<String> values = Arrays.asList("ID", "NAME");

        assertEquals("ID, NAME", StringHelper.join(values.stream(), ", "));
    }
}
