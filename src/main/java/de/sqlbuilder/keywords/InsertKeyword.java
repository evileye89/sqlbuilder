package de.sqlbuilder.keywords;

import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.Values;
import de.sqlbuilder.helper.ListHelper;

import java.util.Arrays;

/**
 * INSERT INTO keyword formatting.
 */
public class InsertKeyword extends KeywordImpl implements Values {
    private final String table;
    private final String[] columns;

    /**
     * Constructor.
     *
     * @param table   table name
     * @param columns list of column names
     */
    public InsertKeyword(String table, String... columns) {
        super(null);
        this.table = table;
        this.columns = columns;
    }

    @Override
    public String format() {
        if (columns.length == 0) {
            return String.format("INSERT INTO %s", table);
        } else {
            return String.format("INSERT INTO %s (%s)",
                    table,
                    ListHelper.join(Arrays.stream(columns), ", "));
        }
    }
}
