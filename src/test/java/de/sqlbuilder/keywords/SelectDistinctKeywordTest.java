package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectDistinctKeywordTest {

    @Test
    public void testSelectDistinctAll() {
        SelectDistinctKeyword select = new SelectDistinctKeyword();

        assertEquals("SELECT DISTINCT *", select.format());
    }

    @Test
    public void testSelectDistinctColumns() {
        SelectDistinctKeyword select = new SelectDistinctKeyword("ID", "NAME");

        assertEquals("SELECT DISTINCT ID, NAME", select.format());
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtSelectDistinctAll() {
        Statement stmt = new Statement();

        assertEquals("SELECT DISTINCT *", stmt
                .selectDistinct()
                .build());
    }

    @Test
    public void testStmtSelectDistinctColumns() {
        Statement stmt = new Statement();

        assertEquals("SELECT DISTINCT ID, NAME", stmt
                .selectDistinct("ID", "NAME")
                .build());
    }

    @Test
    public void testStmtSelectDistinctColumn() {
        Statement stmt = new Statement();

        assertEquals("SELECT DISTINCT ID FROM USER", stmt
                .selectDistinct("ID")
                .from("USER")
                .build());
    }

}
