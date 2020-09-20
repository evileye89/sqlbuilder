package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import de.sqlbuilder.helper.IsolationOption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FromKeywordTest {

    @Test
    public void testFrom() {
        FromKeyword from = new FromKeyword(null, "USER");

        assertEquals(" FROM USER", from.format());
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtSelectFrom() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER", stmt
                .select("ID")
                .from("USER")
                .build());
    }

    @Test
    public void testStmtSelectFromIsolation() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WITH UR", stmt
                .select("ID")
                .from("USER")
                .with(IsolationOption.UR)
                .build());
    }

    @Test
    public void testStmtSelectFromWhere() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ?", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .build());
    }

    @Test
    public void testStmtSelectFromGroupBy() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER GROUP BY ID", stmt
                .select("ID")
                .from("USER")
                .groupBy("ID")
                .build());
    }

    @Test
    public void testStmtSelectFromOrderBy() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER ORDER BY ID ASC", stmt
                .select("ID")
                .from("USER")
                .orderBy("ID", "ASC")
                .build());
    }

}
