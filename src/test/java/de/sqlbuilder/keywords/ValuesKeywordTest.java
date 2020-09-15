package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValuesKeywordTest {

    @Test
    public void testValue() {
        ValuesKeyword values = new ValuesKeyword(null, "1");

        assertEquals(" VALUES (1)", values.format());
    }

    @Test
    public void testValues() {
        ValuesKeyword values = new ValuesKeyword(null, "1", "'John'");

        assertEquals(" VALUES (1, 'John')", values.format());
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtInsertValues() {
        Statement stmt = new Statement();

        assertEquals("INSERT INTO USER VALUES (1, 'John')", stmt
                .insert("USER")
                .values("1", "'John'")
                .build());
    }

}
