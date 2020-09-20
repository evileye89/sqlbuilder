package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static de.sqlbuilder.helper.IsolationOption.CS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrKeywordTest {

    @Test
    public void testOr() {
        OrKeyword or = new OrKeyword(null, "ID", "=", "1");

        assertEquals(" OR ID = 1", or.format());
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtSelectFromWhereOr() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? OR NAME = ?", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .or("NAME", "=", "?")
                .build());
    }

    @Test
    public void testStmtSelectFromWhereOrWith() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? OR NAME = ? WITH CS", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .or("NAME", "=", "?")
                .with(CS)
                .build());
    }

    @Test
    public void testStmtSelectFromWhereOrOr() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? OR NAME = ? OR STATUS = 1", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .or("NAME", "=", "?")
                .or("STATUS", "=", "1")
                .build());
    }

    @Test
    public void testStmtSelectFromWhereOrAnd() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? OR NAME = ? AND STATUS = 1", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .or("NAME", "=", "?")
                .and("STATUS", "=", "1")
                .build());
    }

    @Test
    public void testStmtSelectFromWhereOrGroupByOrderBy() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? OR NAME = ? GROUP BY ID ORDER BY ID ASC", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .or("NAME", "=", "?")
                .groupBy("ID")
                .orderBy("ID", "ASC")
                .build());
    }

    @Test
    public void testStmtSelectFromWhereOrOrderBy() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? OR NAME = ? ORDER BY ID ASC", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .or("NAME", "=", "?")
                .orderBy("ID", "ASC")
                .build());
    }

}
