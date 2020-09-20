package de.sqlbuilder.keywords;

import de.sqlbuilder.helper.IsolationOption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsolationKeywordTest {
    
    @Test
    public void testIsolation() {
        IsolationKeyword isolation = new IsolationKeyword(null, IsolationOption.UR);

        assertEquals(" WITH UR", isolation.format());
    }
}
