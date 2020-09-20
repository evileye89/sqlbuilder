package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.*;

/**
 * WHERE keyword formatting.
 */
public class WhereKeyword extends KeywordImpl implements And, Or, GroupBy, OrderBy, Isolation {
    private final String clause;

    /**
     * Constructor.
     *
     * @param parent   previous keyword
     * @param column   column name
     * @param operator operator for where clause condition
     * @param value    value
     */
    public WhereKeyword(Keyword parent, String column, String operator, String value) {
        super(parent);
        this.clause = formatClause(column, operator, value);
    }

    public WhereKeyword(Keyword parent, String clause) {
        super(parent);
        this.clause = clause;
    }

    private String formatClause(String column, String operator, String value) {
        return String.format("%s %s %s", column, operator, value);
    }

    @Override
    public String format() {
        return String.format(" WHERE %s", clause);
    }

    @Override
    public String toString() {
        return clause;
    }
}
