package de.sqlbuilder;

import de.sqlbuilder.keywords.*;

public class Statement {

    public InsertKeyword insert(String table, String... columns) {
        return new InsertKeyword(table, columns);
    }

    public SelectKeyword select(String... columns) {
        return new SelectKeyword(columns);
    }

    public SelectDistinctKeyword selectDistinct(String... columns) {
        return new SelectDistinctKeyword(columns);
    }

    public UpdateKeyword update(String table) {
        return new UpdateKeyword(table);
    }

    public DeleteKeyword delete() {
        return new DeleteKeyword();
    }
}
