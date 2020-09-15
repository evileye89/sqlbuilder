package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateKeywordTest {

    @Test
    public void testUpdate() {
        UpdateKeyword update = new UpdateKeyword("USER");

        assertEquals("UPDATE USER", update.format());
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtUpdateSet() {
        Statement stmt = new Statement();

        assertEquals("UPDATE USER SET ID=1", stmt
                .update("USER")
                .set("ID", "1")
                .build());
    }

}
