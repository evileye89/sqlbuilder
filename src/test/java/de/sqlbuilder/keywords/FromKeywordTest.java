package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromKeywordTest {

  @Test
  public void testFrom() {
    FromKeyword from = new FromKeyword(null, "USER");

    assertEquals(" FROM USER", from.format());
  }

  //
  // INTEGRATION
  //

  @Test
  public void testStmtSelectFrom() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER", stmt
            .select("ID")
            .from("USER")
            .build());
  }

  @Test
  public void testStmtSelectFromWhere() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER WHERE ID = ?", stmt
            .select("ID")
            .from("USER")
            .where("ID", "=", "?")
            .build());
  }

  @Test
  public void testStmtSelectFromGroupBy() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER GROUP BY ID", stmt
            .select("ID")
            .from("USER")
            .groupBy("ID")
            .build());
  }

  @Test
  public void testStmtSelectFromOrderBy() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER ORDER BY ID ASC", stmt
            .select("ID")
            .from("USER")
            .orderBy("ID", "ASC")
            .build());
  }

}
