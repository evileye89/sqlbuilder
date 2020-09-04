package de.sqlbuilder.helper;

import de.sqlbuilder.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorsTest {

  @Test
  public void testOperatorEqual() {
    Assert.assertEquals("=", Operators.EQ);
  }

  @Test
  public void testOperatorPLUS() {
    Assert.assertEquals("+", Operators.PLUS);
  }
  @Test
  public void testOperatorMinus() {
    Assert.assertEquals("-", Operators.MINUS);
  }

  @Test
  public void testOperatorGreaterThan() {
    Assert.assertEquals(">", Operators.GT);
  }

  @Test
  public void testOperatorLessThan() {
    Assert.assertEquals("<", Operators.LT);
  }

  @Test
  public void testOperatorGreaterEqual() {
    Assert.assertEquals(">=", Operators.GE);
  }

  @Test
  public void testOperatorLessEqual() {
    Assert.assertEquals("<=", Operators.LE);
  }

  @Test
  public void testOperatorNotEqual() {
    Assert.assertEquals("<>", Operators.NE);
  }

  @Test
  public void testOperatorBetween() {
    Assert.assertEquals("BETWEEN", Operators.BETWEEN);
  }

  @Test
  public void testOperatorLike() {
    Assert.assertEquals("LIKE", Operators.LIKE);
  }

  @Test
  public void testOperatorIn() {
    Assert.assertEquals("IN", Operators.IN);
  }

  @Test
  public void testOperatorIs() {
    Assert.assertEquals("IS", Operators.IS);
  }

  @Test
  public void testOperatorNull() {
    Assert.assertEquals("NULL", Operators.NULL);
  }

  @Test
  public void testOperatorNotNull() {
    Assert.assertEquals("NOT NULL", Operators.NOTNULL);
  }

  //
  // INTEGRATION
  //

  @Test
  public void testStmtSelectFromWhereOperatorLike() {
    Statement stmt = new Statement();

    Assert.assertEquals("SELECT ID FROM USER WHERE NAME LIKE 'Jo%'", stmt
            .select("ID")
            .from("USER")
            .where("NAME", Operators.LIKE, "'Jo%'")
            .build());
  }

}
