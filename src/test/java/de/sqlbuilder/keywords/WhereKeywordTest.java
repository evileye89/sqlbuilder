package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhereKeywordTest {

    @Test
    public void testWhere() {
        WhereKeyword where = new WhereKeyword(null, "ID", "=", "?");

        assertEquals(" WHERE ID = ?", where.format());
    }

    @Test
    public void testWhereClause() {
        WhereKeyword where = new WhereKeyword(null, "ID = ?");

        assertEquals(" WHERE ID = ?", where.format());
    }

    //
    // INTEGRATION
    //

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
    public void testStmtSelectFromWhereClause() {
        WhereKeyword where = new WhereKeyword(null, "ID = ?");
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ?", stmt
                .select("ID")
                .from("USER")
                .where(where.toString())
                .build());
    }

    @Test
    public void testStmtSelectFromWhereAnd() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? AND NAME = ?", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .and("NAME", "=", "?")
                .build());
    }

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
    public void testStmtSelectFromWhereGroupBy() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? GROUP BY ID", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .groupBy("ID")
                .build());
    }

    @Test
    public void testStmtSelectFromWhereOrderBy() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE ID = ? ORDER BY ID ASC", stmt
                .select("ID")
                .from("USER")
                .where("ID", "=", "?")
                .orderBy("ID", "ASC")
                .build());
    }

}
