package de.sqlbuilder.keywords;

import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.From;
import de.sqlbuilder.helper.StringHelper;

import java.util.Arrays;

/**
 * SELECT keyword formatting.
 */
public class SelectKeyword extends KeywordImpl implements From {
    private String[] columns;

    /**
     * Constructor.
     *
     * @param columns list of column names
     */
    public SelectKeyword(String... columns) {
        super(null);
        this.columns = columns;
    }

    @Override
    public String format() {
        String text = columns.length == 0 ? "*" : StringHelper.join(Arrays.stream(columns), ", ");

        return String.format("SELECT %s", text);
    }
}
