package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertKeywordTest {

  @Test
  public void testInsertAll() {
    InsertKeyword insert = new InsertKeyword("USER");

    assertEquals("INSERT INTO USER", insert.format());
  }

  @Test
  public void testInsertColumn() {
    InsertKeyword insert = new InsertKeyword("USER", "ID");

    assertEquals("INSERT INTO USER (ID)", insert.format());
  }

  @Test
  public void testInsertColumns() {
    InsertKeyword insert = new InsertKeyword("USER", "ID", "NAME");

    assertEquals("INSERT INTO USER (ID, NAME)", insert.format());
  }

  //
  // INTEGRATION
  //

  @Test
  public void testStmtInsertAll() {
    Statement stmt = new Statement();

    Assert.assertEquals("INSERT INTO USER", stmt
            .insert("USER")
            .build());
  }

  @Test
  public void testStmtInsertColumn() {
    Statement stmt = new Statement();

    Assert.assertEquals("INSERT INTO USER (ID)", stmt
            .insert("USER", "ID")
            .build());
  }

}
