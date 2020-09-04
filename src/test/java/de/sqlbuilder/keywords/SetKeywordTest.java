package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetKeywordTest {

  @Test
  public void testSet() {
    SetKeyword set = new SetKeyword(null, "ID", "1");

    assertEquals(" SET ID=1", set.format());
  }

  @Test
  public void testSetMultiple() {
    SetKeyword set = new SetKeyword(null, "ID", "1");

    Assert.assertEquals(", NAME='John'", set.set("NAME", "'John'").format());
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

  @Test
  public void testStmtUpdateSetMultiple() {
    Statement stmt = new Statement();

    Assert.assertEquals("UPDATE USER SET ID=1, NAME='John'", stmt
            .update("USER")
            .set("ID", "1")
            .set("NAME", "'John'")
            .build());
  }

  @Test
  public void testStmtUpdateSetMultipleWhere() {
    Statement stmt = new Statement();

    Assert.assertEquals("UPDATE USER SET ID=1, NAME='John' WHERE ID = 1", stmt
            .update("USER")
            .set("ID", "1")
            .set("NAME", "'John'")
            .where("ID", "=", "1")
            .build());
  }

}
