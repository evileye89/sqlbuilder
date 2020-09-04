package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    Assert.assertEquals("UPDATE USER SET ID=1", stmt
            .update("USER")
            .set("ID", "1")
            .build());
  }

}
