package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteKeywordTest {

    @Test
    public void testDelete() {
        DeleteKeyword delete = new DeleteKeyword();

        assertEquals("DELETE", delete.format());
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtDelete() {
        Statement stmt = new Statement();

        assertEquals("DELETE", stmt
                .delete()
                .build());
    }

    @Test
    public void testStmtDeleteFrom() {
        Statement stmt = new Statement();

        assertEquals("DELETE FROM USER", stmt
                .delete()
                .from("USER")
                .build());
    }
}
