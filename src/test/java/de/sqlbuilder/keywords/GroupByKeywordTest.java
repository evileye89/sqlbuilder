package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupByKeywordTest {

    @Test
    public void testGroupBy() {
        GroupByKeyword groupBy = new GroupByKeyword(null, "ID");

        assertEquals(" GROUP BY ID", groupBy.format());
    }

    @Test
    public void testGroupByMultiple() {
        GroupByKeyword groupBy = new GroupByKeyword(null, "ID", "NAME");

        assertEquals(" GROUP BY ID, NAME", groupBy.format());
    }

    //
    // INTEGRATION
    //

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
    public void testStmtSelectFromGroupByOrderBy() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER GROUP BY ID ORDER BY ID ASC", stmt
                .select("ID")
                .from("USER")
                .groupBy("ID")
                .orderBy("ID", "ASC")
                .build());
    }

}
