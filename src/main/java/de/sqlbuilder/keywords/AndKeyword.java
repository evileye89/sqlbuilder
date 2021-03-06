package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.*;

/**
 * AND Keyword formatting.
 */
public class AndKeyword extends KeywordImpl implements And, Or, GroupBy, OrderBy, Isolation {
    private final String column;
    private final String operator;
    private final String value;

    /**
     * Constructor.
     *
     * @param parent   previous keyword
     * @param column   column name
     * @param operator operator for where clause condition
     * @param value    value
     */
    public AndKeyword(Keyword parent, String column, String operator, String value) {
        super(parent);
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public String format() {
        return String.format(" AND %s %s %s", column, operator, value);
    }
}
