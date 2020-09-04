package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndKeywordTest {

  @Test
  public void testAnd() {
    AndKeyword and = new AndKeyword(null, "ID", "=", "?");

    assertEquals(" AND ID = ?", and.format());
  }

  //
  // INTEGRATION
  //

  @Test
  public void testStmtSelectFromWhereAnd() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER WHERE ID = ? AND NAME = ?", stmt
            .select("ID")
            .from("USER")
            .where("ID", "=", "?")
              .and("NAME", "=", "?")
            .build());
  }

  @Test
  public void testStmtSelectFromWhereAndAnd() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER WHERE ID = ? AND NAME = ? AND STATUS = 1", stmt
            .select("ID")
            .from("USER")
            .where("ID", "=", "?")
              .and("NAME", "=", "?")
              .and("STATUS", "=", "1")
            .build());
  }

  @Test
  public void testStmtSelectFromWhereAndOr() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER WHERE ID = ? AND NAME = ? OR STATUS = 1", stmt
            .select("ID")
            .from("USER")
            .where("ID", "=", "?")
              .and("NAME", "=", "?")
              .or("STATUS", "=", "1")
            .build());
  }

  @Test
  public void testStmtSelectFromWhereAndOrderBy() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER WHERE ID = ? AND NAME = ? ORDER BY ID ASC", stmt
            .select("ID")
            .from("USER")
            .where("ID", "=", "?")
              .and("NAME", "=", "?")
            .orderBy("ID", "ASC")
            .build());
  }

}
