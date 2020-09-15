package de.sqlbuilder.helper;

import de.sqlbuilder.Statement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorsTest {

    @Test
    public void testOperatorEqual() {
        assertEquals("=", Operators.EQ);
    }

    @Test
    public void testOperatorPLUS() {
        assertEquals("+", Operators.PLUS);
    }

    @Test
    public void testOperatorMinus() {
        assertEquals("-", Operators.MINUS);
    }

    @Test
    public void testOperatorGreaterThan() {
        assertEquals(">", Operators.GT);
    }

    @Test
    public void testOperatorLessThan() {
        assertEquals("<", Operators.LT);
    }

    @Test
    public void testOperatorGreaterEqual() {
        assertEquals(">=", Operators.GE);
    }

    @Test
    public void testOperatorLessEqual() {
        assertEquals("<=", Operators.LE);
    }

    @Test
    public void testOperatorNotEqual() {
        assertEquals("<>", Operators.NE);
    }

    @Test
    public void testOperatorBetween() {
        assertEquals("BETWEEN", Operators.BETWEEN);
    }

    @Test
    public void testOperatorLike() {
        assertEquals("LIKE", Operators.LIKE);
    }

    @Test
    public void testOperatorIn() {
        assertEquals("IN", Operators.IN);
    }

    @Test
    public void testOperatorIs() {
        assertEquals("IS", Operators.IS);
    }

    @Test
    public void testOperatorNull() {
        assertEquals("NULL", Operators.NULL);
    }

    @Test
    public void testOperatorNotNull() {
        assertEquals("NOT NULL", Operators.NOTNULL);
    }

    //
    // INTEGRATION
    //

    @Test
    public void testStmtSelectFromWhereOperatorLike() {
        Statement stmt = new Statement();

        assertEquals("SELECT ID FROM USER WHERE NAME LIKE 'Jo%'", stmt
                .select("ID")
                .from("USER")
                .where("NAME", Operators.LIKE, "'Jo%'")
                .build());
    }

}
