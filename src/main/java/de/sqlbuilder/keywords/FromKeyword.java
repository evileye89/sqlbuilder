package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.GroupBy;
import de.sqlbuilder.facade.Isolation;
import de.sqlbuilder.facade.OrderBy;
import de.sqlbuilder.facade.Where;

/**
 * FROM keyword formatting.
 */
public class FromKeyword extends KeywordImpl implements Where, GroupBy, OrderBy, Isolation {
    private String table;

    /**
     * Constructor.
     *
     * @param parent previous keyword
     * @param table  table name
     */
    public FromKeyword(Keyword parent, String table) {
        super(parent);
        this.table = table;
    }

    @Override
    public String format() {
        return String.format(" FROM %s", table);
    }
}
