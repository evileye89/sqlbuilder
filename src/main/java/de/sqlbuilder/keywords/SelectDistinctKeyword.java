package de.sqlbuilder.keywords;

import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.From;
import de.sqlbuilder.helper.ListHelper;

import java.util.Arrays;

/**
 * SELECT DISTINCT keyword formatting.
 */
public class SelectDistinctKeyword extends KeywordImpl implements From {
    private String[] columns;

    /**
     * Constructor.
     *
     * @param columns list of column names
     */
    public SelectDistinctKeyword(String... columns) {
        super(null);
        this.columns = columns;
    }

    @Override
    public String format() {
        String text = columns.length == 0 ? "*" : ListHelper.join(Arrays.stream(columns), ", ");

        return String.format("SELECT DISTINCT %s", text);
    }
}
