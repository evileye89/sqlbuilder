package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    Assert.assertEquals("SELECT *", stmt
            .select()
            .build());
  }

  @Test
  public void testStmtSelectColumns() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID, NAME", stmt
            .select("ID", "NAME")
            .build());
  }

  @Test
  public void testStmtSelectColumn() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER", stmt
            .select("ID")
            .from("USER")
            .build());
  }

}
