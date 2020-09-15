package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static de.sqlbuilder.helper.Operators.IN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectKeywordTest {

    @Test
    public void testSelectAll() {
        SelectKeyword select = new SelectKeyword();

        assertEquals("SELECT *", select.format());
    }

    @Test
    public void testSelectColumns() {
        SelectKeyword select = new SelectKeyword("ID", "NAME");

        assertEquals("SELECT ID, NAME", select.format());
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtSelectAll() {
        Statement stmt = new Statement();

        assertEquals("SELECT *", stmt
                .select()
                .build());
    }

    @Test
    public void testStmtSelectColumns() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID, NAME", stmt
                .select("ID", "NAME")
                .build());
    }

    @Test
    public void testStmtSelectColumn() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER", stmt
                .select("ID")
                .from("USER")
                .build());
    }

    @Test
    public void testStmtSelectNested() {
        Statement stmt = new Statement();
        Statement nested = new Statement();

        assertEquals("SELECT * FROM USER WHERE USER IN (SELECT NAME FROM NAMES)", stmt
                .select()
                .from("USER")
                .where("USER", IN, nested
                        .select("NAME")
                        .from("NAMES")
                        .nested()
                        .build())
                .build());
    }
}
