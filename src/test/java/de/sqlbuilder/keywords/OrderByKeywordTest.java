package de.sqlbuilder.keywords;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderByKeywordTest {

  @Test
  public void testOrderBy() {
    OrderByKeyword orderBy = new OrderByKeyword(null, "ID", "ASC");

    assertEquals(" ORDER BY ID ASC", orderBy.format());
  }

  @Test
  public void testOrderByMultiple() {
    OrderByKeyword orderBy = new OrderByKeyword(null, "ID", "ASC");

    Assert.assertEquals(", NAME DESC", orderBy.orderBy("NAME", "DESC").format());
  }

  //
  // INTEGRATION
  //

  @Test
  public void testStmtSelectFromOrderBy() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER ORDER BY ID ASC", stmt
            .select("ID")
            .from("USER")
            .orderBy("ID", "ASC")
            .build());
  }

  @Test
  public void testStmtSelectFromOrderByMultiple() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER ORDER BY ID ASC, NAME DESC", stmt
            .select("ID")
            .from("USER")
            .orderBy("ID", "ASC")
            .orderBy("NAME", "DESC")
            .build());
  }

}
